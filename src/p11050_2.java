import java.io.*;

public class p11050_2 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        String[] st = br.readLine().split(" ");
        int N = Integer.parseInt(st[0]);
        int K = Integer.parseInt(st[1]);

        int result=1;

        for(int i=1; i<=K;i++){
            result = result*(N-i+1)/i;
        }
        bw.write(String.valueOf(result));
        bw.flush();







        }
    }


// 둘로 나눠 계산한 것
//int numerator = 1;   // 분자
//for (int i = 0; i < K; i++) {
//numerator *= (N - i);     // N, N-1, N-2, ... , N-K+1
//        }
//
//int denominator = 1; // 분모 = K!
//for (int i = 1; i <= K; i++) {
//denominator *= i;
//}
//
//int result = numerator / denominator;