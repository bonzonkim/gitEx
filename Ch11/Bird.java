package Ch11;

public class Bird implements Flyer{
    @Override
    public void takeOff() {
        System.out.println("bird is takeoff");
    }

    @Override
    public void fly() {
        System.out.println("bird is flying");
    }

    @Override
    public void land() {
        System.out.println("bird is landing");
    }
}
