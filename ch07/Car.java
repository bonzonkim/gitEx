package ch07;

public class Car {
    String color;
    int speed;
    int gear;

    @Override
    public String toString() { //멤버변수의 값을 문자열 출력해주는
        return "Car{" +
                "color='" + color + '\'' +
                ", speed=" + speed +
                ", gear=" + gear +
                '}';
    }

    void changeGear(int g){
        gear = g;
    }
    void speedUp(){
        speed = speed + 10;
    }
    void speedDown() {
        speed = speed - 10;
    }

}
