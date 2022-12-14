package ch16;


//스레드 기능을 외부클래스에서 구현
public class ExternalThread {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("thread1");
        MyThread t2 = new MyThread("thread2");
        MyThread t3 = new MyThread("thread3");

        t1.start();
        t2.start();
        t3.start();

        System.out.println("Main Thread");
        //다른스레드가 run하는 시점에 메인스레드의 내용이 있다면
        //메인스레드부터 시작
    }
}
