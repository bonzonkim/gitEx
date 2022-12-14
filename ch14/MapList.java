package ch14;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class MapList {
    static void print(Map<String,Object> map){
        ArrayList<Student> list2 = (ArrayList<Student>)map.get("list");
        for (Student s : list2) {
            System.out.println(s.getNum()+"\t"+s.getName()+"\t"+
                    s.getMajor()+"\t"+s.getYear()+"\t"+s.getProfessor());
        }
    }

    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        List<Student> list = new ArrayList<>();
        list.add(new Student("22045","김김김","컴공",2,"박교수"));
        list.add(new Student("22044","이이이","영어",3,"홍교수"));
        list.add(new Student("22043","최최최","컴공",1,"장교수"));
        map.put("list",list);
        print(map);
    }
}
