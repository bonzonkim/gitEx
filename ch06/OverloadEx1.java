package ch06;

public class OverloadEx1 {
    public static void main(String[] args) {
        print(10.5);
        print("hello");
        print(100);
        print("hi","Java");
    }
    static void print(double d){
        System.out.println(d);
    }
    static void print(String s){
        System.out.println(s);
    }
    static void print(int i){
        System.out.println(i);
    }
    static void print(String a, String b){
        System.out.println(a);
        System.out.println(b);
    }
}
