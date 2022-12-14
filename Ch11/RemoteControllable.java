package Ch11;

public interface RemoteControllable extends Controllerable {
    //인터페이스끼리는  extends로 상속받음 impliments X
        void remoteOn();
        void remoteOff();
}
