package ch16;

public class RunnableExam implements Runnable{
    @Override
    public void run() {
        for (int i=1; i<=100; i++){
            System.out.println(Thread.currentThread().getName()+"==>"+i);
        }
    }


    public static void main(String[] args) {
        RunnableExam r1 = new RunnableExam();

        //new THread(스레드 구현객체,"스레드이름")
        Thread t1 = new Thread(r1, "thread1");
        Thread t2 = new Thread(r1, "thread2");

        t1.start();
        t2.start();
    }
}
