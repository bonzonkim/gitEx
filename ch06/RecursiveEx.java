package ch06;

public class RecursiveEx { //재귀호출 메소드 자신이 자신을 호출
    static long fact1(int n){
        return n==1 ? 1 : n*fact1(n-1);//5*4*3*2*1
    }

    public static void main(String[] args) {
        System.out.println(fact1(5));
    }
}
