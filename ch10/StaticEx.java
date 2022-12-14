package ch10;

//static => 메모리에 바로 로딩
//non-static => 객체생성 후에 로딩
public class StaticEx {
    String name = "kim";   //non-static member
    static int n = 20; //static member
    public void print(){
        System.out.println(name);
        System.out.println(n);
    }





    public static void main(String[] args) {
        int a = 10;
        double b = 20.5;
        System.out.println(a);
        System.out.println(b);
        System.out.println(n); //static member라서 바로 참조 가능
        StaticEx e = new StaticEx();
        System.out.println(e.name);
        //non-static member라 객체생성 후 참조 가능
    }
}
