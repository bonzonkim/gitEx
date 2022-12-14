package ch04;

import java.util.Scanner;

public class Ecost {
    public static void main(String[] args) {
        String name = "";
        int price = 0;
        int point = 0;
        int point_use = 0;
        int dilfee = 0;
        int pay = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요 ");
        name = sc.nextLine();
        System.out.print("구매 금액 : ");
        price = sc.nextInt();
        System.out.print("보유한 포인트 :");
        point = sc.nextInt();
        sc.close();

        if (price < 20000){
            dilfee = 2500;
        }
        if (point >= 10000){
            point_use = point;
            pay = price + dilfee - point;
        }else {
            pay = price + dilfee;
        }

        System.out.println("이름\t구매금액\t배송료\t포인트사용\t결제금액");
        System.out.println(name+"\t"+price+"\t"+dilfee+"\t"+point_use+"\t"+pay);























    }
}
