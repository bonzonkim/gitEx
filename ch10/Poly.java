package ch10;

class K{
    int a = 10;
    public void print(){
        System.out.println(a);
    }
}
class V extends K{
    int a = 20;

    @Override
    public void print() {
        System.out.println(a);
    }
}



public class Poly {
    public static void main(String[] args) {
        V v = new V();
        v.print();
        K k = new K();
        k.print();

        K m = new V();
        m.print();
        System.out.println("C instanceof V? : " + (m instanceof V));
    }
}
