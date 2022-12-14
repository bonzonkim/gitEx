package ch06;

import java.util.Scanner;

public class rkdqjarn {
    public static void main(String[] args) {

        String line = "----------------------------------------------------"; // 줄 선언

        Scanner sc = new Scanner(System.in); // 스캐너 호출

        System.out.print("학생수를 입력하시오 : ");// 스캐너 입력 받을 때 필요한 정보(학생 수) 제공
        int num = sc.nextInt();// int형 변수 num을 선언 후 스캐너로 입력 받은 값으로 초기화

        int[][] score = new int[num][3]; // 입력 받은 값(학생 수)의 행의 길이를 가진 int형 타입의 2중 배열 score 선언
        char[] grade = new char[num];// 입력 받은 값(학생 수)의 얄의 길이를 가진 char형 타입의 배열 grade 선언

        System.out.println("국, 영, 수 점수를 각각 입력하세요 :");// 스캐너 입력 받을 때 필요한 정보(국, 영, 수 점수) 제공

        for (int i = 0; i < score.length; i++) {

            System.out.print(i + 1 + "번 학생의 점수 : ");// 스캐너 입력 받을 때 필요한 정보(i + 1번 학생의 점수) 제공
            for (int j = 0; j < score[i].length; j++) {
                score[i][j] = sc.nextInt();
                // 2중 for문을 사용하여 입력받은 값 들을 각 배열에 초기화
            }
        }

        System.out.println(line);// 줄 출력
        System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t등급");// 상단 정보 입력
        System.out.println(line);// 줄 출력

        for (int i = 0; i < score.length; i++) {
            int sum = 0;// 총점
            float avg = 0.0f;// 평균

            System.out.print((i + 1) + "\t" + score[i][0] + "\t" + score[i][1] + "\t" + score[i][2] + "\t");
            // for문을 사용해서 학생의 학번, 각 배열의 국어, 영어, 수학 점수를 출력
            sum = score[i][0] + score[i][1] + score[i][2];
            // 국, 영, 수 점수를 더해서 sum 변수에 초기화
            avg = sum / (float) 3.0;
            // 총점을 (float)으로 형변환한 3.0으로 나눈 값을 avg 변수에 초기화

            // 등급 메기기
            if (avg > 90) {// 만약 평균이 90점을 넘는다면,
                grade[i] = 'A';// 열의 등급 값을 'A'로 초기화
            } else if (avg > 80) {// 만약 평균이 80점을 넘는다면,
                grade[i] = 'B';// 열의 등급 값을 'B'로 초기화
            } else if (avg > 70) {// 만약 평균이 70점을 넘는다면,
                grade[i] = 'C';// 열의 등급 값을 'C'로 초기화
            } else if (avg > 60) {// 만약 평균이 60점을 넘는다면,
                grade[i] = 'D';// 열의 등급 값을 'D'로 초기화
            } else {// 만약 평균이 60점을 넘지 못한다면,
                grade[i] = 'F';// 열의 등급 값을 'F'로 초기화
            }

            System.out.printf("%d\t%3.1f\t%c\n", sum, avg, grade[i]);
            // 총점, 평균, 등급 값을 printf를 사용해 출력
        }
        System.out.println(line); // 줄 출력
        sc.close();// 스캐너 종료
    }
}
