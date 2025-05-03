import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        ColaCircularBancaria cola = new ColaCircularBancaria(5);
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- VENTANILLA BANCARIA ---");
            System.out.println("1. Agregar cliente");
            System.out.println("2. Atender cliente");
            System.out.println("3. Mostrar cola");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del cliente: ");
                    String nombre = scanner.nextLine();
                    cola.encolar(nombre);
                    break;

                case 2:
                    cola.atender();
                    break;

                case 3:
                    cola.mostrarCola();
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);
    }
}
