import java.io.*;

public class p2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");
        int f = Integer.parseInt(arr[0]);
        int s = Integer.parseInt(arr[1]);
        int N=1;

        for (int i = 1; i <= Math.min(f, s); i++) {
            if (f % i == 0 && s % i == 0) {
                N=i;
            }

        }
        bw.write(String.valueOf(N)+"\n");

        int m=f*s/N;
        bw.write(String.valueOf(m)+"\n");
        bw.flush();

    }
}