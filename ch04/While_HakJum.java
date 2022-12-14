package ch04;

import java.util.Scanner;

public class While_HakJum {
    public static void main(String[] args) {
        int kor,eng,math,total;
        double avg;
        String grade ="";
        String result = "";
        int i = 0;

        Scanner sc = new Scanner(System.in);

        while (i<=2){

            System.out.print("국어 : ");
            kor = sc.nextInt();
            System.out.print("영어 : ");
            eng = sc.nextInt();
            System.out.print("수학 : ");
            math = sc.nextInt();
            total = kor+eng+math;
            avg = total/3.0;

            if (avg>=90){
                grade ="수";
            }else if (avg>=80){
                grade ="우";
            }else if (avg>=70){
                grade ="미";
            }else if (avg>=60){
                grade ="양";
            }else {
                grade = "가";
            }

            result += kor+"\t"+eng+"\t"+math+"\t"+total+"\t"+String.format("%.1f", avg)+"\t"+grade+"\n";
            i++;
        }
        System.out.println("=======================================");
        System.out.println("국어\t영어\t수학\t총점\t평균\t등급");
        System.out.println(result);
        System.out.println("=======================================");


    }
}
