package Ch11;

public class Car implements Vehicle {
    @Override
    public void speedUp() {
        System.out.println("Car speed up");
    }

    @Override
    public void speedDown() {
        System.out.println("Car speed down");
    }

    @Override
    public void handle() {
        System.out.println("Car handling");
    }
}
