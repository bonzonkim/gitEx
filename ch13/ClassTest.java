package ch13;

import java.util.Random;

public class ClassTest {
    public static void main(String[] args) {
        System.out.println(Math.ceil(10.1)); //올림
        System.out.println(Math.round(10.5)); //반올림
        System.out.println(Math.floor(10.9)); //내림
        System.out.println(Math.pow(10,3)); //제곱
        System.out.println(Math.pow(2,3));
        Random rd = new Random();
        System.out.println(rd.nextInt(100));//난수

        int a = 10;//primitive기본자료형
        Integer b = 20; //reference객체자료형
        Integer c = new Integer(30);
    }
}
