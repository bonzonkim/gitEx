package Ch11;

public class Computer implements Controllerable {

    @Override
    public void turnOn() {
        System.out.println("컴퓨터를 킵니다");
    }

    @Override
    public void turnOff() {
        System.out.println("컴퓨터를 끕니다");
    }
}
