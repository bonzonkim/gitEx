package ch04;

public class DoWhileEx2 {
    public static void main(String[] args) {
        int n = 1;
        do{
            System.out.println(n+"Hello world");
            n++;
        }while(n<=10);
        System.out.println("break from while");
    }
}
