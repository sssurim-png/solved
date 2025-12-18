import java.util.Arrays;

public class proK {
    public static void main(String[] args) {

        int[] array={1, 5, 2, 6, 3, 7, 4};

        int[][] commands= {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}}; //첫자리, 끝자리, 번째수
        int[] a = new int[commands.length];
        int[][] temp = new int[commands.length][];
        for(int i=0; i<commands.length;i++){
                int[]arr = Arrays.copyOfRange(array,commands[i][0]-1,commands[i][1]);//사람기준의 2번째(인덱스 기준3번째)니까 1빼주기 // end에서는 어차피 미만이다
            Arrays.sort(arr);
//            temp[i]= arr; //i에 짤린 array 3개 들어가있음
            int k = arr[commands[i][2]-1];
            a[i] = k;

        }
        for (int i : a) { //돌면서 a의 k번째를 i로 sout
            System.out.println(i);
        }


//        int[] a= new int[temp.length];
//        for(int i=0; i< temp.length;i++){
//            int k= commands[i][2]-1; // index
//
//            a[i]=temp[i][k];
//
//                }
//        System.out.println(Arrays.toString(a));  //기존 제출 코드 // 그 위에는 리팩토링

            }


        }


       // int[] answer = {};
        //return answer;

