package ch10;

class Pa{
    String name = "Kelly";
    public void print(){
        System.out.println("name : " + name);

    }
}

class Ch extends Pa{
    int age = 23;

    @Override
    public void print() {
        super.print();
        System.out.println("age : " + age);
    }
}




public class Poly2 {
    public static void main(String[] args) {
        String tel = "010-2424-4242";
        Pa p = new Ch(); //polymorphism
        p.print();
        System.out.println("Phone number : "+tel);
    }
}
