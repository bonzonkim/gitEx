package ch13;

public class ObjCast {
    public static void main(String[] args) {
        int a = 10; //기본자료형
        Object obj = 20; //참조자료형

        a = (Integer) obj; //캐스팅 obj가 객체형이기때문에 wrapper클래스 사용

        System.out.println(a);

        //Object Array : 다양한 자료형 사용가능
        Object[] obj2 = {100, 100.5, true, "hello", 'a'};
        //각 데이터가 object객체 처리됨 메모리낭비가 심해서 안씀
        for (Object o : obj2) {
            System.out.println(o);
        }
    }
}
