package ch18;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileWrite {
    //프로그램 ==> 파일(출력스트림이 필요)
    public static void main(String[] args) {
        OutputStream os = null;
        try{
            os = Files.newOutputStream(Paths.get("/Users/b9/Desktop/sisi.txt"));
            System.out.println("입력하세요 : ");
            while (true) {
                int ch = System.in.read();
                os.write(ch);
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
