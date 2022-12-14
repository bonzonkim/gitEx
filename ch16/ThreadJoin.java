package ch16;

public class ThreadJoin extends Thread {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+"스레드가 시작됐습니다");
        ThreadJoin e = new ThreadJoin();
        e.setName("thread1");
        e.start();
        //join : join method를 호출한 스레드가 종료될때까지 현재의 스레드를 대기시킴
        //새로운 스레드가 생성되고 start()호출하면 새로운 작업단위 만들어지고 run()실행
        try {
            e.join();//새로운작업을 요청하면 기다렸다가 다시실행
        }catch (InterruptedException e1){
            e1.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"스레드가 종료됐습니다");
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"스레드가 시작됐습니다");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"스레드가 종료됐습니다");
    }
}
