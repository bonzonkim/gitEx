package ch13;

public class AutoBox {
    public static void main(String[] args) {
        //기본자료형
        int num1 = 10;
        int num2;
        //참조자료형
        Integer i1;//i1 = nil
        Integer i2 = new Integer(20); //auto Boxing

        i1 = num1; //기본자료형 int와 객체자료형 Wrapper Class Integer는 호환됨
        num2 = i2; //auto unboxing(객체 안에 들어있는 값을 풀어서 저장)

        System.out.println(num1+" "+i1);
        System.out.println(num2+" "+i2);
    }
}
