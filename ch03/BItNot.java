package ch03;

public class BItNot {
    public static void main(String[] args) {
        byte a = 10;
        //연산시 첫째로 반전시킨후 다시한번 반전시킬때 오른쪽 끝비트를 제외하고 반전후 앞의 부호도 반전시킴
        System.out.println(a);
        System.out.println(~a);//~연산자(비트값을 반전 0은1,1은0)

    }
}
