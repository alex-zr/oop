package session3;

import java.util.Arrays;

public class SortEx extends Object {
    public static void main(String[] args) {
        Movable[] vector = {
                new InterfaceEx(),
                new InterfaceEx()
        };

        System.out.println(Arrays.toString(vector));

        Arrays.sort(vector);

        System.out.println(Arrays.toString(vector));
    }
}
