package ch18;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class OutputStreamEx {
    public static void main(String[] args) {
        PrintStream ps = System.out;
        OutputStream os = ps; //PrintStream객체를 부모타입인 Output으로 처리
        //OutputStream도 1byte처리 스트림
        try{
            os.write(97);
            os.write(98);
            os.write(99);
            os.flush();//output은 flush를 같이 써줘야 함
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
