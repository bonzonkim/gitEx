package ch02;

import java.util.Scanner;

public class Add_input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		int sum;
		
		System.out.print("첫번째 정수를 입력하세요 : ");
		x = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		y = sc.nextInt();
		
		sum = x+y;
		
		System.out.println(sum);
		sc.close();
		
		
		
	}
}
