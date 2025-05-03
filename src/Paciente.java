public class Paciente {
    String nombre;
    int prioridad;

    public Paciente(String nombre, int prioridad) {
        this.nombre = nombre;
        this.prioridad = prioridad;
    }

    public String toString() {
        return nombre + " (Prioridad " + prioridad + ")";
    }
}
