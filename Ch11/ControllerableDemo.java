package Ch11;

public class ControllerableDemo {
    public static void main(String[] args) {
        TV t = new TV();
        t.turnOn();
        t.turnOff();
        t.remoteOn();
        t.remoteOff();
        t.repair();
        Controllerable.reset();//static멤버일때는 (클래스이름.메소드) 접근해야함
        Computer c = new Computer();
        c.turnOn();
        c.turnOff();
        c.repair();
        Controllerable.reset();
        Notebook n = new Notebook();
        n.turnOn();
        n.turnOff();
        n.repair();
        Controllerable.reset();
    }
}
