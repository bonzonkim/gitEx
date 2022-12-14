package ch07;

public class Student{
    private String name;
    private String major;
    private int year;
    private String num;
    private double point;
    private int money;
    private int scholarship;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getScholarship() {
        //장학금 계산 (3.5이상 100만원, 4.0이상 250 4.3이상 전액)
        if (point >= 4.3){
            scholarship = money;
        }else if(point >= 4.0){
            scholarship = 250;
        } else if (scholarship >= 3.5) {
            scholarship = 100;
        }else {
            scholarship = 0;
        }
        return scholarship;
    }

    public void print(){
        System.out.println("이름\t전공\t학년\t학번\t평점평균\t등록금\t장학금");
        System.out.println(name+"\t"+major+"\t"+year+"\t"+num+"\t"+
                point+"\t"+money+"\t"+getScholarship());
    }






//    public void setScholarship(int scholarship) {
//        this.scholarship = scholarship;
//    }
}
