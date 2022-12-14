package ch06;

public class voidExam {
    public static void main(String[] args) {
        System.out.println("프로그램 시작");
        hello();
        hello2();
        System.out.println("프로그램 끝");
    }

    public static void hello(){
        System.out.println("Hello?");
        return;//void인데 return을 쓰면 명시적으로 메소드를 종료한다는 의미
    }
    public static String hello2(){
        String hi = "Hello";
        return hi;
    }
}
