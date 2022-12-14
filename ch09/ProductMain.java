package ch09;

public class ProductMain {
    public static void main(String[] args) {
        Sale s = new Sale();
        s.Input(2055,"keith","spotify",
                "20221123",2500,100);
        s.calculate();
        s.print();
    }
}
