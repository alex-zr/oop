package session2;

import java.nio.channels.Pipe;

public class Main {
    interface Point {
        public abstract void perim();
    }

    public static void main(String[] args) {
        Doctor doc = new Doctor(5);
        System.out.println(doc);

        int intVal = (int)2.3;
        double doubVal = 3;

        Person pers = doc;
        pers.walk();

//        Doctor pseudoDoc = (Doctor) new Person();
//        pseudoDoc.performOperation();

        Person persDoc = new Doctor(3);
        ((Doctor) persDoc).setChild(new Doctor(0));
        System.out.println(persDoc.getClass().getName());

        // Local class example

        abstract class Shape {}

        new Point() {
            @Override
            public void perim() {

            }
        }.perim();

        Point run = () -> {
            System.out.println();
        };

        TraficLight light = new TraficLight();
        //light.color = "Yellow";
    }
}
