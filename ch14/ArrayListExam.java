package ch14;

//ArrayList : Enhanced vector.

import java.util.ArrayList;
import java.util.List;

public class ArrayListExam {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>(); //List부모 , ArrayList 자식
        list.add("하나 ");
        list.add(2);
        list.add(5.5);
        list.add(false);
        list.add(2, 4); //index에 element넣기
        list.remove(3); //삭제
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "\t");
        }
    }
}
