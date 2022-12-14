package Ch11;

public class MyCalculatorExam {
    public static void main(String[] args) {
        Calculator cal = new MyCalculator();
        int value1 = cal.multiple(5, 10);
        int value2 = cal.plus(7, 5);
        int value3 = cal.exec(5, 10);

        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
    }
}
