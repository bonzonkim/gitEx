package ch07;

import ch04.Sum;

public class StudentUse {
    public static void main(String[] args) {
        Student st = new Student();

        st.setName("박춘배");
        st.setMajor("CS");
        st.setYear(2);
        st.setNum("202112055");
        st.setPoint(4.3);
        st.setMoney(4000000);
        st.print();
    }
}
