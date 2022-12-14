package ch09;

public class Scholar extends Student{
    private String category;
    private int money;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void print() {
        System.out.println("이름\t학번\t전공\t학년\t구분\t장학금액");
        System.out.println(getName()+"\t"+getNum()+"\t"+getMajor()+"\t"+getYear()+"\t"+category+"\t"+money);
    }
    public void print2() {
        System.out.println("이름\t학번\t전공\t학년");
        System.out.println(getName()+"\t"+getNum()+"\t"+getMajor()+"\t"+getYear());
    }

}
