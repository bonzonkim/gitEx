package ch16;

public class ThreadExam1 {
    public static void main(String[] args) {
        MyThread1 mt1 = new MyThread1("*");
        MyThread1 mt2 = new MyThread1("-");
        mt1.start();
        mt2.start();

    }
}
