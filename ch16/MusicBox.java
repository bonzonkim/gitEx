package ch16;

public class MusicBox {//공유자원객체
    //가요 음악

    //메소드이름 앞에 synchronized 를 붙이면 해당메소드는 객체 사용권을 얻는다
    //Monitoring  lock
    public synchronized void playMusicA(){
        for (int i = 0; i < 10; i++) {
            System.out.println("가요 음악!!!");
            try {
                Thread.sleep((int) (Math.random() * 1000));
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    public synchronized void playMusicB(){
        for (int i = 0; i < 10; i++) {
            System.out.println("팝송 음악!!!");
            try {
                Thread.sleep((int) (Math.random() * 1000));
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    //synchronized 를 붙이지 않은 메소드는 다른스레드들이 모니터링 락을 획득해도
    //그것과 상관없이 실행됨
    public void playMusicC(){
        for (int i = 0; i < 10; i++) {
            //전체 메소드에 적용안하고 특정부분만 synchronized 블럭 처리 할 수
            synchronized (this){ //this는 MusicBox (현)객체를 가리킴
                System.out.println("클래식 음악!!!");
            }
            try {
                Thread.sleep((int) (Math.random() * 1000));
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}
