package ch13;

public class WrapperEx3 {
    public static void main(String[] args) {
        String str = "Hello 1234";

        char[] chrr = str.toCharArray();
        for (int i = 0; i<chrr.length; i++){
            if (Character.isUpperCase(chrr[i])){
                System.out.println(chrr[i]+"는 대문자입니다.");
            }else if(Character.isLowerCase(chrr[i])){
                System.out.println(chrr[i]+"는 소문자입니다");
            } else if (Character.isDigit(chrr[i])) {
                System.out.println(chrr[i]+"는 숫자입니다");
            }
        }
        System.out.println("문자 " +str.substring(6) + "입니다");
        System.out.println("숫자 " + Integer.parseInt(str.substring(6)) + "입니다");
        System.out.println("숫자 1234 + 2 = "+Integer.sum(Integer.parseInt(str.substring(6)
        ),2)+"입니다");
    }
}
