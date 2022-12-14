package ch05;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] list = {10,20,30,40,50};
        //명시적 복사
        int[] numbers = list;
        for (int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
        System.out.println();
        //Arrays클래스 이용 복사
        int[] list_copy = Arrays.copyOf(list,list.length);
        for (int val : list_copy){
        System.out.println(val);}
    }
}
