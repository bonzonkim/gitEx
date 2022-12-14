package ch04;

import java.util.Scanner;

public class While_Gugu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int scale = 1;
        System.out.print("구구단중 출력하고자 하는 단을 입력하세요 ");
        int dan = sc.nextInt();

        while (scale <= 9) {
            System.out.println(dan+"X"+scale+"="+dan*scale);
            scale++;
        }
    }
}
