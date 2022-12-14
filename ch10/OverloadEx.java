package ch10;

public class OverloadEx {
    public void putData(String a){
        System.out.println(a);
    }
    public void putData(int a) {
        System.out.println(a);
    }
    public void putData(double a) {
        System.out.println(a);
    }


    public static void main(String[] args) {
        OverloadEx o = new OverloadEx();
        o.putData("sj");
        o.putData(2);
        o.putData(9.2);
    }
}
