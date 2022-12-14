package ch14;

import java.util.*;

//map == dictionary
public class MapExam {
    public static void main(String[] args) {
        //List : 순서대로저장, map : 순서없음
        //Map<key,value>
        Map<String, String> map = new HashMap<>();
        map.put("한국", "서울"); //put == add
        System.out.println(map.get("한국"));
        map.put("일본", "도쿄");
        map.put("중국", "베이징");
        map.put("미국", "워싱턴");
        map.put("태국", "방콕");
        map.put("영국", "런던");
        System.out.println(map);
        String nation = "영국";
        System.out.println(nation + "의 수도는 " + map.get(nation));

        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            String key = (String)iterator.next();
            System.out.print("key= " + key);
            System.out.println(",value= " + map.get(key));

        }

        //ArrayList
//        List<String> nations = new ArrayList<>();
//        nations.add("영국");
//        nations.add("한국");
//        nations.add("중국");
//        nations.add("미국");
//        nations.add("일본");
//        List<String> capital = new ArrayList<>();
//        capital.add("런던");
//        capital.add("서울");
//        capital.add("베이징");
//        capital.add("워싱턴");
//        capital.add("도쿄");
//
//        String nation = "영국";
//        for (int i = 0; i < nations.size(); i++) {
//            if (nations.get(i).equals(nation)) {
//                System.out.println(nations.get(i) + "의 수도는 " + capital.get(i));
//                break;
//            }
//        }
    }
}
