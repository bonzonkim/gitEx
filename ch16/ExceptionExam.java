package ch16;

public class ExceptionExam {
    public static void main(String[] args) {
        int a = 10, b = 0, c;
        try {
            c = a / b;
            System.out.println(c);
        }catch (Exception e){ //잘 모를떈 exception만 해도됨
            System.out.println("0으로 나눌 수 없습니다");
            e.printStackTrace();//에외가 발생한 상태의 스택 정보 출력(디버깅용)
        }
        System.out.println("프로그램 종료");

    }
}
