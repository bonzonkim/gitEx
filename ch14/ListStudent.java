package ch14;

import java.util.ArrayList;

public class ListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("20221201","김철수","국사",1,"박교수"));
        list.add(new Student("20221202","김본전","영문",2,"김교수"));
        list.add(new Student("20221203", "김철수", "수학", 3, "홍교수"));
        System.out.println("학번\t이름\t전공\t학년\t교수");
//        for (int i = 0; i < list.size(); i++) {
//            Student s = list.get(i);
//            System.out.println(s.getNum() + "\t" + s.getName() + "\t" + s.getMajor() + "\t" + s.getYear() + "\t" + s.getProfessor());
//
//        }
        for (Student s : list){
            System.out.println(s.getNum() + "\t" + s.getName() + "\t" + s.getMajor() + "\t" + s.getYear() + "\t" + s.getProfessor());
        }
    }
}
