import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class p1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T= Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();

        for(int i=0; i<T; i++){
            String s= br.readLine();
            list.add(s);



        }
        list.sort((a,b)-> {  //람다식 ㄷㄷ
            if (a.length() == b.length()) {
                return a.compareTo(b); //길이 같으면 알파벳 순 정렬(a~z)
            }
            return a.length() - b.length();// 길이가 짧은 순
        }); //괄호 뭐냐 ㄷㄷ

        String asd="";
        for(String str: list) {
            if (!str.equals(asd)) {
                bw.write(str);
                bw.newLine();
                asd=str;
            }
        }
bw.flush();

}
}

