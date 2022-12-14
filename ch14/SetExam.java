package ch14;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam{
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();
        //set은 중복을 허용안함
        hs.add("Korea");
        hs.add("Japan");
        hs.add("America");
        hs.add("British");
        hs.add("Korea");

        System.out.println(hs);
        for (String str : hs) {
            System.out.println(str);
        }
        Iterator<String> it = hs.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }
    }

