package ch07;

public class RadioTest {
    public static void main(String[] args) {
        Radio britz = new Radio();
        Radio iliver = new Radio();

        britz.setOnoff(true);
        britz.setChannel(89.1);
        britz.setVolume(12);
        britz.setRadioModel("브리츠 라디오");
        britz.print();

        System.out.println();

        iliver.setOnoff(false);
        iliver.setChannel(95.1);
        iliver.setVolume(9);
        iliver.setRadioModel("아이리버 라디오");
        iliver.print();

    }
}
