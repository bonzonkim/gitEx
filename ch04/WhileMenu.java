package ch04;

import java.util.Scanner;

public class WhileMenu {
    public static void main(String[] args) {
        int menu = 0;
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("(1) 아메리카노");
            System.out.println("(2) 카페라떼");
            System.out.println("(3) 에스프레소");
            System.out.print("메뉴를 선택하세요 (1~3) 종료(0)");
            String str = sc.nextLine();
            menu = Integer.parseInt(str);//문자를 숫자로 변환해줌
            if (menu==0){
                System.out.println("프로그램을 종료합니다");
                break;
            }else if(menu < 1 || menu > 3){
                System.out.println("올바른 메뉴를 선택해주세요 종료(0)");
                continue;
            }
            System.out.println("선택 메뉴는"+ menu+"번 입니다");
        }
        sc.close();
    }
}
