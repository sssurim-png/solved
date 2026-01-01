import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class p10773_Deque {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int K = Integer.parseInt(br.readLine());

        Deque<Integer> dq =new ArrayDeque<>();

        for(int i= 0; i<K; i++){
            int a = Integer.parseInt(br.readLine());
            if(a!=0) {
                dq.offerFirst(a);
            }else{
                dq.pollFirst();
            }
        }
        int sum= 0;
        for(int a : dq){
            sum+=a;
        }
        bw.write(String.valueOf(sum));
        bw.flush();
    }
    }
