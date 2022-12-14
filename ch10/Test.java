package ch10;

public class Test {
    static int a; //static member
    int b; //non-static member
    void print(){ //non-static member
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        System.out.println(a);

        Test t = new Test();
        System.out.println(t.b);
        t=null;//객체의 주소값을 초기화(주소값을 잃어버림)
        //System.out.println(t.b);
    }
}
