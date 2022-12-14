package ch06;

public class OverloadEx3 {
    static int tax;
    static int income;

    public static void main(String[] args) {
        print("홍길동","hong@gmail.com","010-1234-5678");
        print("이순신",99,87,76.0);
        print("김과장",560,tax,income);
    }
    static void print(String name, String email, String hp){
        System.out.println("==============================");
        System.out.println("이름\t이메일\t\t전화");
        System.out.println(name+"\t"+email+"\t"+hp);
    }
    static void print(String name, int a1, int a2, double a3){
        System.out.println("==============================");
        System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
        System.out.println(name+"\t"+a1+"\t"+a2+"\t"+(int)a3+"\t"+(int)(a1+a2+a3)
                +"\t"+String.format("%.1f",(a1+a2+a3)/3.0));
    }
//    static void print(String name, int money){
//        double tax = money*0.3;
//        int total = (int) (money-tax);
//        System.out.println("이름\t급여\t세금\t실수령액");
//        System.out.println("==============================");
//       System.out.println(name+"\t"+money+"\t"+tax+"\t"+total);
//    }
    static void print(String name, int salary,  int tax, int inc){
        tax = (int) (salary*0.3);
        inc = salary-tax;
        System.out.println("==============================");
        System.out.println("이름\t급여\t세금\t실수령액");
        System.out.println(name+"\t"+salary+"\t"+tax+"\t"+inc);
    }
}
