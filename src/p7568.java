import java.io.*;

public class p7568 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N =Integer.parseInt(br.readLine());

        int[][]arr = new int[N][2];
        for(int i = 0; i<N; i++){
            String[] st = br.readLine().split(" ");
            arr[i][0]=Integer.parseInt(st[0]); //몸무게
            arr[i][1]=Integer.parseInt(st[1]); //키
        }

        for(int i =0; i<N; i++){
            int rank = 1;
            for(int j =0; j<N;j++){
                if(arr[i][0]<arr[j][0]&&arr[i][1]<arr[j][1]){
                    rank++;
                }
            }
            bw.write(String.valueOf(rank));
            bw.newLine();
        }
        bw.flush();
    }
}
