package ch07;

public class Point {
    private String name;
    private int kor;
    private int eng;
    private int math;
    private int total;
    private double avg;
    private String grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getTotal() {
        total = kor+eng+math;
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public double getAvg() {
        avg = total/3.0;
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public String getGrade() {
        if (avg >= 90){
            grade = "A";
        }else if (avg >= 80){
            grade = "B";
        }else if(avg >= 70){
            grade = "C";
        } else if (avg >= 60) {
            grade = "D";
;        }else {
            grade = "F";
        }
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    public void print(){
        System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t등급");
        System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+getTotal()+"\t"+
                String.format("%.1f",getAvg())+"\t"+getGrade());
    }
}
