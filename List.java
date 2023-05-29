public class List<T> {
    protected Node<T> root;

    // Constructores
    public List(T data) {
        Node<T> newRoot = new Node<T>(data);// Crea el objeto nodo que almacenara el valor de data
        this.root = newRoot;// asigna el nodo creado como el nodo cabecera de la lista
    }

    public List() {
        this.root = null;
    }
}