package ch03;

import java.util.Scanner;

public class Point {
    public static void main(String[] args) {
        String name;
        int kor,eng,math,total;
        double average;

        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력해주세요");
        name = sc.next();
        System.out.println("국어 점수를 입력해주세요");
        kor = sc.nextInt();
        System.out.println("영어 점수를 입력해주세요");
        eng = sc.nextInt();
        System.out.println("수학 점수를 입력해주세요");
        math = sc.nextInt();

        total = kor+eng+math;
        average = total/3.0;

        System.out.println("===============================");
        System.out.println("이름   \t국어\t영어\t수학\t총점\t평균");
        System.out.println("--------------------------------");
        System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+total+"\t"+average);
        System.out.println("===============================");

        System.out.printf("%s\t%d\t%d\t%d\t%d\t%.1f",name,kor,eng,math,total,average);
        System.out.println();
        System.out.println(String.format("%s\t%d\t%d\t%d\t%d\t%.1f",
                name,kor,eng,math,total,average));//println이지만 .format으로 printf랑 같음
    }
}
