package ch13;

public class obj {
    public static void main(String[] args) {
        obj ob = new obj();
        System.out.println(ob.getClass());//클래스의 정보
        System.out.println(ob);///주소값
        System.out.println(ob.toString());//object를 문자열로 변환
    }
}
