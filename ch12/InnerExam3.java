package ch12;

public class InnerExam3 {
    public void exec(){
        class Cal{ //메소드안에서 클래스 선언
            int value = 0;
            public void plus(){
                value++;
            }
        }
        Cal cal = new Cal();//3)메소드안에서 지역중첩클래스를 생성
        cal.plus();//4) 지역중첩클래스안의 멤버 메소드 호출
        System.out.println(cal.value);
    }

    public static void main(String[] args) {
        //지역중첩클래스로 접근하려면
        InnerExam3 i = new InnerExam3(); //1)외부클래스 생성
        i.exec(); //2) 외부클래스의 멤버메소드를 호출
    }

}
