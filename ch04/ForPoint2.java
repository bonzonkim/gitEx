package ch04;

import java.util.Scanner;

public class ForPoint2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] subject = new int[3][3];
        int[] total = new int[3];
        double[] avg = new double[3];
        char[] grade = new char[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("국어 점수를 입력하세요 ");
            subject[i][0] = sc.nextInt();
            System.out.print("영어 점수를 입력하세요 ");
            subject[i][1] = sc.nextInt();
            System.out.print("수학 점수를 입력하세요 ");
            subject[i][2] = sc.nextInt();
            for (int j = 0; j < 3; j++) {
            System.out.print(subject[i][j]+"\t"+"\n");}}


                for (int i = 0; i<subject.length; i++){
                    for (int j = 0; j<subject[i].length; j++){
                        total[j] += subject[i][j];
                        avg[j] = (double)total[j]/3.0;
                    }
                }
                for (int i = 0; i<avg.length; i++){
                    if (avg[i]<=90){
                        grade[i] = '수';
                    }if (avg[i]<=80){
                        grade[i] = '우';
                    }if (avg[i]<=70){
                        grade[i] = '미';
                    }if (avg[i]<=60){
                        grade[i] = '양';
                    }else {
                        grade[i] = '가';
                    }
                }


        System.out.println("============================================");
        System.out.println("국어\t영어\t수학\t총점\t평균\t등급");
        System.out.printf("%d\t%d\t%d\t%d\t%3.1f\t%s\n", subject[0][0],subject[0][1],subject[0][2],total[0],avg[0],grade[0]);
        System.out.printf("%d\t%d\t%d\t%d\t%3.1f\t%s\n", subject[1][0],subject[1][1],subject[1][2],total[1],avg[1],grade[1]);
        System.out.printf("%d\t%d\t%d\t%d\t%3.1f\t%s\n", subject[2][0],subject[2][1],subject[2][2],total[2],avg[2],grade[2]);
        System.out.println("===========================================");

    }
    }

