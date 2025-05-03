import java.util.ArrayList;
import java.util.Scanner;

public class Impresora {
    public static void main(String[] args) {
        ColaDinamica cola = new ColaDinamica();
        ArrayList<Tarea> tareas = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int idActual = 1;
        int paginasTotales = 0;
        int opcion;

        do {
            System.out.println("\n--- IMPRESORA ---");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Procesar tarea");
            System.out.println("3. Mostrar cola de espera");
            System.out.println("4. Ver total de páginas impresas");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre de la tarea: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Cantidad de páginas: ");
                    int paginas = scanner.nextInt();
                    Tarea nueva = new Tarea(idActual, nombre, paginas);
                    tareas.add(nueva);
                    cola.encolar(idActual);
                    System.out.println("Tarea agregada con ID " + idActual);
                    idActual++;
                    break;

                case 2:
                    if (cola.estaVacia()) {
                        System.out.println("No hay tareas en cola.");
                    } else {
                        int id = cola.desencolar();
                        Tarea t = buscarTarea(tareas, id);
                        if (t != null) {
                            paginasTotales += t.paginas;
                            System.out.println("Procesando: " + t);
                        }
                    }
                    break;

                case 3:
                    mostrarCola(cola, tareas);
                    break;

                case 4:
                    System.out.println("Total de páginas impresas: " + paginasTotales);
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);
    }

    public static Tarea buscarTarea(ArrayList<Tarea> tareas, int id) {
        for (Tarea t : tareas) {
            if (t.id == id) return t;
        }
        return null;
    }

    public static void mostrarCola(ColaDinamica cola, ArrayList<Tarea> tareas) {
        if (cola.estaVacia()) {
            System.out.println("Cola vacía.");
            return;
        }

        ColaDinamica copia = new ColaDinamica();

        System.out.println("Cola de impresión:");
        while (!cola.estaVacia()) {
            int id = cola.desencolar();
            Tarea t = buscarTarea(tareas, id);
            if (t != null) {
                System.out.println("  - " + t);
            }
            copia.encolar(id);
        }

        while (!copia.estaVacia()) {
            cola.encolar(copia.desencolar());
        }
    }
}
