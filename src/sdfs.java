import java.io.*;


public class sdfs {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int L = Integer.parseInt(br.readLine());
        String s =br.readLine();
        long M=1234567891;
        long r=1;
        long hash = 0;

        for(int i= 0;i<L;i++){
            int t= s.charAt(i)-'a'+1;
            hash=(hash+t*r)%M;
            r=(r*31)%M;

        }
        System.out.println(hash);


    }
}