package ch13;

public class StringExam {
    public static void main(String[] args) {
        String str1 = new String("Hello World");
        String str2 = new String("Hello World");
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        System.out.println("=======(==)used=======");
        if (str1 == str2){
            System.out.println("str1 and str2 have the same reference");
        }else {
            System.out.println("str1 and str2 don't have the same " +
                    "reference");
        }
        System.out.println("==========(.equals)=========");
        if (str1.equals(str2)){
            System.out.println("str1 and str2 have the same value");
        }else {System.out.println("str1 and str2 don't have the same " +
                "value");
        }
    }
}
