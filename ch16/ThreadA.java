package ch16;

public class ThreadA{
    public static void main(String[] args) {
        ThreadB b = new ThreadB();
        b.start();

        synchronized (b) { //ThreadB객체에 대해 동기화 설정
            System.out.println("b가 완료될때까지 기다립니다");
            try {
                b.wait();//main스레드가 ThreadB에게 자신은 wait(정지)하겠다고
                //알림
                //wait()모니터링락을 풀고, 다른스레드에서 notify(All)을 호출해주기 기다림
                //도착하면 일시정지 상태에서 깨어나서 실행
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Total is "+b.total);
        }
    }
}


class ThreadB extends Thread{
    int total;

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                System.out.println(i + "를 더합니다");
                total += i;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            notify(); //wait하고 있는 스레드를 깨움
        }
    }
}
