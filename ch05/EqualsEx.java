package ch05;

import java.util.Scanner;

public class EqualsEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("문자열을 입력하세요 : ");
            String str = sc.nextLine();
            if (str.equals("exit")){//문자형참조변수.equals(비교할문자)

                break;
            }else {
                System.out.println(str.length()+ "글자 입니다");
                //length() - 문자열에 대한 글자 수 반환하는 메소드(길이 값)
            }
        }
        System.out.println("프로그램 종료");
    }
}
