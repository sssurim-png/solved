import java.io.*;

public class p2839 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N =Integer.parseInt(br.readLine());

        int count =0;
        while(0<=N){

            if(N%5==0){
                count+=N/5;
                bw.write(String.valueOf(count));
                bw.flush();
                return;

            }
            N-=3;
            count++;//while이니까 5으로 나눠보고 안되면 3한개 빼고 다시 5으로 나눠보네 //3이 먼저가면 18때 6개

        }
        bw.write("-1");
        bw.flush();
    }
}
