package ch02;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 정수값 ? ");
		int x = sc.nextInt();
		System.out.println("두번째 정수값 ? ");
		int y = sc.nextInt();
		System.out.printf("%d * %d은 %d 입니다. \n",x,y,x*y);
		sc.close();
		
	}
}
