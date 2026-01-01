import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class p2210 {

    static List<List<Integer>> list = new ArrayList<>();
    static  int[][] arr = new int[5][5];
    static int [] dx ={-1,1,0,0};
    static int [] dy ={0,0,-1,1};
    static Set<String > answer = new HashSet<>(); //같은 값 제거

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



        for (int i = 0; i < arr.length; i++) {
            String[] temp = br.readLine().split(" ");
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = Integer.parseInt(temp[j]);

            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                dfs(i, j, ""); //시작점
            }

        }
        bw.write(String.valueOf(answer.size()));
        bw.flush();
    }
    static void dfs(int x,int y, String temp){ //네방향
        if(temp.length()==6){
            answer.add(temp);
            return;
        }

        for(int k =0; k<4;k++){//네방향이라
            int nx= x+dx[k];
            int ny= y+dy[k];
            if(nx>=0&& ny>=0 && nx<arr.length && ny<arr[0].length){
                dfs(nx,ny, temp+arr[x][y]);//현재숫자에다가 더해서 넘겨준다
            }
        }
    }



}
