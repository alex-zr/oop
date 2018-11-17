package session2;

public class Superman extends Person {
    public Superman(String name, int age) {
        super(name, age);
    }

    @Override
    public void walk() {
        System.out.println("I can move by anyway");
    }
}
