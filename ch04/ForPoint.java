package ch04;

import java.util.Scanner;

public class ForPoint {
    public static void main(String[] args) {
        int kor1 =0,kor2=0,kor3=0;
        int eng1 =0,eng2=0,eng3=0;
        int math1 =0, math2=0, math3=0;
        int total1 =0, total2 =0, total3 =0;
        double avg1 = 0,avg2 = 0,avg3 = 0;
        char grade1 =' ', grade2 = ' ', grade3 = ' ';

        Scanner sc = new Scanner(System.in);

        System.out.print("국어 점수를 입력하세요 ");
        kor1 = sc.nextInt();
        System.out.print("영어 점수를 입력하세요 ");
        eng1 = sc.nextInt();
        System.out.print("수학 점수를 입력하세요 ");
        math1 = sc.nextInt();

        System.out.print("국어 점수를 입력하세요 ");
        kor2 = sc.nextInt();
        System.out.print("영어 점수를 입력하세요 ");
        eng2 = sc.nextInt();
        System.out.print("수학 점수를 입력하세요 ");
        math2 = sc.nextInt();

        System.out.print("국어 점수를 입력하세요 ");
        kor3 = sc.nextInt();
        System.out.print("영어 점수를 입력하세요 ");
        kor3 = sc.nextInt();
        System.out.print("수학 점수를 입력하세요 ");
        math3 = sc.nextInt();
        sc.close();


        total1 = kor1+eng1+math1;
        total2 = kor2+eng2+math2;
        total3 = kor3+eng3+math3;

        avg1 = total1/3.0;
        avg2 = total2/3.0;
        avg3 = total3/3.0;

        if(avg1 > 90) {
            grade1 = '수';
        }else if(avg1 > 80) {
            grade1 = '우';
        }else if(avg1 > 70) {
            grade1 = '미';
        }else if(avg1 > 60) {
            grade1 = '양';
        }else {
            grade1 = '가';
        }


        if(avg2 > 90) {
            grade2 = '수';
        }else if(avg2 > 80) {
            grade2 = '우';
        }else if(avg2 > 70) {
            grade2 = '미';
        }else if(avg2 > 60) {
            grade2 = '양';
        }else {
            grade2 = '가';
        }


        if(avg3 > 90) {
            grade3 = '수';
        }else if(avg3 > 80) {
            grade3 = '우';
        }else if(avg3 > 70) {
            grade3 = '미';
        }else if(avg3 > 60) {
            grade3 = '양';
        }else {
            grade3 = '가';
        }
        System.out.println("=============================================");
        System.out.println("국어\t영어\t수학\t총점\t평균\t등급");
        System.out.printf("%d\t%d\t%d\t%d\t%.1f\t%s\n",kor1,eng1,math1,total1,avg1,grade1);
        System.out.printf("%d\t%d\t%d\t%d\t%.1f\t%s\n",kor2,eng2,math2,total2,avg2,grade2);
        System.out.printf("%d\t%d\t%d\t%d\t%.1f\t%s\n",kor3,eng3,math3,total3,avg3,grade3);
        System.out.println("=============================================");
    }




}

