public class Node<T> {
    private T t;
    private Node<T> next;

    public void set(T t) {
        this.t = t;
    }

    public void set(Node<T> next) {
        this.next = next;
    }

    public T get() {
        return t;
    }

    public Node<T> getNext() {
        return next;
    }

    public String toString() {
        return t.toString();
    }
}