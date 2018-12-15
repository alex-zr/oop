package session5;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapEx {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "1");
        map.put(2, "2");
        map.put(1, "3");

        System.out.println(map);
        map = map.entrySet().stream()
                .filter(e -> !"2".equals(e.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        //for (Map.Entry<Integer, String> entry : map.entrySet()) {
            //if (entry.getKey().equals(2)) {
                //map.remove(2);
            //}
        //}

        System.out.println(map);
    }
}
