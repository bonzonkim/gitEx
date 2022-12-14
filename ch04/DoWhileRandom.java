package ch04;

import java.util.Scanner;

public class DoWhileRandom {
    public static void main(String[] args) {
        int input = 0;
        int answer = 0;
        answer = (int)(Math.random()*10)+1;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("1과10사이의 정수를 입력하세요 ");
            String tmp = sc.next();
            input = Integer.parseInt(tmp);//문자형을 숫자형으로 변환
            if (input > answer){
                System.out.println("다운");
            }else if (input < answer){
                System.out.println("업");
            }else {
                System.out.println("정답");
            }
        }while(input != answer);
    }
}
