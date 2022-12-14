package ch09;

public class ShapeMain{


    public static void main(String[] args) {
        CircleShape c  = new CircleShape(5);
        TriangleShape t = new TriangleShape(10,20);
        RectangleShape r = new RectangleShape(5,8);
        c.draw();
        System.out.println("원의 면적은 " + c.calculateArea());

        t.draw();
        System.out.println("삼각형의 면적은 " + t.calculateArea());

        r.draw();
        System.out.println("사각형의 면적은 " + r.calculateArea());
    }
}
