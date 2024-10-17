package Chapter13.Exercise;

public class Container<T, M> {
    private T t1;
    private M m1;

    public Container() {
    }

    public void set(T t1, M m1) {
        this.t1 = t1;
        this.m1 = m1;
    }

    public T getKey() {
        return this.t1;
    }

    public M getValue() {
        return this.m1;
    }

}
