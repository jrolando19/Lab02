import java.util.*;

public class Ejercicio4 {
    public static Scanner scan = new Scanner(System.in);
    public static List<Persona> personas = new ArrayList<Persona>();

    public static void main(String[] args) {
        int opcion = 0;
        while (opcion != 14) {
            System.out.println("\nEscoge un número del menú");
            System.out.println("1. Agregar elementos a la lista");
            System.out.println("2. Agregar elemento especifico a la lista");
            System.out.println("3. Elimina toda la lista");
            System.out.println("4. Contiene una persona en específica");
            System.out.println("5. Comparar una persona de la lista");
            System.out.println("6. Que persona se encuentra en determinada posición");
            System.out.println("7. En que posicion se encuentra determinada persona (primera aparición)");
            System.out.println("8. Verificar si la lista está vacia");
            System.out.println("9. En que posicion se encuentra determinada persona (última aparición)");
            System.out.println("10. Eliminar una persona por su posición");
            System.out.println("11. Eliminar una persona por sus datos");
            System.out.println("12. Reemplazar una persona por otra");
            System.out.println("13. Cuántas personas hay en la lista");
            System.out.println("14. Que personas hay de una a otra posicion determinada");
            System.out.println("15. Salir");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    introducirDatos();
                    System.out.print(personas);
                    break;
                case 2:
                    System.out.println("Introduce la posicion");
                    int posicion = scan.nextInt();
                    personas.add(posicion, registro());
                    System.out.print(personas);
                    break;
                case 3:
                    personas.clear();
                    System.out.print(personas);
                    break;
                case 4:
                    System.out.println("Es: " + personas.contains(registro()));
                    break;
                case 5:
                    // System.out.println("Es: "+personas.equals(registro()));
                    break;
                case 6:
                    System.out.println("Introduce la posicion");
                    int posicion2 = scan.nextInt();
                    System.out.println(personas.get(posicion2));
                    break;
                case 7:
                    System.out.println("Posicion: " + personas.indexOf(registro()));
                    break;
                case 8:
                    System.out.println("La lista esta vacia: " + personas.isEmpty());
                    break;
                case 9:
                    System.out.println("Posicion: " + personas.lastIndexOf(registro()));
                    break;
                case 10:
                    System.out.println("Introduce la posicion de la persona a eliminar");
                    int posicion3 = scan.nextInt();
                    System.out.println(personas.remove(posicion3));
                    System.out.println(personas);
                    break;
                case 11:
                    System.out.println("Se eliminó la persona: " + personas.remove(registro()));
                    System.out.println(personas);
                    break;
                case 12:
                    System.out.println("Se eliminó la persona: " + personas.remove(registro()));
                    System.out.println(personas);
                    break;
                case 13:
                    System.out.println("Hay " + personas.size() + " personas");
                    break;
                case 14:
                    System.out.println("Introduce el rango de posiciones de la sublista");
                    int posicion5 = scan.nextInt();
                    int posicion6 = scan.nextInt();
                    System.out.println(personas.subList(posicion5, posicion6));
                    break;

            }
        }

    }

    public static void introducirDatos() {
        int n;
        Persona persona;
        do {
            System.out.print("Número personas: ");
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

    public static Persona registro() {
        System.out.println("Introduce tu nombre");
        String nombre = scan.next();
        System.out.println("Introduce tu edad");
        int edad = scan.nextInt();
        System.out.println("Introduce tu género");
        String genero = scan.next();
        System.out.println("Introduce tu nota: ");
        double nota = scan.nextInt();
        Persona persona = new Persona(nombre, edad, genero, nota);
        return persona;
    }

}