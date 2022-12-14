package ch16;
//데몬스레드는 유닉스(리눅스)운영체제에서 백그라운드로 동작하는 프로그램
//일반스레드가 모두 종료되면 강제적으로 종료됨
public class DaemonThread implements Runnable{
    @Override
    public void run() {
        while(true){
            System.out.println("데몬 스레드 실행중입니다");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break; //Exception발생시 while문 탈출
            }
        }
    }

    public static void main(String[] args) {
        Thread th = new Thread(new DaemonThread());
        th.setDaemon(true);
        th.start();
        //데몬스레드로 설정
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("메인 스레드가 종료됩니다");
    }

}



