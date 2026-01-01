import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class p2751_2 {
        public static void main(String[] args)throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int N= Integer.parseInt(br.readLine());
            Set<Integer> set = new HashSet<>();
            for(int i=0; i<N; i++) {
                set.add(Integer.parseInt(br.readLine()));


            }

            bw.flush();

        }
}
