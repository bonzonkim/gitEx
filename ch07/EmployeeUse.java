package ch07;

public class EmployeeUse {
    public static void main(String[] args) {
        Employee em  = new Employee();

        em.input("박춘배","개발","백엔드",500);
        em.calculate();
        em.print();
    }
}
