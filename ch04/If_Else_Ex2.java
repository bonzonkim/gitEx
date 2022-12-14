package ch04;

public class If_Else_Ex2 {
    public static void main(String[] args) {
        int kor = 85;
        int math = 90;
        int eng = 70;
        int total = kor+math+eng;
        double average = total/3.0;
        String grade = "";
        if(average >= 90){
            grade = "수";
        }else if(average >= 80){
            grade = "우";
        }else if(average >= 70) {
            grade = "미";
        }else if(average >= 60) {
            grade = "양";
        }else{
            grade = "가";
        }

        System.out.println("국어\t영어\t수학\t총점\t평균\t등급");
        System.out.println(kor+"\t"+eng+"\t"+math+"\t"+total+"\t"+average+"\t"+grade);
        System.out.printf("%d\t%d\t%d\t%d\t%.1f\t%s",kor,eng,math,total,average,grade);
    }
}
