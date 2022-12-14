package ch18;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        //복사본 < ==(outputstream) 프로그램 <==(inputstream)
        String str = "";
        BufferedReader reader = null;
        BufferedWriter writer = null;

        String file1 = "/Users/b9/Desktop/sisi.txt" ;
        String file2 = "/Users/b9/Desktop/sisi2.txt";
                try{
                    reader = new BufferedReader(new FileReader(new File(file1)));
                    writer = new BufferedWriter(new FileWriter(new File(file2)));
                    while(true) {
                        str = reader.readLine();
                        if (str == null) break;
                        //파일을 기록할때 \r\n을 써줘야함
                        //\r = carriage return
                        writer.write(str + "\r\n");
                    }
                    System.out.println("Saved");
                }catch (IOException e){
                    e.printStackTrace();
                }finally {
                    try {
                        //리소스를 개별적으로 닫아주는게 좋다
                        if (reader != null) reader.close();
                    }catch (Exception e2){
                        e2.printStackTrace();
                    }
                    try {
                        //write게열은 버퍼를 닫지 않으면 저장이 안됨
                        if (writer != null) writer.close();
                    }catch (Exception e2){
                        e2.printStackTrace();
                    }
                }
    }
}
