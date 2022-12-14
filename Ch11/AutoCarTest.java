package Ch11;

public class AutoCarTest {
    public static void main(String[] args) {
        OperateCar c = new AutoCar();
        c.start();
        c.setSpeed(60);
        c.turn(20);
        c.stop();
    }
}
