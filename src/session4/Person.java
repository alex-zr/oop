package session4;

import java.io.Serializable;
import java.util.Objects;

public class Person implements Cloneable, Serializable {
    private static final long serialVersionUID = -908350566884108420L;
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }


    public final void supportPressure() {
        // TODO something important
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /*    @Override
    public int hashCode() {
            return this.name.hashCode() + this.age;
    }*/

/*    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        Person person = (Person) object;
        if ((this.name.equals(person.name)) && (this.age == person.age)) {
            return true;
        }
        return false;
    }*/
}
