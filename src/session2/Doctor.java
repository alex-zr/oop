package session2;

public class Doctor extends Person {
    private int practice;
    private Person child = new Superman( "Klark", 0);

    public Doctor() {
    }

    public Doctor(int practice) {
        this.practice = practice;
    }

    @Override
    public void walk() {
        System.out.println("I can walk and cure simultaniously, and I love my " +
                child.getName());
    }

/*    @Override
    public void supportPressure() {
        // TODO something destructive
    }*/

    public Person getChild() {
        return child;
    }

    public void setChild(Person child) {
        this.child = child;
    }

    public void performOperation() {
        System.out.println("Yaahoo!");
    }

    public int getPractice() {
        return practice;
    }

    public void setPractice(int practice) {
        this.practice = practice;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "practice=" + practice +
                '}';
    }
}
