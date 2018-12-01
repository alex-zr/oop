package session2;

public class Exceptions {
    public static void main(String[] args) {

        try {
            int[] vector = new int[1]; // [0]
            System.out.println(vector[1]); // [0, 1]
            throwEx();
            Person[] persons = new Person[1]; // [null]
            System.out.println(persons[0].getName());
        } catch (NullPointerException npe) {
            System.err.println("Person name is not available");
            // save log info
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            aioobe.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("In any case");
    }

    public static void throwEx() throws Exception {
        throw new Exception();
    }
}
