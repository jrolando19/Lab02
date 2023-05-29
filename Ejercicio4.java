import java.util.*;

public class Ejercicio4 {
    public static Scanner scan = new Scanner(System.in);
    public static List<Persona> personas = new ArrayList();

    public static void main(String[] args) {
        int opcion = 0;
        while (opcion != 14) {
            System.out.println("Escoge un número del menú");
            System.out.println("1. Agregar elementos a la lista");
            System.out.println("2. Agregar elemento especifico a la lista");
            System.out.println("3. Elimina toda la lista");
            System.out.println("4. Contiene una persona en específica");
            System.out.println("5. Comparar una persona de la lista");
            System.out.println("6. Que persona se encuentra en determinada posición");
            System.out.println("7. En que posicion se encuentra determinada persona (primera aparición)");
            System.out.println("8. Verificar si la lista está vacia");
            System.out.println("9. En que posicion se encuentra determinada persona (última aparición)");
            System.out.println("10. Eliminar una persona en específico");
            System.out.println("11. Reemplazar una persona por otra");
            System.out.println("12. Cuántas personas hay en la lista");
            System.out.println("13. Que personas hay de una a otra posicion determinada");
            System.out.println("14. Salir");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    introducirDatos();
                    System.out.print(personas);
                    break;

                case 2:
                    System.out.println("Introduce la posicion");
                    int posicion = scan.nextInt();
                    System.out.println("Introduce tu nombre");
                    String nombre = scan.next();
                    System.out.println("Introduce tu edad");
                    int edad = scan.nextInt();
                    System.out.println("Introduce tu género");
                    String genero = scan.next();
                    System.out.println("Introduce tu nota: ");
                    double nota = scan.nextInt();
                    Persona persona = new Persona(nombre, edad, genero, nota);
                    personas.add(posicion, persona);
                    break;

                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:

                    break;
                case 10:

                    break;
                case 11:

                    break;
                case 12:

                    break;
                case 13:

                    break;
                case 14:

                    break;

            }
        }

    }

    public static void introducirDatos() {
        int n;
        Persona persona;
        do {
            System.out.print("Número personas? ");
            n = scan.nextInt();
        } while (n < 0);
        scan.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Introduce tu nombre");
            String nombre = scan.next();
            System.out.println("Introduce tu edad");
            int edad = scan.nextInt();
            System.out.println("Introduce tu género");
            String genero = scan.next();
            System.out.println("Introduce tu nota: ");
            double nota = scan.nextInt();

            persona = new Persona(nombre, edad, genero, nota);
            personas.add(persona);
        }

    }

}