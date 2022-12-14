package ch12;

public class InnerExam2 {
    static class Cal{ //내부 static클래스
        int value = 0;
        public void plus(){
            value++;
        }
    }

    public static void main(String[] args) {
        InnerExam2.Cal e = new InnerExam2.Cal();
        e.plus();
        System.out.println(e.value);
    }
}
