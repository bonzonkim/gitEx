package ch12;

public class LocalOuter {
    private int data = 30;
    void display() {
        class LocalInner{
            void msg(){
                System.out.println("Hi");
            }
        }
        LocalInner i = new LocalInner();
        i.msg();
    }

    public static void main(String[] args) {
       LocalOuter l = new LocalOuter();
       l.display();

    }
}
