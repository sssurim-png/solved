import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class proNumX {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};


        Stack<Integer> myStack = new Stack<>();

        for(int i: arr){
            if(myStack.isEmpty()){
                myStack.push(i);
            }else{
                if(myStack.peek()!=i){
                    myStack.push(i);
                }
            }
        }
        System.out.println(myStack);
    }
}
