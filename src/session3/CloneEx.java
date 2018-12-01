package session3;

public class CloneEx implements Cloneable {
    public InterfaceEx inner;
    @Override
    public Object clone() throws CloneNotSupportedException {
        CloneEx clone = (CloneEx) super.clone();
        clone.inner = (InterfaceEx) this.inner.clone();
        return clone;
    }
}
