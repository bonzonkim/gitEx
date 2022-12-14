package ch08;

public class Mymanager {
    private int score;

    private Mymanager(int score){
        this.score = score;
    }

    private static Mymanager mgr;

    public static Mymanager getInstance(){
        if(mgr==null){//처음 Mymanager가 객체화 될때
            mgr = new Mymanager(10);
        }
        return mgr; // 한번 이상 객체 생성되었다면(주소값이 있으면) 그 값을 리턴
    }

    public int getScore(){
        return score;
    }
    public void setScore(int score){
        this.score =score;
    }
}
