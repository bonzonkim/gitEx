package ch10;

public class PolymorphismEx {
    public static void main(String[] args) {
        int a = 10;
        double d = 20.1;
        char c = 'A';
        String b = "hello";

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        System.out.println("===");
        Object o ="whatt";//최상위 클래스는 모든 타입을 담을 수 있다
        System.out.println(o);
    }
}
