package ch10;

public class StaticVar2 {
    static int total; //static메모리영역에 바로 로딩
    String model; //heap에 생성됨
    public StaticVar2(String model){
        this.model = model;
        total++;
    }
}
