package Ch11;

public class Airplane implements Flyer{

    @Override
    public void takeOff() {
        System.out.println("Airplane takeoff");
    }

    @Override
    public void fly() {
        System.out.println("airplane flying");
    }

    @Override
    public void land() {
        System.out.println("Airplane landing");
    }
}
