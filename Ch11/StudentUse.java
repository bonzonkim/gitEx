package Ch11;

public class StudentUse {
    public static void main(String[] args) {
    Sinfo s = new Sinfo();
    s.total = s.kor+s.eng+s.math;
    s.avg = s.total/3.0;
    s.showInfo();
    s.showGrade();
    }
}
