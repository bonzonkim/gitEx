package ch10;

class Triangle extends Figure{
    @Override
    void draw() {
        System.out.println("drawing Triangle");
    }
}

class Circle extends Figure{
    @Override
    void draw() {
        System.out.println("drawing Circle");
    }
}

class Rectangle extends Figure{
    @Override
    void draw() {
        System.out.println("drawing rectangle");
    }
}

public class Figure {
    void draw(){
        System.out.println("drawing");
    }

    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.draw();
        Rectangle r = new Rectangle();
        r.draw();
        Circle c = new Circle();
        c.draw();

        System.out.println("=======================");
        Figure f = new Triangle();//좌변 부모,우변 자식 =>다형성
        f.draw();
        f = new Rectangle();
        f.draw();
        f = new Circle();
        f.draw();
    }
}
