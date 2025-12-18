import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class pro {
    public static void main(String[] args) {
        int[] numbers = {2, 1, 3, 4, 1};

        int a = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                a++;
            }
        }

        int[] num = new int[a];
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                num[index] = numbers[i] + numbers[j];
                index++;
            }
        }

        Set<Integer> mySet = new HashSet<>();


        for(int b: num){
            mySet.add(b);
        }

        int[] an =new int[mySet.size()];
        int index2=0;

        for(int b: mySet){
            an[index2]= b;
            index2++;
        }
        Arrays.sort(an);
        System.out.println(Arrays.toString(an));


    }
}