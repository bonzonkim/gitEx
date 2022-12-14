package ch07;

public class Auction {
    private String name;
    private String id;
    private int purchase;
    private String grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPurchase() {
        return purchase;
    }

    public void setPurchase(int purchase) {
        this.purchase = purchase;
    }

    public String getGrade() {
        if (purchase >= 100000){
            grade = "Gold";
        }else {
            grade = "Silver";
        }
        return grade;
    }
    public void print(){
        System.out.println("이름\t아이디\t구매금액\t등급");
        System.out.println(name+"\t"+id+"\t"+purchase+"\t"+grade);
    }

}
