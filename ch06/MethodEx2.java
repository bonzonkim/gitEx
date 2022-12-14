package ch06;

public class MethodEx2 {
    public static void main(String[] args) {
        System.out.println("summary(1~10)"+sum(1,10));
        System.out.println("summary(10~100)"+sum(10,100));
        System.out.println("summary(100~1000)"+sum(100,1000));
    }

    public static int sum (int a, int b){
        int result =0;
        for (int i=a; i<=b; i++){
            result += i;
        }
        return result;
    }
}
