package ch07;

public class Employee2 {
    private String name;
    private String depart;
    private String position;
    private int salary;
    private int bonus;
    private int total;
    private int tax;
    private int income;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void calcualte(){
        bonus = salary*3;
        total = salary + bonus;
        tax = (int) (total*0.033);
        income = total - tax;
    }
    public void print(){
        System.out.println("이름\t부서\t직위\t월급\t보너스\t총액\t세액\t실수령");
        System.out.println(name+"\t"+depart+"\t"+position+"\t"+salary+"\t"+bonus+"\t"+total
                +"\t"+tax+"\t"+income);
    }
}
