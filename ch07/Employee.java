package ch07;

public class Employee {
    private String name;
    private String part;
    private String position;
    private int salary;
    private int bonus;//기본급의 300%
    private int total; // 기본급 + 보너스
    private int tax; // 3.3%
    private int income; // total - tax

    public void input (String name, String part, String position, int salary) {
        this.name = name;
        this.part = part;
        this.position = position;
        this.salary = salary;
    }
    public void calculate(){
        bonus = salary*3;
        total = salary + bonus;
        tax = (int) (total*0.033);
        income = total - tax;
    }
    public void print(){
        System.out.println("이름\t부서\t직위\t월급\t보너스\t총액\t세액\t실수령");
        System.out.println(name+"\t"+part+"\t"+position+"\t"+salary+"\t"+bonus+"\t"+total
                +"\t"+tax+"\t"+income);
    }
}
