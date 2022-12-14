package ch04;

import java.util.Scanner;

public class ControlEx {
    public static void main(String[] args) {
        int menu = 0;
        int num = 0;
        Scanner sc = new Scanner(System.in);

        outer:
        while (true) {
            System.out.println("(1) square(제곱)");
            System.out.println("(2) square root(제곱근)");
            System.out.println("(3) log(로그)");
            System.out.print("원하는 메뉴 (1~3)를 선택하세요 (종료:0)  ");
            String str = sc.next();
            menu = Integer.parseInt(str);
            if (menu == 0) {
                System.out.println("프로그램을 종료합니다");
                break;
            } else if (menu < 1 || menu > 3) {
                System.out.println("올바른 메뉴를 선택해주세요 (종료:0)");
                continue;
            }
            for (; ; ) {
                System.out.print("계산할 값을 입력하세요 (계산종료 :0, 전체종료 :99)");
                str = sc.next();
                num = Integer.parseInt(str);
                if (num == 0) {
                    break; //for문만 빠져나감
                } else if (num == 99) {
                    break outer; //전체 반복문을 빠져나감 while
                }
                switch (menu) {
                    case 1:
                        System.out.println("result=" + num * num);
                        break;
                    case 2:
                        System.out.println("result=" + Math.sqrt(num));
                        break;
                    case 3:
                        System.out.println("result=" + Math.log(num));
                        break;
                }
            }

        }
    }
}
