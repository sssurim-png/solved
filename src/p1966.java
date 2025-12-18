import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class p1966 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        while(T-->0){
            String[] st= br.readLine().split(" ");
            int N= Integer.parseInt(st[0]);
            int M= Integer.parseInt(st[1]);

            String[] b= br.readLine().split(" ");
            int[] num=new int[N];

            for(int i=0; i<N;i++){
            num[i]= Integer.parseInt(b[i]);
        }
            Deque<Integer> dq = new ArrayDeque<>();
            for(int i = 0; i<N; i++){
                dq.offer(i);
            }
            int count =0;

            while(true){
                int idx = dq.poll();
                int importance = num[idx];
                boolean hasHigher=false;

                for(int j:dq){
                    if(num[j]>importance){
                        hasHigher=true;
                        break;
                    }
                }
                if(hasHigher){
                    dq.offer(idx);
                    }else{
                    count++;
                    if(idx==M){
                        bw.write(count+"\n");
                        break;
                    }
                }
                }
            }
        bw.flush();

    }
}
