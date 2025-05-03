import java.util.Scanner;

public class Buffer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BufferCircularTemperatura buffer = new BufferCircularTemperatura(10); // 10 lecturas máx
        int opcion;

        do {
            System.out.println("\n--- SENSOR DE TEMPERATURA ---");
            System.out.println("1. Registrar nueva temperatura");
            System.out.println("2. Mostrar historial");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese temperatura (°C): ");
                    double temp = scanner.nextDouble();
                    buffer.agregarTemperatura(temp);
                    System.out.println("Temperatura registrada.");
                    break;

                case 2:
                    buffer.mostrarTemperaturas();
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
