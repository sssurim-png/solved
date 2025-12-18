import javax.swing.*;
import java.io.*;

public class p2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");
        int A = Integer.parseInt(arr[0]);
        int B = Integer.parseInt(arr[1]);
        int V = Integer.parseInt(arr[2]);
        int dqy=0;

        dqy=(V-B-1)/(A-B)+1;

        bw.write(String.valueOf(dqy));
        bw.flush();

}
}