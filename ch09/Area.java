package ch09;

public class Area {
    private int width;
    private int length;

    public Area(){

    }

    public Area(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getArea(){
        return width*length;
    }
}
