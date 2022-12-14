package ch16;

public class MyThread_Im_Use {
    public static void main(String[] args) {
        MyThread_Im m1 = new MyThread_Im();
        Thread t1 = new Thread(m1, "Thread1");
        Thread t2 = new Thread(m1, "Thread2");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();

    }

}
