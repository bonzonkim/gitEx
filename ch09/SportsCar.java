package ch09;

public class SportsCar extends Car{ //child class of Car
    boolean turbo;
    public void setTurbo(boolean flag){
        turbo = flag;
        System.out.println(turbo);
    }
}
