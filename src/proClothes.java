import java.util.HashMap;
import java.util.Map;

public class proClothes {
    public static void main(String[] args) {
        String[][] clothes={{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};

        Map<String,Integer> myCloth= new HashMap<>(); //String,String언제 쓰는지 알기!!!!!!!!!!!!!!!!!!!물어보기!!!!!!!

        for(String[] a: clothes){
            String type = a[1]; //옷 종류 // 배열 a에 대한 1번 인덱스
            if(myCloth.containsKey(type)){
                myCloth.put(type,myCloth.get(type)+1);
            }else{
                myCloth.put(type,1);
            }
        }
        int result =1;
        for(int i : myCloth.values()){
            result=result*(i+1);
        }
        System.out.println(result-1);

    }
}
