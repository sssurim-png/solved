import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class proQuad {
    public static void main(String[] args) {
        int[][] sizes={{60, 50}, {30, 70}, {60, 30}, {80, 40}};

        Queue<Integer> swallet = new PriorityQueue<>(Comparator.reverseOrder());
        //i와 j에서 최대값 peek
        //
        //i,j최대값 안나온 곳에서 최대값 peek, 인덱스 찾고
        // 반대편이 작다면 인덱스 뒤집어서도 큰값인지 알기
        //찾으면 *
        for(int i=0; i< sizes.length; i++){
            for(int j=0; j<sizes[i].length;j++){

            }
        }

    }
}
