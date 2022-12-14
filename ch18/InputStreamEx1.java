package ch18;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx1 {
    //Stream - 데이터의 논리적인통로
    // Stream객체들은 1byte단위로 스트림 처리하며, 영문,숫자,특수문자만 처리
    //InputStream
    //OutputStream
    public static void main(String[] args) {
        //프로그램 <= 키보드
        InputStream is = System.in; //System.in은 대표적 인풋스트림
        System.out.println("문자를 입력하세요 : ");
        try{//입출력,네트워크,DB는 예외처리가 필수적
            int code = is.read();//키보드로부터 1byte를 읽음
            System.out.println(code);
            char ch = (char)code;
            System.out.println("char  : "+ch);
        }catch (IOException e){ //입출력관련 예외처리
            e.printStackTrace();
        }
    }
}
