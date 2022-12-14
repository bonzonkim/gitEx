package ch05;

public class StringArray2 {
    public static void main(String[] args) {
        String[] str = {"Java","DB","JSP","HTML"};
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
        for (String asdf : str){
            System.out.println(asdf);
        }
    }
}