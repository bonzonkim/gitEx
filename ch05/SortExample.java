package ch05;

import java.util.Arrays;
import java.util.Collections;

public class SortExample {
    public static void main(String[] args) {
        int[] num = {1,5,9,8,20,10,15};
        Arrays.sort(num);
        for (int asd : num){
            System.out.print(asd+" ");
        }
        System.out.println();
        System.out.println("=============");

        //내림차순은 특별히 Integer라는 Wrapper Class타입으로 데이터 처리가 되어야함
        Integer rev[] = {1,5,9,8,20,10,15};
        Arrays.sort(rev, Collections.reverseOrder());
        for (int i : rev){
            System.out.print(i+" ");
        }
    }
}
