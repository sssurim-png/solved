import java.io.*;

public class p1259 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();

        while(!s.equals("0")){
            String reverse="";

            for(int i =s.length()-1; i>=0; i--){
                reverse= reverse+s.charAt(i);
            }
            if(s.equals(reverse)){
                bw.write("yes\n");
            }else{
                bw.write("no\n");

            }
            bw.flush();
            s= br.readLine();
        }
    }
}
