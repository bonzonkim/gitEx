package ch07;

public class EmployeeUse2 {
    public static void main(String[] args) {
        Employee2 em = new Employee2();

        em.setName("김철수");
        em.setDepart("관리부");
        em.setPosition("과장");
        em.setSalary(300);
        em.calcualte();
        em.print();
    }
}
