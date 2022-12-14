package ch18;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderEx1 {
    //InputStream - 1byte단위로 읽음
    //InputStream Reader - 문자단위 2byte로읽음
    public static void main(String[] args) {
        InputStream is = System.in;
        //new ~Reader(Stream계열)
        InputStreamReader isr = new InputStreamReader(is);
        System.out.println("한글자를 입력하세요");
        try{
            int code = isr.read();
            System.out.println("code : "+code);
            char ch = (char)code;
            System.out.println("char : "+ch);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
