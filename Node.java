public class Node<T> {
    private T t;
    private Node<T> list;
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

    public T get(int i) {
        return list.get(i);
    }

    public Node<T> nextNode() {
        return next;
    }

    public T root() {
        return list.get(0);

    }

    public String toString() {
        return t.toString();
    }
}