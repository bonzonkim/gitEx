package ch16;

public class MyThread2 implements Runnable{
        String str;

    public MyThread2(String str) {
        this.str = str;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(str);
            try {
                Thread.sleep((int)Math.random());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
