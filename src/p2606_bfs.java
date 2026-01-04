import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class p2606_bfs {
    static List<List<Integer>> list =new ArrayList<>();
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int[][] arr = new int[M][2];
        for(int i=0; i<M; i++){
            String[]st = br.readLine().split(" ");
            arr[i][0] =Integer.parseInt(st[0]);
            arr[i][1] =Integer.parseInt(st[1]);
        }

        int [] n= new int[N+1];
        for(int i=0; i<=N; i++){ //노드 객체 만들기
            list.add( new ArrayList<>());
        }

        for(int i=0; i<arr.length; i++){ //간선 연결
            int a =arr[i][0];
            int b =arr[i][1];
            list.get(a).add(b);
            list.get(b).add(a);
        }
        visited= new boolean[N+1];

        Queue<Integer>myQue =new LinkedList<>();
        myQue.add(1);
        visited[1] =true;

        int count =0;

        while(!myQue.isEmpty()){
            int temp = myQue.poll();

            for(int a: list.get(temp)){
                if(!visited[a]){
                    count++;
                    myQue.add(a);
                    visited[a]=true;
                }
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();



    }
}