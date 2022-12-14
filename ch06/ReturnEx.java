package ch06;

public class ReturnEx {
    public static int sum(int a){ //a엔 50이 들어감.
        int result = 0;
        for (int i=1; i<=a; i++){
            result += i;
        }
        return result;//메소드 호출한 곳으로 result를 반환해줌
    }

    public static void main(String[] args) {
        int n = sum(50);//sum메소드 호출 후 리턴 받은값을 n에 저장
        System.out.println(n);
        n=sum(100);
        System.out.println(n);
    }
}
