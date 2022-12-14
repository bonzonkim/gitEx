package ch16;

public class MusicBoxExam1 {
    public static void main(String[] args) {
        MusicBox box = new MusicBox();

        MusicPlayer kang = new MusicPlayer(1,box); //가요
        MusicPlayer kwon = new MusicPlayer(2,box); //팝송
        MusicPlayer kim = new MusicPlayer(3,box); //클래식

        kang.start();
        kwon.start();
        kim.start();
    }
}
