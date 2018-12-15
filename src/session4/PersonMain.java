package session4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class PersonMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person("qqq", 111);
        Person person2 = new Person("qqq", 111);
        Person personOther = new Person("www", 222);

        System.out.println("true = " + person1.equals(person1));
        System.out.println("true = " + person1.equals(person2));
        System.out.println("false = " + person1.equals(personOther));
        System.out.println("false = " + person1.equals(null));

        Object clone = person1.clone();

/*        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(
                        new File("vector.ser")))) {
            oos.writeObject(new Object[]{person1, person2, personOther, clone});
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        try (ObjectInputStream oos = new ObjectInputStream(
                new FileInputStream(
                        new File("vector.ser")))) {
            Object[] vector = (Object[]) oos.readObject();
            System.out.println(Arrays.toString(vector));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
