import java.io.*;
import java.util.Arrays;

public class p1920error {
//    /////////수업문제
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N =Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");
        int[]arr8 =new int[N];
        for (int i = 0; i < N; i++) {
            arr8[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(arr8);

        int M =Integer.parseInt(br.readLine());
        String[] input2 = br.readLine().split(" ");
        int[]arr9 =new int[M];
        for (int i = 0; i < M; i++) {
                arr9[i] = Integer.parseInt(input2[i]);}


        for(int i=0; i<arr9.length;i++){
            int temp =0;
            for(int j=0; j<arr8.length;j++){
                if(arr9[i]==arr8[j]){
                    temp= 1;
                    break;
                }else{
                    temp=0;
                }

            }
            System.out.println(temp);






        }

    }
}

        /////////다시//////////!!!!!!!!!!!!!??










