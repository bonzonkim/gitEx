package Ch11;

public class Plane implements Vehicle{
    @Override
    public void speedUp() {
        System.out.println("Plane speed up");
    }

    @Override
    public void speedDown() {
        System.out.println("Plane speed down");
    }

    @Override
    public void handle() {
        System.out.println("Plane handling");
    }
}
