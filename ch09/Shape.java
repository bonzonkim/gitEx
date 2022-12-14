package ch09;

public class Shape {
    private String name;

    public Shape(){
    }

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double calculateArea(){
        return 0;
    }
    public void draw(){
        System.out.println("도형을 그립니다");
    }
}
