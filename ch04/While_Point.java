package ch04;

import java.util.Scanner;

public class While_Point {
    public static void main(String[] args) {
        int total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("더할 값을 입력하세요 ");
        int num = sc.nextInt();//첫 입력값

        while(num != 0){
            total+=num;
            System.out.println("현재 누적된 값 : "+total);
            System.out.println("계속 입력하세요 (종료시 0 입력");
            num = sc.nextInt();//이게 없으면 무한루프로 첫 입력값을 무한으로 계속더함
        }
        System.out.println("총 누적합 " + total);
        System.out.println("프로그램 종료");
    }
}
