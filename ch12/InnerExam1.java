package ch12;

public class InnerExam1 {
    class Cal{
        int value = 0;
        public void plus (){
            value++;
        }
    }

    public static void main(String[] args) {
        InnerExam1 i = new InnerExam1();
        //외부클래스.내부클래스이름 참조변수 = 외부참조변수.new 내부클래스생성자();
        InnerExam1.Cal c = i.new Cal();
        System.out.println(c.value);
        c.plus();
        System.out.println("plus()실행");
        System.out.println(c.value);
    }
}
