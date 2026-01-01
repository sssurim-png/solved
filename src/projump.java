public class projump {
    public static void main(String[] args) {
        int n =4;

        long[]dp =new long[n+1];
        if(n>=1){
        dp[1]=1;
        }
        if(n>=2){
            dp[2] =2;
        }
        for(int i=3; i<dp.length;i++){
            dp[i] =(dp[i-1]+dp[i-2])%1234567;
        }

        System.out.println (dp[n]);
    }


}
