package session3;

public class InterfaceEx implements Movable, Movable2, Comparable<InterfaceEx> {
    @Override
    public void move() {
        // TODO
    }

    @Override
    public void add() {
        Movable ex = new InterfaceEx();
        add();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int compareTo(InterfaceEx o) {
        return 0;
    }
}
