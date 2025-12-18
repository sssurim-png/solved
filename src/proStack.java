import java.util.Stack;

public class proStack {
    public static void main(String[] args) {
        String s="()()";
        boolean answer = true;

        Stack<Character>myStack =new Stack<>();
        for(char c: s.toCharArray()){
            if(c=='('){
                myStack.push(c);
            }else{
                if(myStack.isEmpty()){
                    answer=false;
                    break;
                }
                myStack.pop();
            }


            }
        if(!myStack.isEmpty()){
            answer=false;
        }
        System.out.println(answer);


        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.


//        return answer;
    }
    }

