import java.io.*;
import java.util.Arrays;

//가장 긴 증가하는  부분 수열4
public class p14002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        String[]  brr= br.readLine().split(" ");
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] =Integer.parseInt(brr[i]);

        }
        int[] dp = new int[N];

        for(int i=0; i<N;i++){
            dp[i] = 1;
        }//초기값. 어디서나 최소 길이 1이다

        for(int i=1; i<arr.length; i++){
            for(int j =0; j<i; j++){
                if(arr[i]>arr[j]){
                    dp[i] = Math.max(dp[i],dp[j]+1);//

                }

            }
        }
        int ans= 0;
        for(int i=0; i<arr.length;i++){
            ans=Math.max(ans, dp[i]);


        }
        bw.write(String.valueOf(ans));
        bw.flush();


        //10 20 10 30 20 50
//        1 1 1 1 1 1  dp[1]: 1 vs dp[0]+1 2=> 2
//        1 2 1 1 1 1  dp[3] : 1 vs dp[0]+1 2 => 2
//        1 2 1 1 1 1  dp[3] : 1 vs dp[1]+1 3=> 3
//        1 2 1 1 1 1  dp[3] : 1 vs dp[2]+1 => 2
//        1 2 1 3 1 1  dp[4] : 1 vs dp[0]+1 =>
//        1 2 1 3 1 1  dp[4] : 1 vs dp[1]+1 =>
//        1 2 1 3 1 1  dp[4] : 1 vs dp[2]+1 =>
//        1 2 1 3 1 1  dp[4] : 1 vs dp[3]+1 =>
//
//
//
//

    }
}


//        for(int i=1; i<arr.length; i++){
//        for(int j =0; j<i; j++){
//        if(arr[i]>arr[j]){
//        System.out.println("before === "+Arrays.toString(dp));
//        dp[i] = Math.max(dp[i],dp[j]+1);//
//                    System.out.println("after === "+Arrays.toString(dp));
//        }