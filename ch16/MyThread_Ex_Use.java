package ch16;

public class MyThread_Ex_Use {
    public static void main(String[] args) {
        MyThread_Ex e1 = new MyThread_Ex("Thread1");
        MyThread_Ex e2 = new MyThread_Ex("Thread2");
        e1.setPriority(Thread.MAX_PRIORITY);
        e2.setPriority(Thread.MIN_PRIORITY);

        e1.start();
        e2.start();

    }
}
