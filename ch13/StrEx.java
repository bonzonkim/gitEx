package ch13;

public class StrEx {
    public static void main(String[] args) {
        String str = "Java Programming";
        System.out.println(str);
        //전체 다 대문자로
        System.out.println(str.toUpperCase());
        //전체 다 소문자로
        System.out.println(str.toLowerCase());
        System.out.println(str);//원본은 안바뀜 불변성
        str = str.toLowerCase(); //기존 주소값이 끊기고 toLowerCase로
        System.out.println(str);

        str = "";
        System.out.println("dd :" + str);
        str = null; //참조 내용 자체가 없음
        System.out.println("dd :" + str);

        char ch = '\0';  //null
        System.out.println("sodyd : " + ch + ",code : " + (int) ch);
        ch = ' ';
        System.out.println("sodyd : " + ch + ",code : " + (int) ch);
    }
}
