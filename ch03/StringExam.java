package ch03;

public class StringExam {
    public static void main(String[] args) {
        String str = "Hello "+"java";
        System.out.println(str);
        str = 123 + "C"; //숫자 + 문자열 => 숫자가 문자열로 변환됨
        System.out.println(str);

        str += "Programmer";
        System.out.println(str);
    }
}
