package ch18;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStreamEx {
    public static void main(String[] args) {
        try{
            //binary file로 저장
            DataOutputStream dataout =
                    new DataOutputStream(new FileOutputStream("/Users/b9/Desktop/test.dat"));
            dataout.writeInt(123);
            dataout.writeChar('A');
            dataout.writeDouble(3.5);
            dataout.close();//스트림을 닫아야 파일이 완성됨
            System.out.println("SAVED");
            //binary file 읽기
            DataInputStream datain =
                    new DataInputStream(new FileInputStream("/Users/b9/Desktop/test.dat"));
            System.out.println(datain.readInt());
            System.out.println(datain.readChar());
            System.out.println(datain.readDouble());
            datain.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
