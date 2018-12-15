package session5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4));
        System.out.println(list);

        List<String> res = list.stream()
                .filter(e -> e % 2 == 0)
                .sorted((o1, o2) -> o2 - o1 )
                .map(e -> "'" + e + "'")
                .collect(Collectors.toList());

        for (String re : res) {

        }
        System.out.println(res);
    }
}
