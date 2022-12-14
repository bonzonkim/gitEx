package ch08;

public class calculatorUse {
    public static void main(String[] args) {
        calculator ca = new calculator();
        ca.setLeft(10);
        ca.setRight(20);
        System.out.println(ca.getLeft()+" "+ca.getRight());
        ca.sum();
        ca.avg();

        calculator ca2 = new calculator(20,30);
        ca2.sum();
        ca2.avg();

        calculator ca3 = new calculator(20,40);
        ca3.sum();
        ca3.avg();
    }
}
