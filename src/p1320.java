import java.io.*;
import java.util.*;

public class p1320 {
    public static void main(String[] args)throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[]arr =new String[N];

        for(int i=0; i<N; i++){
            arr[i] = br.readLine();
        }
        Map<String,Integer> myMap =new HashMap<>();

        for(String a: arr){
            if(myMap.containsKey(a)){
                myMap.put(a,myMap.get(a)+1);
            }else{
                myMap.put(a,1);
            }
        }

        int max = Integer.MIN_VALUE;
        String maxKey ="";
        for(String b: myMap.keySet()){
            int v = myMap.get(b);
            if(v>max){
                max=v;
            }
        }
        List<String>list =new ArrayList<>();
        for(String c : myMap.keySet()){
            int value=myMap.get(c);
            if(max==value){
                list.add(c);
            } //value값으로 key값 찾아간거
        }
        list.sort(Comparator.naturalOrder());
        System.out.println(list.get(0));
    }
}
