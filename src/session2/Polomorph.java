package session2;

public class Polomorph {
    public static void main(String[] args) {
        int[] vector = {1,2,3,4,5};
        long fact = 1;
        for(int el : vector) {
            fact *= el;
        }

        System.out.println(fact);

        Person[] persons = new Person[3];
        persons[0] = new Doctor(6);
        persons[1] = new Superman("KK", 10_000);
        persons[2] = new Superman("KKent", 10_001);

        for (Person person : persons) {
            person.walk();
        }
    }
}
