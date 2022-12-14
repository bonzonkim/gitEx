package ch12;

interface RemoteControl{
    void turnOn();
    void turnOff();
}






public class AnonymousClassTest {
    public static void main(String[] args) {
        //인터페이스는 객체생성을 못하지만 무명클래스 처리해서
        //무명클래스가 상속받아 오버라이딩 가능
        RemoteControl re = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("Tv turnon");
            }

            @Override
            public void turnOff() {
                System.out.println("Tv turnoff");
            }
        }; //무명내부클래스
        re.turnOn();
        re.turnOff();
    }
}
