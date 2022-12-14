package ch03;

import java.util.Scanner;

public class Jumsoo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        int java;
        int db;
        int html;
        int jsp;
        int total;
        double average;

        System.out.print("이름을 입력하세요 ");
        name = sc.nextLine();
        System.out.println(name+"의 Java 점수를 입력하세요 ");
        java = sc.nextInt();
        System.out.println(name+"의 DB 점수를 입력하세요 ");
        db = sc.nextInt();
        System.out.println(name+"의 HTML 점수를 입력하세요 ");
        html = sc.nextInt();
        System.out.println(name+"의 JSP 점수를 입력하세요 ");
        jsp = sc.nextInt();

        total = java+db+html+jsp;
        average = (double)total/4.0;
        System.out.println("================================");
        System.out.println("이름\t\tJava\tDB\thtml\tJSP\t총점\t평균");
        System.out.println("--------------------------------");
        System.out.printf("%s\t\t%d\t%d\t%d\t%d\t%d\t%.1f\n",name,java,db,html,jsp,total,average);
        System.out.println("================================");



    }
}
