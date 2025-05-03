import java.util.Scanner;

public class Farmacia {
    public static void main(String[] args) {
        ColaDinamica cola = new ColaDinamica();
        Scanner scanner = new Scanner(System.in);
        int turnoActual = 1;

        int opcion;

        do {
            System.out.println("\n--- FARMACIA ---");
            System.out.println("1. Agregar cliente");
            System.out.println("2. Atender cliente");
            System.out.println("3. Mostrar cola");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    cola.encolar(turnoActual);
                    System.out.println("Cliente agregado con turno " + turnoActual);
                    turnoActual++;
                    break;
                case 2:
                    if (cola.estaVacia()) {
                        System.out.println("No hay clientes en la cola.");
                    } else {
                        int atendido = cola.desencolar();
                        System.out.println("Atendiendo al cliente con turno " + atendido);
                    }
                    break;
                case 3:
                    cola.mostrar();
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
