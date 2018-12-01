package session3;

public interface Movable extends Cloneable {
    int myConst = 8;
    void move();

    default void add() {
        // TODO
    }
}
