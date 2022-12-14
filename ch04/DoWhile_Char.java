package ch04;

public class DoWhile_Char {
    public static void main(String[] args) {
        char c ='a';
        do {
            System.out.print(c);
            c = (char)(c+1); //c+=1도 가능
        }while (c<='z');
    }
}
