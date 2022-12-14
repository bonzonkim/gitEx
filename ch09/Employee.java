package ch09;

public class Employee {
    private int num;
    public String name;
    String address;
    String email;
    protected int salary;
    private String residenceNum;
    public Employee(){}

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getResidenceNum() {
        return residenceNum;
    }

    public void setResidenceNum(String residenceNum) {
        this.residenceNum = residenceNum;
    }

    public Employee(String name, String address, String email, int salary){
        this.num = num;
        this.name = name;
        this.address = address;
        this.email = email;
        this.salary = salary;
    }

    public void print(){
        System.out.println("------------------------------------");
        System.out.println("사원번호 : "+getNum()+"\n"+"이름 : "+name+"\n"+"주소 : "+address+"\n"+
                "이메일 : "+email+"\n"+"연봉 : "+salary+"\n"+"주민번호 : "+getResidenceNum());
        System.out.println("------------------------------------");
    }
}

