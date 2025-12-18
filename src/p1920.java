import java.io.*;
import java.util.Arrays;

public class p1920 {
    //    /////////수업문제
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");
        int[] arr8 = new int[N];
        for (int i = 0; i < N; i++) {
            arr8[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(arr8);

        int M = Integer.parseInt(br.readLine());

        String[] input2 = br.readLine().split(" ");
        int[] arr9 = new int[M];
        for (int i = 0; i < M; i++) {
            arr9[i] = Integer.parseInt(input2[i]);
        }


        for (int i = 0; i < M; i++) {
            int target = arr9[i];
            int index4 = Arrays.binarySearch(arr8, target);
            if(index4>=0){ //해당 값의 인덱스를 반환하는 것이기 때문// 인덱스 반환하면 있다는 뜻이지
               bw.write(String.valueOf("1"));
                bw.newLine();
            }else{
                bw.write(String.valueOf("0"));
               bw.newLine();
            }

        }
        bw.flush();
    }
}












