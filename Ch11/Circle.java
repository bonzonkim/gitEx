package Ch11;

public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("drawing Circle x : " + x);
        System.out.println("drawing Circle y : " + y);
    }
}
