package ch04;

public class BreakEx4 {
    public static void main(String[] args) {
        int n = 0;

        while (true){
            if(n==8){
               break;
            }
            System.out.println(n+" Hello World!");
            n++;
        }
    }
}
