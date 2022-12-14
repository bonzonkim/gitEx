package ch05;

import java.util.Scanner;

public class ArrayPoint2 {
    public static void main(String[] args) {
        String[] name = {"홍길동","강감찬"};
        int[] kor = new int[2];
        int[] eng = new int[2];
        int[] math = new int[2];
        int[] total = new int[2];
        double[] avg = new double[2];
        double class_avg = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("두 학생의 국,영,수 점수를 각각 입력하세요");
        for (int i=0; i<name.length; i++){
            System.out.println(name[i]+": ");
            System.out.print("국어 ");
            kor[i] = sc.nextInt();
            System.out.print("영어 ");
            eng[i] = sc.nextInt();
            System.out.print("수학 ");
            math[i] = sc.nextInt();

            total[i] = kor[i]+eng[i]+math[i];
            avg[i] = (double) total[i]/3.0;
            class_avg = (avg[0]+avg[1])/2;
        }
            for (int i=0; i<name.length; i++){
                System.out.println("이름 : "+name[i]+"\n"+"국어 :"+kor[i]
                        +"\n"+"영어 :"+eng[i]+"\n"+"수학 :"+math[i]+"\n"+"총점 :"
                +total[i]+"\n"+"평균 :"+String.format("%.1f",avg[i])+"\n");
            }
        System.out.println("=================");
        System.out.println("학급 평균 : "+String.format("%.1f",class_avg));

    }
}
