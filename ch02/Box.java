package ch02;

public class Box {
	public static void main(String[] args) {
		double horizontal = 10.0;
		double vertical = 5.0;
		
		double width = horizontal*vertical;
		double perimeter = 2.0 *(horizontal + vertical);
		
		System.out.println("======================");
		System.out.println("사각형의 넓이 : "+width);
		System.out.println("사각형의 둘레 : "+perimeter);
		System.out.println("======================");
		
		
	}
}
