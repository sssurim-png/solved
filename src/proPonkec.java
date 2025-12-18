import java.util.HashSet;
import java.util.Set;

public class proPonkec {
    public static void main(String[] args) {
        int[] nums = {3,3,3,2,2,4};

        Set<Integer> set = new HashSet<>();
        for(int i:nums){
        set.add(i);
        }

        int half =nums.length/2;

            if(half<=set.size()){
                System.out.println(half);
            }else{
                System.out.println(set.size());
            }
        }
}

// N/2만큼 데려갈 수 있다
// N/2안에서 최대한 많은 종류 데려가기
//if N/2 > 종류 =  답 중복 제거 후 값이 다른 숫자의 개수  // 둘다 중복제거
//if N/2 < 종류 =  답=N/2