import java.io.*;

public class p2579 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N + 1];
        for (int i = 1; i <= arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int[] dp = new int[N + 1];
        dp[0] = 0;
        if (N >= 1) {
            dp[1] = arr[1];
        }
        if (N >= 2) {
            dp[2] = arr[1] + arr[2];
        }

//        if(N==1){ //if를 깔아줘야되나?
//        System.out.println(arr[1]);
//      }else(N==2){
//      System.out.println(arr[1] + arr[2]);
//      }else{
//        dp[1]=arr[1];
//        dp[2]=arr[1]+arr[2];
//         1)dp[n-2]+arr[n] // 2)dp[n-3]+arr[n-1]+arr[n]
//        1과 2의 max값을 dp[n]세팅
//
        for(int i=3; i<=N;i++){
            dp[i]= arr[i]+ Math.max(arr[i-1]+dp[i-3], dp[i-2]);
        }

        bw.write(String.valueOf(dp[N]));
        bw.flush();


        }

    }

