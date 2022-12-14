package ch13;

public class WrapperEx2 {
    public static void main(String[] args) {
        System.out.println(Character.toLowerCase('A'));
        char c1 = '4', c2 = 'F';
        if (Character.isDigit(c1)) {
            System.out.println(c1 + "는 숫자");
        }
        if (Character.isAlphabetic(c2)) {
            System.out.println(c2 + "는 영문자");
            }
        System.out.println(Integer.parseInt("200"));//String -> Int
        System.out.println(Integer.toString(200));//Int -> String
        System.out.println(Integer.toBinaryString(200));//Int -> Binary

        Integer i = new Integer(200);
        System.out.println(i.doubleValue()); //Int -> double

        Double d = new Double(3.14);
        System.out.println(d.toString());//Double -> String
        System.out.println(Double.parseDouble("3.14"));//String -> Double

        boolean b = (4>3);
        System.out.println(Boolean.toString(b)); //bool -> String
        System.out.println(Boolean.parseBoolean("false"));
    }
}
