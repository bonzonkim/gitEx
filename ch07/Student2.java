package ch07;

public class Student2 {
    private String name;
    private String major;
    private int year;
    private String num;
    private double point;
    private int money;
    private int scholarship;

    public void input(String name, String major, int year, String num,
                      double point, int money){
        this.name = name;
        this.major = major;
        this.year = year;
        this.num = num;
        this.point = point;
        this.money = money;
        if (point >= 4.3){
            scholarship = money;
        }else if(point >= 4.0){
            scholarship = 250;
        } else if (scholarship >= 3.5) {
            scholarship = 100;
        }else {
            scholarship = 0;
        }
    }
    public void print(){
        System.out.println("이름\t전공\t학년\t학번\t평점평균\t등록금\t장학금");
        System.out.println(name+"\t"+major+"\t"+year+"\t"+num+"\t"+
                point+"\t"+money+"\t"+scholarship);
    }
}
