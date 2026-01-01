import java.io.*;


public class p1149 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[][] cost = new int[N][3];


        for(int i=0; i<N; i++){
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < 3; j++) {
                cost[i][j] = Integer.parseInt(input[j]);
            }
        }

        int[][] dp =new int[N][3];
        for(int j = 0; j<3; j++){
            dp[0][j] =cost[0][j];
        } //첫번째 집//rgb뭐쓸건지 선택 아직 안한거

        for(int i =1; i <N; i++){ //두번째집이라서 1시작
            for(int j =0; j<3; j++){ //색 돌림 R일때
                int min = Integer.MAX_VALUE; //최소화 비교를 위해 제일 큰 값으로 초기화

                for(int k=0; k<3;k++){ //이전 집의 색 R은 패스, G,B돌아감 ////dp i번째 집의 j의 0,1,2돌기(R,G,B)
                    if(j==k) continue; //j==k: 현재집(i)과 이전 집(i-1)색 같아진다=> pass //dp i번째 집의 k의 0,1,2돌기(R,G,B)
                    min =Math.min(min,dp[i-1][k]); //j =현재색, k = 현재색을 제외하고 이전집에 넣어보는 색의 최소비용 비교

                }
                dp[i][j]=min +cost[i][j];
            }
        }

        int answer =Math.min(dp[N-1][0],Math.min (dp[N-1][1],dp[N-1][2]));
        bw.write(String.valueOf(answer));
        bw.flush();

    }
}

//원래 이문제는 하드 코딩으로 푼다
//dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2]) + cost[i][0]; //
//dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2]) + cost[i][1];
//dp[i][2] = Math.min(dp[i-1][0], dp[i-1][1]) + cost[i][2];








/// ///재귀+dp
//import java.io.*;
//
//public class Main {
//
//    static int N;
//    static int[][] cost;
//    static int[][] dp; // dp[i][prevColor]
//
//    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        N = Integer.parseInt(br.readLine());
//        cost = new int[N][3];
//        dp = new int[N][3];
//
//        for (int i = 0; i < N; i++) {
//            String[] input = br.readLine().split(" ");
//            for (int c = 0; c < 3; c++) {
//                cost[i][c] = Integer.parseInt(input[c]);
//                dp[i][c] = -1; // 메모이제이션 초기화
//            }
//        }
//
//        int result = Math.min(
//                dfs(0, 0),
//                Math.min(dfs(0, 1), dfs(0, 2))
//        );
//
//        bw.write(String.valueOf(result));
//        bw.flush();
//    }
//
//    // i번째 집을 prevColor로 칠했을 때의 최소 비용
//    static int dfs(int i, int prevColor) {
//        if (i == N) return 0;
//
//        if (dp[i][prevColor] != -1) {
//            return dp[i][prevColor];
//        }
//
//        int min = Integer.MAX_VALUE;
//
//        for (int color = 0; color < 3; color++) {
//            if (color == prevColor) continue; // ❗ 직전 색만 금지
//            min = Math.min(min, cost[i][color] + dfs(i + 1, color));
//        }
//
//        return dp[i][prevColor] = min;
//    }
//}
