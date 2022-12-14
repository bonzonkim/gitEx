package ch13;


/*String의 특징
1.불변성
2.char의 배열
 */
public class StrMethod {
    public static void main(String[] args) {
        String str1 = "java";
        str1 += " programming"; //문자열 연결

        System.out.println(str1);
        System.out.println(str1.length());//String = 캐릭터의 배열
        String str2 = str1.concat(" sucks");
        //concatenate
        System.out.println(str2);
        System.out.println(str1);
        System.out.println(str1.charAt(2));//012 jav
        System.out.println(str2.indexOf("program"));
        //indexOf() 찾고자하는 문자열 인덱스 찾아줌
        System.out.println(str2.indexOf("z"));
        //찾는 내용이 없으면 -1리턴 (if문사용해서 어쩌구저쩌구)
        System.out.println(str2.substring(0, 4));
        System.out.println(str2.substring(5));
        System.out.println(str2.replace("java", "Swift"));
        System.out.println(str2);


        String str3 = "37578538735875";
        System.out.println(str3.substring(5, 9));
        System.out.println(str3.replace(str3.substring(5, 9), "****"));

    }
}