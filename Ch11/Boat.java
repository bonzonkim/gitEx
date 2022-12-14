package Ch11;

public class Boat implements Vehicle{
    @Override
    public void speedUp() {
        System.out.println("Boat speed up");
    }

    @Override
    public void speedDown() {
        System.out.println("Boat speed down");
    }

    @Override
    public void handle() {
        System.out.println("Boat handling");
    }
}
