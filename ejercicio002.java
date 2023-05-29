import java.util.Scanner;

public class ejercicio002 {
    static int numRotaciones;

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int[] a = { 1, 2, 3, 4, 5, 6 };
	imprimirArray(a);

	System.out.print("Ingrese el número de rotaciones a la izquierda: ");
	numRotaciones = sc.nextInt();
	int[] arregloRotado = rotarIzquierda(a);
	imprimirArray(arregloRotado);

    }

    public static void rotar1Izquierda(int[] Aiz) {
	// Procedimiento para rotar la matriz 1 posición izquierda
	int primero = Aiz[0];
	for (int i = 0; i < Aiz.length - 1; i++) {
	    Aiz[i] = Aiz[i + 1];
	}
	Aiz[Aiz.length - 1] = primero;
    }

    public static int[] rotarIzquierda(int[] A) {
	// Procedimiento para clonar la matriz A en Aiz
	int[] Aiz = new int[A.length];
	for (int i = 0; i < A.length; i++) {
	    Aiz[i] = A[i];
	}

	//Rotar n veces el arreglo a la izquierda
	for (int i = 0; i < numRotaciones; i++) {
	    rotar1Izquierda(Aiz);
	}

	return Aiz;
    }
    
    public static void imprimirArray(int[] array) {
	System.out.print("[ ");
	for (int i = 0; i < array.length; i++) {
	    System.out.print(array[i] + " ");
	}
	System.out.println("]");
    }
}