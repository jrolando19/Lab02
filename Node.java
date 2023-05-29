public class Node<T> {
    private T t;
    private Node<T> list;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public T get(int i) {
        return list.get(i);
    }

    public T nextNode() {

    }

    public T root() {
        return list.get(0);

    }

    public String toString() {
        return t.toString();
    }
}