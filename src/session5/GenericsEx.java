package session5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class GenericsEx {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(1);
        System.out.println(list);
        System.out.println(list.indexOf(2)); // 1
        list.remove(Integer.valueOf(1)); //
        System.out.println(list); // [3, 2]

        Iterator<Integer> itr = list.iterator();
        list.add(1);
        itr.hasNext();
        while(itr.hasNext()) {
            System.out.println(itr.next());
            itr.remove();
        }
        for (Integer integer : list) {
            System.out.println(integer);
        }
        itr.forEachRemaining(System.out::println);

        Collection coll;
        new Operation<>(12);
    }
}

class Operation<T extends Number> {
    T obj;

    public Operation(T obj) {
        this.obj = obj;
    }

    public void add (T first, T second) {
        System.out.println(first.doubleValue() +
                first.doubleValue());
    }
}