package ch16;

public class ThreadExam2 {
    public static void main(String[] args) {
        MyThread2 m1 = new MyThread2("*");
        MyThread2 m2 = new MyThread2("-");

        //MyThread2는 Thread를 상속받지 않았기때문에 thread가 아니다
        //Runnable을 implements한거라서 Thread객체를 생성해줘야함

        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m2);

        t1.start();
        t2.start();

        System.out.print("!!!!");
    }
}
