package ch07;

public class TelevisionTest3 {
    public static void main(String[] args) {
        Television myTv = new Television();
        myTv.channel = 7; //각 다른 메모리주소에 myTv와 yourTv의 값을 저장
        myTv.volume = 9;
        myTv.onOff = true;
        myTv.print();

        Television yourTv = new Television();
        yourTv.channel = 10;
        yourTv.volume = 12;
        yourTv.onOff = false;
        yourTv.print();
    }
}
