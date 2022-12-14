package ch09;

public class ScholarUse {
    public static void main(String[] args) {
        Scholar s1 = new Scholar();
        s1.setName("김철수");
        s1.setNum("2203");
        s1.setMajor("컴공");
        s1.setYear(2);
        s1.setCategory("1종");
        s1.setMoney(2500000);
        s1.print();

        s1.setName("홍길동");
        s1.setNum("2023");
        s1.setMajor("사회");
        s1.setYear(3);
        s1.print2();


    }
}
