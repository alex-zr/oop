package session5;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetEx {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(3);
        set.add(2);
        set.add(1);
        set.add(1);

        System.out.println(set.contains(5));
        System.out.println(set); //

/*        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
      *//*          if (o1 > o2) {
                    return 1;
                } else if (o2 > o1) {
                    return -1;
                } else {
                    return 0;
                }*//*
            }
        };*/
        SortedSet<Integer> sSet = new TreeSet<>((o1, o2) -> o2 - o1);
        sSet.add(3);
        sSet.add(2);
        sSet.add(1);
        sSet.add(1);
        System.out.println(sSet);
    }
}
