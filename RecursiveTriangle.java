import java.util.Scanner;

import javax.tools.Diagnostic;

public class RecursiveTriangle {
    public static void main(String[] args) {
        int num = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el numero de '*' para la base: ");
        num = scan.nextInt();
        trianguloRecursivo(num);// Se llama al método para dibujar el triángulo recusivo con una cantidad n de
                                // "*"
        scan.close();
    }

    public static void trianguloRecursivo(int base) {
        if (base == 1) {
            System.out.println("*");// Si la base es 1 se imprime un * como la cabeza del triángulo
        } else if (base > 1) {
            trianguloRecursivo(base - 1);
            int i = 0;
            while (i < base) {
                System.out.print("*");// Imprime la cantidad de la base recursivamente - 1 hasta llegar a 1
                i++;
            }
            System.out.println();
        }
    }
}