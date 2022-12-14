package ch05;

public class ScoreAverage {
    public static void main(String[] args) {
        //1~4학년당 1,2학기 평점
        double score[][] = {{3.3,3.4},{3.5,3.6},{3.7,4.0},{4.1,4.2}};

        double sum = 0.0;
        for (int year = 0; year < score.length; year++) {
            for (int term=0; term<score[year].length; term++){
                sum += score[year][term];
            }
        }
        int n = score.length;
        int m = score[0].length;

        System.out.println("4학년 전체 평점 평균은 "+sum/(n*m));

    }
}
