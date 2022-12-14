package ch12;

public class LocalOuter2 {
    private int data = 20;
    void display(){
        class LocalInner2{
            int value = 50;
              void msg(){
                  System.out.println(value);
                  System.out.println(data);
            }
        }
        LocalInner2  i = new LocalInner2();
        i.msg();
    }

    public static void main(String[] args) {
        LocalOuter2 l = new LocalOuter2();
        l.display();
    }
}
