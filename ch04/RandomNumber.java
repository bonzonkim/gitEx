package ch04;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Random generator = new Random();
        Scanner sc  = new Scanner(System.in);
        System.out.print("난수의 갯수 ");
        int count = sc.nextInt();
        int sum = 0;

        for (int i = 0; i<count; i++){
            int number = generator.nextInt(100);
            System.out.println("생성된 난수 " + number);
            sum+=number;
        }
        System.out.print("난수 "+count+"개의 합은"+sum);

        Scanner sc1  = new Scanner(System.in);
        System.out.print("난수의 갯수 ");
        int count1 = sc.nextInt();
        int sum1 = 0;

        for (int i = 0; i<count1; i++){
            int number = (int)Math.random()*100+1;
            System.out.println("생성된 난수 " + number);
            sum+=number;
        }
        System.out.print("난수 "+count+"개의 합은"+sum);
    }
}
