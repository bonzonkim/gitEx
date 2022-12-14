package ch13;

//Wrapper class : 기본자료형 포장하는 클래스
//기본 자료형에 대한 다양한 method지원
//byte <> Byte
// shore <> Short
// int <> Integer
// float <> Float
// double <> Double
// char <> Character
// boolean <> Boolean


public class WrapperEx {
    public static void main(String[] args) {
        Integer i1 = 10;
        Integer i2 = new Integer(20);
        int num1 = i1.intValue();
        int num2 = i2; //atuo unboxing(객체로 포장된 밸류 꺼내서 작업됨)
        int sum = num1 + num2;
        System.out.println(sum);
        //2진수
        System.out.println(Integer.toBinaryString(sum));
        //8진수
        System.out.println(Integer.toOctalString(sum));
        //16
        System.out.println(Integer.toHexString(sum));
        System.out.println(Integer.MAX_VALUE); //정수의 최대값
        System.out.println(Integer.MIN_VALUE); //최소값
        System.out.println(Integer.parseInt("100")); //문자열 ->정수
        System.out.println(Integer.toString(100));// 정수 -> 문자열
        System.out.println(100+"");
    }
}
