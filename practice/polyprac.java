package practice;

public class polyprac {
    public void print(){
        System.out.println("fuck you");
    }
}


class poly3 extends polyprac{
    @Override
    public void print() {
        System.out.println("nono");
    }
}

class poly2 extends polyprac{
    @Override
    public void print() {
        System.out.println("yaya");
    }

    public static void main(String[] args) {
        polyprac pp = new poly2();
        pp.print();
        polyprac p1 = new poly3();
        p1.print();
    }
}
