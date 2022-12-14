package ch12;

public class StaticOuter2 {
    static int data = 30;
    int data2 = 50;
    static class StaticInner{
        void msg(){
            System.out.println("data is "+data);
//            System.out.println("data is "+data2); non-static
        }
    }

    public static void main(String[] args) {
        StaticOuter2.StaticInner in = new StaticOuter2.StaticInner();
        in.msg();
    }

}
