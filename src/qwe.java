import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class qwe { //진경님꺼
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer tokens = new StringTokenizer(str);
        int n = Integer.parseInt(tokens.nextToken());
        long m = Long.parseLong(tokens.nextToken());
        str = br.readLine();
        tokens = new StringTokenizer(str);
        long[] arr = new long[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(tokens.nextToken());
        }
        long start =0;//가능한 나무의 높이 범위를 지정해줍니다
        long end = 1000000000;
        while(start<=end){
            long idx = (start + end) /2;//중간값을 구합니다
            long tree =0;
            for(int i=0;i<n;i++){
                long gap = arr[i]-idx;
                if(gap>=0){
                    tree+= gap;//중간값에 대한 가져갈 수있는 나무의 길이를 구합니다
                }
            }
            if (tree>=m){//가져가야하는 길이보다 크다면 절단기 높이를 높혀줍니다.
                start = idx+1;
            }
            else {//작다면 더 많이 잘라야하므로 절단기 높이를 낮춰줍니다
                end = idx-1;
            }
        }
        System.out.println(end);//최댓값을 출력해줍니다
        br.close();
    }
    public static void main(String[] args) throws IOException {
        solution();
    }
}