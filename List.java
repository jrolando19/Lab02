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

    // Inserta un nodo al final
    public void insertarAlFinal(T data) {
        if (this.root == null)
            this.root = new Node<T>(data);
        else {
            Node<T> newNode = new Node<T>(data);// crea un nodo
            Node<T> nodoActual = root;
            while (nodoActual.getNext() != null) {// bucle que recorre nodo por nodo
                nodoActual = nodoActual.getNext();// asigna a nodoActual el nodo siguiente
            }
            nodoActual.set(newNode);// Cuando llega al nodo final asigna a nodoActual como el siguiente nodo
                                    // vinculado
        }
    }

    public String toString() {
        String listado = "";
        Node<T> nodoActual = root; // Asigna a nodoActual el nodo cabecera (root)
        while (nodoActual != null) {// bucle que recorre la lista
            listado += nodoActual.toString() + "\n";// concatena el nodoActual como cadena al string listado
            nodoActual = nodoActual.getNext();// pasa al siguiente nodo enlazado
        }
        return listado;
    }
}