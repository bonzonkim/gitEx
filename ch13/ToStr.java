package ch13;

public class ToStr {
    public static void main(String[] args) {
        Object pbj = new Object();
        pbj = new Integer(20);
        //참조변수에는 원래 주소값이 들어가지만 jdk1.5이상엔 value가 들어갈 수 있도록
        //내부처리(intValue()등의 호출)하도록 함 Auto Boxing
        //pbj = 20;
        System.out.println(pbj); //Auto Unboxing 객체 =>일반
        pbj = new Double(20.5); // pbj = 20.5
        System.out.println(pbj);
        pbj = new String("hello");
        System.out.println(pbj);
    }

}
