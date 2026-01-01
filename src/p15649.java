import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class p15649 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] st = br.readLine().split(" ");

        int N=Integer.parseInt(st[0]);
        int M=Integer.parseInt(st[1]);

        List<Integer>myList = new ArrayList<>();
        for(int i=1; i<=N;i++){
            myList.add(i);

        }

        List<List<Integer>>doubleList =new ArrayList<>();//1개씩만 출력하면 list한개, but 그이상
        permu(new boolean[myList.size()],M,myList, doubleList,new ArrayList<>());

        /// ////////////////20일 인터페이스, 람다 이해하기!!!!!!!
        Collections.sort(doubleList, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> a, List<Integer> b) {
                for (int i = 0; i < a.size(); i++) {
                    if (!a.get(i).equals(b.get(i))) {
                        return a.get(i) - b.get(i);
                    }
                }
                return 0;
            }
        });
        /// ////////////////20일 인터페이스, 람다 이해하기!!!!!!! 왜 이게 위험한지도!!!!!!!!

        for(List<Integer> list: doubleList){
            for(int i =0; i<list.size();i++){
                bw.write(list.get(i)+" ");
            }
            bw.newLine();
        }
        bw.flush();


    }

    public static void permu(boolean[]visit,int n, List<Integer>myList, List<List<Integer>>doubleList,List<Integer> temp) { //무조건 타입+이름
        if (temp.size() == n) {
            doubleList.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < myList.size(); i++) {
            if (visit[i]) continue;
            temp.add(myList.get(i));
            visit[i] = true;
            permu(visit, n, myList, doubleList, temp);
            temp.remove(temp.size() - 1);
            visit[i] = false;
        }
    }

}
