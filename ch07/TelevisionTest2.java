package ch07;

public class TelevisionTest2 {
    public static void main(String[] args) {
        Television myTv = new Television();
        myTv.channel = 7;
        myTv.volume = 20;
        myTv.onOff = true;
        System.out.println("나의 텔레비젼의 채널은 "+ myTv.channel+"이고 볼륨은"+myTv.volume);


        Television yoTv = new Television();
        yoTv.channel = 8;
        yoTv.volume = 15;
        yoTv.onOff = false;
        System.out.println("너의 텔레비젼의 채널은 "+ yoTv.channel+"이고 볼륨은"+yoTv.volume);
    }
}
