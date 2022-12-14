package ch02;

public class RealTypeEx {

	public static void main(String[] args) {
		double d = 0.1234;
		double e = 1234E-4;// 1234*10-4승 == 0.1234
		float f = 0.1234f;//float 는 무조건 f를 붙여줘야함
		double w = .1234D;
		
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(w);
	}
}
