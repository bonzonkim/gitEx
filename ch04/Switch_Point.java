package ch04;

public class Switch_Point {
    public static void main(String[] args) {
        int kor = 85;
        int math = 90;
        int eng = 70;
        int total = kor+math+eng;
        double avg = total/3.0;
        String grade = "";

        switch ((int)avg/10){ //double을 int로 강제형변환
            case 10:
            case 9: grade = "수"; break;
            case 8: grade = "우"; break;
            case 7: grade = "미"; break;
            case 6: grade = "양"; break;
            default: grade = "가";
        }
        System.out.println("국어\t영어\t수학\t총점\t평균\t등급");
        System.out.printf("%d\t%d\t%d\t%d\t%3.1f\t%s",kor,eng,math,total,avg,grade);

    }
}
