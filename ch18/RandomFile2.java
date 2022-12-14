package ch18;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;

public class RandomFile2 {
    public static void main(String[] args) {
        String str = null;
        //UserID : Kim 파일을 생성후 바로 Park로 바꿈
        try{
            OutputStream os = new FileOutputStream("/Users/b9/Desktop/rand2.txt");
            System.out.print("입력 : ");
            while (true) {
                int fileInput = System.in.read();
                if(fileInput == 10) break;
                os.write(fileInput);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        try{
            RandomAccessFile file = new RandomAccessFile("/Users/b9/Desktop/rand2.txt","rw");
            file.seek(9);
            file.write("Park".getBytes());
            while (file.getFilePointer() < file.length()) {
                str = file.readLine();
                str = new String(str.getBytes("8859_1"), "utf-8");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
