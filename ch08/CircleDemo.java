package ch08;


class Circle{
    double radius;
    String color;
    public Circle(double r, String c){
        radius = r;
        color = c;
    }
    public Circle(double r){
        radius = r;
        color = "Red";
    }
    public Circle(String c){
        radius = 21.0;
        color = c;
    }
    public Circle(){
        radius = 3.5;
        color = "Blue";
    }
    public void print(){
        System.out.println("radius : "+radius);
        System.out.println("Color : "+color);
    }

}



public class CircleDemo {
    public static void main(String[] args) {
        Circle cr = new Circle(18.0, "Yellow");
        cr.print();

        Circle cr1 = new Circle(16.5);
        cr1.print();

        Circle cr2 = new Circle("Black");
        cr2.print();

        Circle cr3 = new Circle();
        cr3.print();
    }
}
