package ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EcUse {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        List<EC> list = new ArrayList<>();

        list.add(new EC(1234,"2022-08-24","하이트맥주"
        ,"삼성","37918232268",55900));
        list.add(new EC(2345, "2022-09-11", "꼬깔콘", "롯데", "35691222245",
                23600));
        list.add(new EC(3456, "2022-10-29", "노트북", "현대", "36160111182",
                2600000));

        map.put("list", list);
        EC.print(map);
    }
}
