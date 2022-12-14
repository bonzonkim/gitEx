package ch16;
//멀티 스레드 : 작업단위가 2개이상
//멀티 스레드를 구현하는 방법
//1) Thread extends
//2) Runnable implements


public class ThreadExam extends Thread{
    public ThreadExam(String name){
        super(name); //Thread생성자 호출
    }

    @Override //반드시 오버라이딩 함
    public void run() {
        for (int i = 1; i <= 5; i++) {
            //현재실행중인 스레드 이름 출력
            System.out.println(Thread.currentThread().getName());
        }
        try {
            Thread.sleep(1000); //cpu실행을 1000밀리세컨드 멈춤(필수예외처리)
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        ThreadExam e1 = new ThreadExam("thread1");
        ThreadExam e2 = new ThreadExam("thread2");
        ThreadExam e3 = new ThreadExam("thread3");

        e1.start();//Thread.start() ==> run() 자동호출
        e2.start();//위와 동시에 호출
        e3.start();//위와 동시에 호출 , 3개가 동시에 run()호출
        //동시에 호출하기때문에 순서는 JVM(cpu)가 정해줌
    }
}
