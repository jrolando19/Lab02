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

    public Node<T> getRoot() {
        return this.root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }

    // inserta un nodo al inicio de la lista
    public void insertarInicio(T data) {
        if (this.root == null)// Si la tabla esta vacia
            this.root = new Node<T>(data);// Crea un nodo, almacena el valor de data y lo asigna como nodo de cabecera
        else {
            Node<T> newNode = new Node<T>(data);// crea un nodo
            newNode.setNext(root);// Vincula el nodo cabecera a newNode
            setRoot(newNode);// Asigna como nodo de cabecera a newNode
        }
    }
}