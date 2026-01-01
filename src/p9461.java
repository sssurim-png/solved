import java.io.*;

public class p9461 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        int max= 0;
        for(int i=0; i<N;i++){
            arr[i] = Integer.parseInt(br.readLine());
            if(max<arr[i]){
                max=arr[i];
            }
        }


        long[] brr =new long[max+1];

        if(max>=1){
            brr[1]=1;
        }
        if(max>=2){
            brr[2]=1;
        }



        for(int i=3; i<=max;i++){
            brr[i]=brr[i-2]+brr[i-3];
        } //바텀업 방식이고 하나만 구하는 로직이라서 제일 큰값을 구해야됐네
        //한번에 안되나 ->비효율적 DP에 어긋남. => max값으로 미리 구해놓고 꺼내써야 하는 것



        for(int i=0; i<N;i++){
            bw.write(String.valueOf(brr[arr[i]]));
            bw.newLine();
        }
        bw.flush();

    }
}

//P(0)은 존재하지 않으므로 i=4부터 시작하는 것이 정석이다
//때문에 인덱스[0]고정값, 점화식은 4부터 돌아간다

//////아래 정석
//import java.io.*;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int T = Integer.parseInt(br.readLine());
//
//        int[] arr = new int[T];
//        int max = 0;
//        for (int i = 0; i < T; i++) {
//            arr[i] = Integer.parseInt(br.readLine());
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//
//        long[] dp = new long[max + 1];
//
//        if (max >= 1) dp[1] = 1;
//        if (max >= 2) dp[2] = 1;
//        if (max >= 3) dp[3] = 1;
//
//        for (int i = 4; i <= max; i++) {
//            dp[i] = dp[i - 2] + dp[i - 3];
//        }
//
//        for (int i = 0; i < T; i++) {
//            bw.write(dp[arr[i]] + "\n");
//        }
//
//        bw.flush();
//    }
//}
