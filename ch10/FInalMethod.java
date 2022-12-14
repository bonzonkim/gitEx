package ch10;

class A2{
    void print(){
    //final void print(){ //final로하면 오버라이드가 안됨
        System.out.println("a");
    }
}

class B2 extends A2{

    @Override
    void print() {
        System.out.println("b");
        super.print();
    }
}


public class FInalMethod {
    public static void main(String[] args) {
        B2 b = new B2();
        b.print();
    }
}
