import java.util.PriorityQueue;
import java.util.Queue;

public class proScoville {
    public static void main(String[] args) {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;

        Queue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < scoville.length; i++) {
            pq.offer(scoville[i]);
        }
        int count = 0;
        while (pq.peek() < K && pq.size() >= 2) {
            int a = pq.poll(); //중간중간 add가 들어갈때 poll쓰는게 낫다 // 한번에 poll당길바에는 list쓰는게 낫다
            int b = pq.poll();
            int sum = a + b * 2;
            pq.offer(sum);
            count++;
        }

        if(pq.peek()<K){
            System.out.println(-1);
        }else {
            System.out.println(count);
        }
    }
}
//작아지면 break는 알아서 걸리고
//다 돌렸는데도 안커지면 -1반환


//        for(int i= 0; i<scoville.length;i++){
//            int a=pq.poll();
//            int b=pq.poll();
//            int sum = a+b*2;
//            while(sum>=k){
//                if()



// k보다 낮은 스코빌 지수를 가진 원소는 최소값순 배출
// a+b*2;하여 k넘을때 까지 반복
        //반복횟수 기록
        //불가능할 경우 -1 return






