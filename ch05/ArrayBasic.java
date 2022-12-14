package ch05;

public class ArrayBasic {
    public static void main(String[] args) {
       // int[] score;
        //score = new int[5];
        int[] score = new int[5];
        System.out.println(score);
        score[0] = 100;
        score[1] = 90;
        score[2] = 80;
        score[3] = 60;
        score[4] = 70;

        System.out.println(score[0]);
        System.out.println(score[1]);
        System.out.println(score[2]);
        System.out.println(score[3]);
        System.out.println(score[4]);

        for (int i=0; i<5; i++){
            System.out.println(score[i]);
        }
    }
}
