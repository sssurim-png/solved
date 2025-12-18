import java.io.*;
import java.util.PriorityQueue;
import java.util.Queue;

public class p1927 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] n = new int[N];

        Queue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < N; i++) {
            n[i] = Integer.parseInt(br.readLine());
            if (n[i]== 0) {
                if (pq.isEmpty()) {
                    bw.write("0");
                    bw.newLine();
                } else {
                    bw.write(String.valueOf(pq.poll()));
                    bw.newLine();
                }
            }else {
                pq.offer(n[i]);
            }


        }
            bw.flush();
        }

    }


//0아니면 add
//0이면 앞에꺼 정렬해서 최소값 순으로 출력
//0인데 앞에 값 없으면 0으로 출력