package Ch11;

public class ShapeTest {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.x = 100;
        r.y = 200;
        r.draw();

        Circle c = new Circle();
        c.x = 300;
        c.y = 300;
        c.draw();
    }
}
