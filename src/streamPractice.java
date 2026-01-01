import java.util.Arrays;

public class streamPractice {
    public static void main(String[] args) {
        int[] intArr = {10,10,30,40,50};
        int total = Arrays.stream(intArr).filter(a->a>=30).sum();
        System.out.println(total);
        int total2 =Arrays.stream(intArr).map(a->a*a).sum();
        System.out.println(total2);


        int[] arr2 = {1,2,3,4,5,6};
        int[]result2=Arrays.stream(arr2).filter(a->a%2==1).toArray();
        int[]result3 = Arrays.stream(arr2).filter(a->a%2==1).map(a->a*a).toArray();


        int[] intArr2 = {10,20,30,40};
        Arrays.stream(intArr2).forEach(a-> System.out.println(a));

    }
}
