public class Triage {
    private Paciente[] pacientes;
    private int cantidad;

    public Triage() {
        pacientes = new Paciente[100]; // máximo 100 pacientes
        cantidad = 0;
    }

    public void agregarPaciente(String nombre, int prioridad) {
        if (cantidad >= pacientes.length) {
            System.out.println("No se pueden agregar más pacientes.");
            return;
        }

        pacientes[cantidad] = new Paciente(nombre, prioridad);
        cantidad++;
        System.out.println("Paciente agregado: " + nombre + " (Prioridad " + prioridad + ")");
    }

    public void atenderPaciente() {
        if (cantidad == 0) {
            System.out.println("No hay pacientes en espera.");
            return;
        }

        int indiceMasGrave = 0;
        for (int i = 1; i < cantidad; i++) {
            if (pacientes[i].prioridad > pacientes[indiceMasGrave].prioridad) {
                indiceMasGrave = i;
            }
        }

        System.out.println("Atendiendo a: " + pacientes[indiceMasGrave]);

        // Eliminar paciente desplazando el resto
        for (int i = indiceMasGrave; i < cantidad - 1; i++) {
            pacientes[i] = pacientes[i + 1];
        }
        cantidad--;
    }

    public void mostrarPacientes() {
        if (cantidad == 0) {
            System.out.println("No hay pacientes en espera.");
            return;
        }

        System.out.println("Pacientes en espera:");
        for (int i = 0; i < cantidad; i++) {
            System.out.println("  - " + pacientes[i]);
        }
    }
}

