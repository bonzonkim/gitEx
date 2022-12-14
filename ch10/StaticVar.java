package ch10;

public class StaticVar {
    static int a = 10;
    int b = 20; //non-static

    public static void main(String[] args) {
        System.out.println(StaticVar.a); //Classname.static member var
        StaticVar v = new StaticVar();
        System.out.println(v.b);
    }

}
