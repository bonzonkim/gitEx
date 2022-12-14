package Ch11;

public class TV implements Controllerable,RemoteControllable {
    @Override
    public void turnOn() {
        System.out.println("Tv를 켭니다");
    }

    @Override
    public void turnOff() {
        System.out.println("Tv를 끕니다");
    }

    @Override
    public void remoteOn() {
        System.out.println("리모컨으로 Tv를 켭니다");
    }

    @Override
    public void remoteOff() {
        System.out.println("리모컨으로 Tv를 끕니다");
    }
}
