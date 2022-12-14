package ch04;

import java.util.Scanner;

public class BreakAVG {
    public static void main (String[] args){
        int total = 0;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("점수를 입력하세요 : ");
            int num = sc.nextInt();
            if (num < 0){
                break;
            }
            total += num;
            count++;
        }
        System.out.println("평균은" + total/count);
    }
}
