package ch14;

import java.util.Stack;

public class StackExam {
    public static void main(String[] args) {
        //Stack - LIFO Last In First Out

        String[] nation = {"한국", "일본", "중국", "미국", "영국"};
        Stack<String> s = new Stack<>();
        for (String str : nation) {
            s.push(str); //stack에 입력
        }
        System.out.println(s.pop()); //stack에서 pop으로 출력
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());

        while (!s.isEmpty()) { //stack이 비어이있지 않으면
            System.out.println(s.pop());
        }
    }
}
