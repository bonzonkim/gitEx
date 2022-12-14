package ch13;

public class StrBBuildEx {
    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder("I am a");
        String str2 = " Java Programmer";


        System.out.println("appedn()메소드 활용 : "+str1.append(str2));
        System.out.println("replace()메소드 활용 : "+str1.replace(7,11,"JSP"));
        System.out.println("substring()을 활용 : "+str1.substring(6));

    }



}
