package ch13;

public class StrBuilder {
    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder();
        str1.append("java");
        System.out.println(str1.toString());
        str1.append(" programming");
        System.out.println(str1);
        str1.replace(0, 4,"Swift");
        System.out.println(str1);
        String str2 = str1.substring(3); //인덱스3부터끝까지
        System.out.println(str1);
        System.out.println(str2);


        //StringBuilder를 String 으로 바꿀때는 toStirng()으로 사용
        String str3 = str1.toString();
        System.out.println(str3);

        //String을 StringBuilder에 저장할때
        str1 = new StringBuilder(str3);
        System.out.println("String -> StringBuilder : "+str1);

    }
}
