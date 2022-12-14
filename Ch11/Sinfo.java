package Ch11;

public class Sinfo implements Student{
    int kor = 90, eng = 85, math = 79;
    int total;
    double avg;
    String name = "홍길동";
    String address = "서울시 강남구";
    String email = "hong@gmail.com";

    @Override
    public void showInfo() {
        System.out.println("========================");
        System.out.println("이름\t주소\t이메일");
        System.out.println(name+"\t"+address+"\t"+email);
        System.out.println("--------------------------");
    }

    @Override
    public void showGrade() {
        System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
        System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+total+"\t"+String.format("%.1f",avg));

    }
}
