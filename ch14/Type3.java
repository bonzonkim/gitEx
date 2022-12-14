package ch14;

public class Type3 <T>{ //자료형이 미정인 상 <아무문자>
    T t; //변수도 자료형 미정
    public void setT(T t){
        this.t = t;
    }
    public T getT(){
        return t;
    }

    public static void main(String[] args) {

        //인스턴스 생성할 떄 자료형을 결정함 -> 제너릭(일반화)
        Type3<String> t = new Type3<String>();
        t.setT("hello");
        System.out.println(t.getT());

        Type3<Integer> t2 = new Type3<Integer>();
        t2.setT(1000);
        System.out.println(t2.getT());

        Type3<Double> t3 = new Type3<Double>();
        t3.setT(3.14);
        System.out.println(t3.getT());
    }


}
