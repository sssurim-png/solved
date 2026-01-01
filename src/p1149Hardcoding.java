import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class p1149Hardcoding {


        public static void main(String[] args) throws Exception {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int N = Integer.parseInt(br.readLine());

            int[][] cost = new int[N][3];
            int[][] dp = new int[N][3];

            for (int i = 0; i < N; i++) {
                String[] s = br.readLine().split(" ");
                cost[i][0] = Integer.parseInt(s[0]); // R
                cost[i][1] = Integer.parseInt(s[1]); // G
                cost[i][2] = Integer.parseInt(s[2]); // B
            }

            // 0번째 집 초기값
            dp[0][0] = cost[0][0];
            dp[0][1] = cost[0][1];
            dp[0][2] = cost[0][2];

            // DP
            for (int i = 1; i < N; i++) {
//                System.out.println("i값: "+i+" 전: "+ Arrays.toString(dp[i]));
                dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2]) + cost[i][0];
                dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2]) + cost[i][1];
                dp[i][2] = Math.min(dp[i-1][0], dp[i-1][1]) + cost[i][2];
//                System.out.println("i값: "+i+" gn: "+Arrays.toString(dp[i]));
            }

            int answer = Math.min(dp[N-1][0],
                    Math.min(dp[N-1][1], dp[N-1][2]));

//            System.out.println(answer);
            bw.write(String.valueOf(answer));
            bw.flush();

        }
    }

