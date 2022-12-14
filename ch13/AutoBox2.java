package ch13;

public class AutoBox2 {
    public static void main(String[] args) {
        int num1 = 30;
        int num2;
        int num3 = 50;

       Integer i1 = num1;
       Integer i2 = new Integer(40);
       Integer i3 = num3;

       num2 = i2;
        System.out.println("기본자료형 : "+num1+"\t\t"+"참조자료형 : "+i1);
        System.out.println("기본자료형 : "+num2+"\t\t"+"참조자료형 : "+i2);
        System.out.println("기본자료형 : "+num3+"\t\t"+"참조자료형 : "+i3);
    }
}
