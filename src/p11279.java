import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class p11279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));

        int N =Integer.parseInt(br.readLine());
        int[] n = new int[N];

        Queue<Integer> qp=new PriorityQueue<>(Comparator.reverseOrder());

        for(int i =0; i<N;i++){
            n[i]=Integer.parseInt(br.readLine());
            if(n[i]==0) {
                if (qp.isEmpty()) {
                    bw.write("0");
                    bw.newLine();
                }else{
                bw.write(String.valueOf(qp.poll()));
                bw.newLine();}

            }else{
                qp.offer(n[i]);

        }//poll//peek//offer

            }
        bw.flush();
        }

        //0이면 최대값순으로 출력
        //0일때 출력할게 없으면 0출력
        //0이 아니면 offer

    }

