package ch03;

import java.util.Scanner;
public class Jumsoo2 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int[][] subject = new int[3][3];
        int[] total = new int[3];
        double[] avg = new double[3];
        char[] grade = new char[3];


        for (int i = 0 ; i<3; i++){
            for (int j = 0; j<3; j++) {
                System.out.print("국어 점수를 입력하세요 ");
                subject[i][j] = sc.nextInt();
                System.out.print("영어 점수를 입력하세요 ");
                subject[i][j] = sc.nextInt();
                System.out.print("수학 점수를 입력하세요 ");
                subject[i][j] = sc.nextInt();

                for (int u = 0; u<3; u++){
                    for (int l = 0; j<3; j++) {
                        total[u] += subject[u][l];
                    }
                }
                for (int u = 0; u<3; u++) {
                    avg[u] = total[u]/3.0;
                }


                if (avg[i] % 10 == 10) {
                    grade[i] = '수';
                } else if (avg[i] % 10 <= 9) {
                    grade[i] = '우';
                } else if (avg[i] % 10 <= 8) {
                    grade[i] = '미';
                } else if (avg[i] % 10 <= 9) {
                    grade[i] = '양';
                } else {
                    grade[i] = '가';
                }
            }
        }
        for (int i = 0; i<3; i++){
            for (int j = 0; j<3; j++) {
                total[i] += subject[i][j];
            }
        }
        for (int i = 0; i<3; i++) {
          avg[i] = total[i]/3.0;
        }

        System.out.println("=========================");
        System.out.println("국어\t영어\t수학\t총점\t평균\t등급");
        for (int i = 0; i<3; i++){
            for (int j = 0; j<3; j++){
                System.out.print(subject[i][j]+"\t"+total[i]+"\t"+avg[i]+"\t"+grade[i]+"\n");
            }
        }
        System.out.println("=========================");








    }
}
