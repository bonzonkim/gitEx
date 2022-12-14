package ch12;

abstract class Action{
    public abstract void exec();
}
public class ActionExam extends Action{
    @Override
    public void exec() {
        System.out.println("I am a child");
    }

    public static void main(String[] args) {
        Action a = new ActionExam(){ //익명내부 클래스
            String name = "kim";

            @Override
            public void exec() {
                System.out.println("나는"+name+"이다");
            }
        };//세미콜론 붙여야함
        a.exec();
    }
}
