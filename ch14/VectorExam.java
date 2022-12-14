package ch14;
//Collection = 배열의 단점을 보완한 클래스들
//배열은 타입을 하나 밖에 못 넣기 때문에
//Map - 순서가 없고 키가 있음
//List - 순서 있고 키가 없음
// Vector -

import java.util.Vector;

public class VectorExam {
    public static void main(String[] args) {
        //Vector v = new Vector(); 도 가능 하지만 아래 처럼
        Vector<Object> v = new Vector<>();
        //모든 자료형 처리, 사이즈 자동으로 늘어남
        System.out.println("초기 사이즈 : "+v.capacity());
        v.add("first");
        v.add(2);
        v.add(3.14);
        v.add('A');
        v.add(true);
        v.add(4.324);
        v.add(false);
        v.add(55);
        v.add(657);
        v.add(99);
        v.add("last");

        System.out.println("중간 사이즈 : " + v.capacity());
        //입력된 데이터가 벡터의 capacity보다 클 경우 10씩 증가
        System.out.println("데이터의 개수 : " + v.size());
        System.out.println("초기 데이터");
        for (int i = 0; i < v.size(); i++) {
            System.out.print(v.get(i)+"\t");
        }
        System.out.println();
        v.add(5, 102);
        for (int i = 0; i < v.size(); i++) {
            System.out.print(v.get(i)+"\t");
        }
        v.remove(0);
        for (int i = 0; i < v.size(); i++) {
            System.out.print(v.get(i)+"\t");
        }
    }
}
