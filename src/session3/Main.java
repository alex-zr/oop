package session3;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Movable move = new InterfaceEx();
        move.move();

        CloneEx first = new CloneEx();
        first.inner = new InterfaceEx();
        System.out.println(first.inner);
        CloneEx clone = (CloneEx) first.clone();
        System.out.println(clone.inner);
    }
}
