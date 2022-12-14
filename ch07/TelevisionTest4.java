package ch07;

public class TelevisionTest4 {
    public static void main(String[] args) {
        Television myTv = new Television();
        myTv.channel = 20;
        myTv.volume = 15;
        myTv.onOff = true;
        int ch = myTv.getChannel();
        System.out.println(ch);
    }
}
