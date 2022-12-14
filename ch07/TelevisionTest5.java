package ch07;

public class TelevisionTest5 {
    public static void main(String[] args) {
        Television mytv = new Television();
        mytv.setChannel(11);
        int ch = mytv.getChannel();
        System.out.println("현재채널은"+ch+"입니다");
    }
}
