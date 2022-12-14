package ch18;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class OutputStreamWriteEx {
    public static void main(String[] args) {
        PrintStream ps = System.out;
        OutputStream os = ps;
        OutputStreamWriter osw = new OutputStreamWriter(os);//2byte처리
        try{
            osw.write(44032); //가
            osw.write("나다라");
            osw.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
