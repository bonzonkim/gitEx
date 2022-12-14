package Ch11;

public class AbstractExtends extends AbstractClass{

    //추상클래스를 상속 받을 경우 부모쪽에 있는 미완성메소드를 구현해줘야함
    @Override
    void method1() {
        System.out.println("추상 method를 완성한 method");
    }

    public static void main(String[] args) {
        AbstractExtends ex = new AbstractExtends();
        ex.method1();
        ex.method2();
    }
}
