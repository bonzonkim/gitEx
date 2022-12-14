package ch16;

public class ATMsync {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Thread mom = new Thread(atm,"mom");
        Thread son = new Thread(atm,"son");
        mom.start();
        son.start();
    }
}

class ATM implements Runnable{

    private long accBalance = 10000;


    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                notify();//wait하고 있는 스레드를 깨움
                try {
                    wait();//현재 실행 스레드 일시정지 -> 다른 스레드 실행 허용
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (getAccount() <= 0){ //통장잔액이 0 보다 적으면
                    break;
                }
                withDraw(1000);
            }
        }
    }

    public long getAccount() {
        return accBalance;
    }

    public void withDraw(long cash) {
        if (getAccount() > 0) {
            accBalance -= cash;
            System.out.print(Thread.currentThread().getName()
            +",");
            System.out.printf("잔액: %,d원 %n",getAccount());
            //%,d는 3자리수 콤마처리
        }else {
            System.out.print(Thread.currentThread().getName()
                    +",");
            System.out.println("잔액이 부족합니다");
        }
    }
}