package ch18;

import java.io.*;

public class FileCopy2 {
    public static void main(String[] args) {
        OutputStream os = null;
        BufferedReader reader = null;
        BufferedWriter writer = null;
        String str = "";

        try{
            os = new FileOutputStream("/Users/b9/Desktop/abc.txt");
            System.out.println("입력하세요 : ");
            while(true){
                int ch = System.in.read();
                if (ch == 10) break; //맥 기준 엔터 키 코드 10
                os.write(ch);
            }
            System.out.println("[파일이 저장되었습니다.]");
        }catch (IOException e){
            e.printStackTrace();
        }
        try{
            reader = new BufferedReader(new FileReader( "/Users/b9/Desktop/abc.txt"));
            writer = new BufferedWriter(new FileWriter( "/Users/b9/Desktop/abcCopy.txt"));
            while (true){
                str = reader.readLine();
                if (str == null) break;
                writer.write(str + "\r\n");
                System.out.println("[파일 복사가 완료되었습니다.]");
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally{
            try{
                if (reader != null) reader.close();
            }catch (Exception e){
                e.printStackTrace();
            }try{
                if (writer != null) writer.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
