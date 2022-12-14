package ch08;

public class MymanagerMain {
    public static void main(String[] args) {
        Mymanager mg = Mymanager.getInstance(); //
        System.out.println(mg);
        System.out.println(mg.getScore());
        mg.setScore(100);
        System.out.println(mg.getScore());
    }
}
