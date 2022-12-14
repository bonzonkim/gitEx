package ch02;

public class PrintfEx {
	public static void main(String[] args) {
		int i = 97;
		int d = 3000;
		String s = "Java";
		double f = 3.14;
		
		System.out.printf("%d\n",i);
		System.out.printf("%o\n",i);
		System.out.printf("%x\n",i);
		System.out.printf("%c\n",i);
		System.out.printf("%5d\n",d);
		System.out.printf("%-5d\n",d);
		System.out.printf("%-5d\n",d);
		System.out.printf("%05d\n",d); //3자리마다 콤마 처리
		System.out.printf("%s\n",s);
		System.out.printf("%5s\n",s);//총 길이를 5로 만듬 (공백java)출
		System.out.printf("%-5s\n",s);
	    System.out.printf("%f\n",f);
	    System.out.printf("%e\n",f);
	    System.out.printf("%4.1f\n",f);
	    System.out.println(String.format("%4.1f", f));
	    System.out.printf("%.1f\n",f);//전체자리수는 정하지 않고 소수점 첫째 자리까지만 지정
	   System.out.printf("%04.1f\n",f);
	   System.out.printf("%-4.1f\n",f);
	   
	   int a = 3, b=5;
	   
	   System.out.printf("a%%b=%d\n",a%b);
		
	}

}
