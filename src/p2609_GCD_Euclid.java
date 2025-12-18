import java.io.*;

public class p2609_GCD_Euclid {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");
        int f = Integer.parseInt(arr[0]);
        int s = Integer.parseInt(arr[1]);

        int gcd = getgcd(f, s);

        bw.write(String.valueOf(gcd+"\n"));
        bw.write(String.valueOf(f*s/gcd+"\n"));
        bw.flush();

    }

        private static int getgcd(int num1, int num2){
        if(num1%num2 ==0) {
            return num2;
        } else {
            return getgcd(num2, num1 % num2);
        }

    }
}