import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class p10773 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int K = Integer.parseInt(br.readLine());

        List<Integer> list =new ArrayList<>();

        for(int i= 0; i<K; i++){
            int a = Integer.parseInt(br.readLine());
            if(a!=0) {
                list.add(a);
            }else{
                list.remove(list.size()-1);
            }
        }
        int sum= 0;
        for(int a : list){
            sum+=a;
        }
        bw.write(String.valueOf(sum));
        bw.flush();
    }
    }
