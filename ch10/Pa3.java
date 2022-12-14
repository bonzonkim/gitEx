package ch10;

class Poly3 {
    int num = 10;
    String name = "홍길동";
    String mail = "hong@gmail.com";
    public void print(){
    }

}

class Ch3 extends Poly3{
    String ph = "010-1234-5678";
    String addr = "서울시 강남구 역삼동";

    public void print(){
        System.out.println("사번 : " + num);
        System.out.println("이름 : " + name);
        System.out.println("이메일 : "+mail);
        System.out.println("전화번호 : " + ph);
        System.out.println("주소 : "+addr);
    }
}
public class Pa3 {
    public static void main(String[] args) {
      Poly3 p = new Ch3();
      p.print();

    }
}
