package ch07;

public class TelevisionTest {
    public static void main(String[] args) {
        Television tv = new Television(); //Television 객체생성
        tv.channel = 7;
        tv.volume = 10;
        tv.onOff = true;
        System.out.println("텔레비전의 채널은"+tv.channel+"이고 볼륨은"+tv.volume+"입니다");
    }
}
