package ch12;

public class TestOuter {
    private int data = 30;
    class Inner {
        void msg(){
            System.out.println("data is "+data);
            //중첩클래스는 외부의 private멤버 쓸 수 있음
        }
    }// end inner class

    public static void main(String[] args) {
        TestOuter o = new TestOuter();
        TestOuter.Inner i = o.new Inner();
        i.msg();
    }
}
