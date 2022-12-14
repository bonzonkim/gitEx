package ch13;

public class Exam {
    public static void main(String[] args) {
        String a = "hello"; //string pool이라는 메모리영역에 저장됨
        System.out.println(System.identityHashCode(a));
        //identityHashCode = String 전용 객체주소 확인용 메소드
        String b = "hello";
        System.out.println(System.identityHashCode(b));
        System.out.println(a==b);

        String c = new String("hello");
        System.out.println(System.identityHashCode(c));
        String d = new String("hello");
        System.out.println(System.identityHashCode(d));
        //new통해 String객체 생성하면 새로운 주소값을 가진다
        System.out.println(c==d); //false
        System.out.println(c.equals(d));
    }
}
