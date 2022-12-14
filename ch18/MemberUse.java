package ch18;

//Stream : 데이터의 논리적 통로, 바이트 단위
//프로그램 ==> 외부자원 : 출력스트림
//프로그램 <== 외부자원 : 입력스트림


import java.io.*;

public class MemberUse {
    public static void main(String[] args) {
        FileOutputStream fos = null; //파일 저장
        ObjectOutput oos = null;//메모리에 있는 객체를 파일로 저장

        MemberDTO ma = new MemberDTO("kim", "killdong", "1234", 30, "kim@gmail.com");
        MemberDTO ma1 = new MemberDTO("hong", "hong", "1234", 20, "hong@gmail.com");
        MemberDTO ma2 = new MemberDTO("choi", "choi", "1234", 40, "choi@gmail.com");
        try {
            fos = new FileOutputStream("/Users/b9/Desktop/object.dat");
                    //serialization : 메모리 =>프로그램=>파일
            oos = new ObjectOutputStream(fos);
            oos.writeObject(ma); //ma객체를 파일에 저장
            oos.writeObject(ma1);
            oos.writeObject(ma2);
            System.out.println("Saved");
        } catch (Exception e) {
            e.printStackTrace();
        }
        //deserialization : 파일 => 프로그램 => 메모리 역직렬화
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try{
            fis = new FileInputStream("/Users/b9/Desktop/object.dat");
            ois = new ObjectInputStream(fis);
            MemberDTO dto1 = (MemberDTO)ois.readObject();
            MemberDTO dto2 = (MemberDTO)ois.readObject();
            MemberDTO dto3 = (MemberDTO)ois.readObject();
            System.out.println(dto1);
            System.out.println(dto2);
            System.out.println(dto3);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
