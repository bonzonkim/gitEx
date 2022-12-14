package ch06;

public class AbsEx {
    public static int abs(int num){
        return num > 0 ? num : -num;  //삼항연산 num>0이 참이면 num 거짓이면 -num반환
    }

    public static void main(String[] args) {
        int a = -15;
        System.out.println(a);
        System.out.println(abs(a));
        System.out.println(Math.abs(a));
    }
}
