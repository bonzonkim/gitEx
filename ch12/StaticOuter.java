package ch12;

public class StaticOuter {
    static int x = 10;
    static class Inner{
        int getX(){
            return x;
        }
    }//end Inner class

    public static void main(String[] args) {
        StaticOuter.Inner i = new StaticOuter.Inner();
        System.out.println(i.getX());
        //static멤버일 경우 바로 접근가능
    }
}
