package Ch11;

public class Test2 extends Test{
    @Override
    public void print() {
        System.out.println("abstract class implement");
    }

    public static void main(String[] args) {
        Test2 t = new Test2();
        t.print();
    }
}
