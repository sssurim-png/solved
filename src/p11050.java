import java.io.*;

public class p11050 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        String[] st = br.readLine().split(" ");
        int N = Integer.parseInt(st[0]);
        int K = Integer.parseInt(st[1]);

        int NK=N-K;

        int Nn =1;
        for(int i=1; i<=N;i++){
            Nn *= i;

        }
        int Kk =1;
        for(int i=1; i<=K;i++){
            Kk *= i;
        }
        int nk =1;
        for(int i=1; i<=NK;i++){
            nk *= i;
        }

        int sum = Nn/(Kk*nk);
        bw.write(String.valueOf(sum));
        bw.flush();




        }
    }

