package Ch11;

public class Rectangle extends Shape{
    @Override
    public void draw() {
        System.out.println("drawing rectangel  x : " + x);
        System.out.println("drawing rectangel y :" + y);
    }
}
