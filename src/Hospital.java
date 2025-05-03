import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Triage triage = new Triage();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- TRIAGE HOSPITAL ---");
            System.out.println("1. Agregar paciente");
            System.out.println("2. Atender paciente más grave");
            System.out.println("3. Mostrar pacientes");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 1) {
                System.out.print("Nombre: ");
                String nombre = scanner.nextLine();
                System.out.print("Prioridad (número, más alto = más grave): ");
                int prioridad = scanner.nextInt();
                triage.agregarPaciente(nombre, prioridad);

            } else if (opcion == 2) {
                triage.atenderPaciente();

            } else if (opcion == 3) {
                triage.mostrarPacientes();

            } else if (opcion != 0) {
                System.out.println("Opción inválida.");
            }

        } while (opcion != 0);

        System.out.println("Programa finalizado.");
    }
}

