package ch05;

import java.util.Scanner;

public class MultiArrEx2 {
    public static void main(String[] args) {
        String[][] words = {{"chair", "의자"}, {"computer", "컴퓨터"}, {"integer", "정수"}};
        String toQuit = "-1";

        outter:
        while (true) {
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < words.length; i++) {
                System.out.printf("문제%d)) %s의 뜻은? ", i + 1, words[i][0]);
                String tmp = sc.next();
                if (tmp.equals(words[i][1])) {
                    System.out.printf("정답입니다.%n%n");
                } else if (tmp.equals(toQuit)) {
                    System.out.println("프로그램을 종료합니다");
                    break outter;
                }else {
                    System.out.printf("오답입니다. 정답은 %s 입니다. %n%n", words[i][1]);
                }
            }
        }
    }
}

