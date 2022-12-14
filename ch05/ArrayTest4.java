package ch05;

import java.util.Scanner;

public class ArrayTest4 {
    public static void main(String[] args) {
        int total = 0;
        int size;
        Scanner sc = new Scanner(System.in);

        System.out.print("배열의 크기를 입력해주세요 : ");
        size = sc.nextInt();
        int[] score = new int[size];

        for (int i=0; i<score.length; i++){
            System.out.println("성적을 입력하세요 : ");
            score[i] = sc.nextInt();
        }
        for (int i =0; i<score.length; i++){
            total += score[i];
        }
        System.out.println((double) total/score.length);
        sc.close();
    }
}
