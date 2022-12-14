package ch06;

public class CalllEx {
    public static void test(int b){
        System.out.println("test method");
        System.out.println(b);
    }

    public static void test2 (int a){
        System.out.println(a);
    }


    public static void main(String[] args) {
        System.out.println("시작");
        int a = 10;
        test(a);//메소드호출 a 는 call by value형식 호출

        test2(a);
        System.out.println("끝");
    }



}
