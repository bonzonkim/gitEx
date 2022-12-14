package ch18;

import java.io.RandomAccessFile;

public class RandomFile {
    public static void main(String[] args) {
        String str = null;
        try{//r:read only w: write only rw: read and write
            RandomAccessFile file =
                    new RandomAccessFile("/Users/b9/Desktop/rand.txt", "rw");
            //getFilePointer():파일포인터 파일을 어디까지 읽었는지 가리킴
            System.out.println(file.getFilePointer());
            file.seek(8);//8번째 인덱스부터
            System.out.println(file.getFilePointer());//8
            //인덱스8에서 기존내용을 덮어씀
            file.write("HTML".getBytes());
            System.out.println(file.length());
            //문자길이 확인 한글은 3byte
            System.out.println(file.getFilePointer());
            while (file.getFilePointer() < file.length()) {
                //파일 내용보다 포인터의 위치값이 적으면 반복
                str = file.readLine();
                //new String(문자열,캐릭터셋)//인코딩방식 변환
                //String.getBytes() -스트링을 바이트 배열로 변환
                //8859_1 : 서유럽언어 인코딩 방식
                //utf -8 : 3Byte
                str = new String(str.getBytes("8859_1"), "utf-8");
            }
            System.out.println(file.length());
            System.out.println(file.getFilePointer());
            file.close();
            System.out.println("Saved");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
