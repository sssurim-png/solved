import java.io.*;

public class p1259_StringBuilder {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();


        while(!s.equals("0")){
            String reverse = new StringBuilder(s).reverse().toString();

            if(s.equals(reverse)) {
                bw.write("yes\n");
            }else{
                bw.write("no\n");
            }
            s= br.readLine();
            bw.flush();
        }

    }
}
