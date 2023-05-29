

import java.util.*;

public class Ejericio01 {

	public static void main(String[] args) {
        int[][] matriz = new int[1][3];
        
        // Pedir al usuario que ingrese los elementos de la matriz //
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        // Imprimir matriz original // 
        System.out.println("Matriz original:");
        imprimirMatriz(matriz);

        // Invertir matriz
        int[][] matrizInvertida = invertirMatriz(matriz);
        
        // Imprimir matriz invertida //
        System.out.println("Matriz invertida:");
        imprimirMatriz(matrizInvertida);
    }

    // Método para invertir el orden de la matriz //
    public static int[][] invertirMatriz(int[][] matriz) {
        int[][] matrizInvertida = new int[1][3];
        
        // Recorrer la matriz original y asignar los elementos en orden inverso //
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizInvertida[i][j] = matriz[i][matriz[i].length - 1 - j];
            }
        }
        
        return matrizInvertida;
    }

    // Método para imprimir la matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
	
	
}

