package Ch11;

public interface Controllerable {
    //인터페이스에서 default를 명시해줌으로써 메소드로 메소드 구현가능
    default void repair(){
        System.out.println("장비를 수리한다");
    }
    //static method도 메소드 구현가능
    static void reset(){
        System.out.println("장비를 초기화 한다");
    }
    void turnOn();
    void turnOff();
}
