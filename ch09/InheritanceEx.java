package ch09;

public class InheritanceEx {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Ball c2 = new Ball("빨간색");
        System.out.println("원 : ");
        c1.findRadius();
        c1.findArea();

        System.out.println("공 : ");
        c2.findRadius();//member of circle
        c2.findColor();//member of ball
        c2.findArea();//member of circle
        c2.findVolume();//member of ball

        Circle c3 = new Circle(4);
        Ball c4 = new Ball();
    }

}
