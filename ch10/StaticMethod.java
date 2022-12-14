package ch10;

public class StaticMethod {
    static int a = 10;
    int b = 20;

    public static void printA(){
        System.out.println(a);
        StaticMethod m = new StaticMethod();
        //static 메소드라 non-static member 호출 시 객체생성 필요
        System.out.println(m.b);
    }

    public void printB(){
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        printA();
        StaticMethod m = new StaticMethod();
        m.printB();
    }
}
