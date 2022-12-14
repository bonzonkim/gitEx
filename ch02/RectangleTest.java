package ch02;

import java.util.Scanner;

public class RectangleTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("직사각형의 가로 길이를 입력하세요 : ");
		int horizontal = sc.nextInt();
		System.out.print("직사각형의 세 길이를 입력하세요 : ");
		int vertical = sc.nextInt();
		double width = horizontal * vertical;
		System.out.print("직사각형의 넓이는 : "+width);
		
		
	}
}
