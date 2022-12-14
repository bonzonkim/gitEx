package ch15;

public class ThrowExam {
    //throw : 에외를 직접 발생시킴, 테스트용외에는 거의 안씀

    static void test(int n) {
        if (n == 0) {
            //throw new 예외처리클래스() -> 특정한 조건에 인위적으로 예외발생시킴
            throw new NullPointerException();
        }
    }

    public static void main(String[] args) {
        test(0);
    }
}
