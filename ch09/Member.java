package ch09;

public class Member {
    private String name;
    private String Id;
    private int purchase;
    private String grade;

    public Member(String name, String id, int purchase) {
        this.name = name;
        Id = id;
        this.purchase = purchase;
        if (purchase >= 100000){
            grade="Gold";
        }else{
            grade="Silver";
        }
    }
    public void show(){
        System.out.println(name+"\t"+Id+"\t"+purchase+"\t"+grade);
    }
}
