import java.io.*;

public class p1546 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        double[] num =new double[N];
        double M= 0;
        double sum =0;

        for(int i=0; i<N; i++){
            num[i]=Integer.parseInt(arr[i]);
            if(M<num[i]){
                M = num[i];
            }
        }
        for(int i=0; i<N; i++) {
            num[i] = num[i] / M * 100;
            sum = sum + num[i];
        }
        double a= sum/N;
        bw.write(String.valueOf(a));
        bw.flush();

    }
}
