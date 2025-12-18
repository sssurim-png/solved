import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.regex.Pattern;

public class programusL {
    public static void main(String[] args)throws IOException { /// ///////////////////////////다시!!!!!!!!!!!!!!!!!!
//        String my_string = "abcdef";
//        String letter = "f";
//        String answer = " ";
//        for (char ch : my_string.toCharArray()) {
//            if (ch != letter.charAt(0)) {
//                answer += ch;
//            }
//        }
//        System.out.println(answer);
//    }}
//       "abcde": 결과
//    if,for문 //문자열 하나 빼기


//substring(a,b): a이상 b미만의 index의 문자를 잘라 문자열로 반환
//String st1 = "hello world";
//        System.out.println(st1.substring (0, 5)); //5미만 hello
//        System.out.println(st1.substring (6, st1.length())); //worle 끝자리는 length

//        String s = "abcde";////////////!!!!!!!!!!!!!다시!!!! char도
//        String answer = "";
//        if(s.length()%2==0){
//            answer=s.substring((s.length()/2-1, s.length()/2+1);
//
//
//        }else{
//            answer =s.substring(s.length()/2,s.length()/2+1);
//        }
//


        //trim,trip: 문자열 양쪽 끝의 공백 제거
//        String st1 = " hello world ";
//        String st2 = st1.trim();
//        String st3 = st1.strip();
//        System.out.println(st2);
//        System.out.println(st3);

//        toUpperCase: 모든 문자열을 대문자로 변환, toLowerCase: 소문자로 변환
//        String st1 = "Hello";
//        String st2 = st1.toUpperCase();
//        String st3 = st1.toLowerCase();
//        System.out.println(st2);
//        System.out.println(st3);
//        System.out.println(st1);

//        replace(a, b): a문자열을 b문자열로 대체
//        String st1 = " hello world world";
//        String st2 = st1.replace("world", "java");
//        System.out.println(st2);

//        replace All: replace와 사용법 동일. 정규표현식을 쓸 수 있는점이 차이점
//        String st1 = "01abC123   한글123";
////        한글제거
//        String answer1 =st1.replaceAll(/*한글을 의미하는 정규표현식*/"[가-힣]", "");
//        System.out.println(answer1);
////        알파벳소문자제거
//        String answer2 =st1.replaceAll("[a-z]", "");
//        System.out.println(answer2);
////        알파벳제거
//        String answer3 = st1.replaceAll("[A-Za-z]","");
//        System.out.println(answer3);
////        공백제거
//        String answer4 = st1.replaceAll(" ","");
//        System.out.println(answer4);
//
//        String answer5 = st1.replaceAll("\\s+","");
//        System.out.println(answer5);

//        전화번호 검증
//        String number = "010-1234-1234";
//        boolean check = number.matches("^\\d{3}-\\d{4}-\\d{4}$"); //시작과 끝을 알리는 것^$, \\d숫자 시작한다
//        if(check==false){
//            System.out.println("형식이 잘 못 됐습니다. 다시 입력해주세요.");
//        }
//        System.out.println("형식 완");


//        이메일 검증
        String email = "abc1234@naver.com"; //다른거 잘못써놓으면 false
        boolean check = Pattern.matches("^[a-z0-9]+@[a-z]+.com$",email);
        System.out.println(check);
    }
}










