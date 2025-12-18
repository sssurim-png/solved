import java.io.*;

public class p2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        while (N-- > 0) {

        int k = Integer.parseInt(br.readLine()); //층
        int n = Integer.parseInt(br.readLine()); //호수

        int[][] arr = new int[k+1][n+1];

        for (int i = 1; i <= n; i++) {
            arr[0][i] = i; //0층 호수 별 사는 인원
        }
        for (int i = 0; i <= k; i++) {
            arr[i][1] = 1; //i층의 1호수는 1명
        }
        for (int i = 1; i <= k; i++) {
            for (int j = 2; j <= n; j++) {
                arr[i][j] = arr[i][j - 1] + arr[i - 1][j];
            }
        }
        bw.write(String.valueOf(arr[k][n] +"\n"));

    }
        bw.flush();



}}