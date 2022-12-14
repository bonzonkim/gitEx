package ch05;

import java.util.Scanner;

public class GetMax_Scan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int intArray[] = new int[5];
        int max = 0;
        System.out.println("양수 5개를 입력하세요 : ");
        for (int i=0; i<intArray.length; i++){
         intArray[i]=sc.nextInt();
         if (intArray[i] > max){
             max = intArray[i];
         }
        }
        System.out.println("최대값은 "+max+"입니다");
    }

    public static class ArrayScore2D_Scan {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("학생수를 입력하시오 : ");
            int student = sc.nextInt();
            int[][] score = new int [student][3];
            int[] total = new int[student];
            double[] avg = new double[student];
            char[] grade = new char[student];
            System.out.println("국,영,수 점수를 각각 입력하세요 ");
            for (int i=0; i<score.length; i++){
                System.out.print(i+1+"번 학생의 국,영,수 점수 : ");
                for (int j=0; j<score[i].length; j++){
                    score[i][j] = sc.nextInt();
                    total[i] += score[i][j];
                    avg[i] = (double)total[i]/score[i].length;
                }
                if (avg[i] >= 90 ){
                    grade[i] = 'A';
                }else if(avg[i] >= 80){
                    grade[i] = 'B';
                }else if(avg[i] >= 70){
                    grade[i] = 'C';
                }else if(avg[i] >= 60){
                    grade[i] = 'D';
                }else {
                    grade[i] = 'F';
                }
            }
            System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t등급");
            for (int i=0; i<score.length; i++) {
                System.out.print(i+1+"\t");
                System.out.print(score[i][i]+"\t"+score[i][1]+"\t"+score[i][2]+"\t"+total[i]+"\t"+
                        String.format("%.1f",avg[i])+grade[i]+"\n");
            }
        }
    }
}
