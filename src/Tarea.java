public class Tarea {
    int id;
    String nombre;
    int paginas;

    public Tarea(int id, String nombre, int paginas) {
        this.id = id;
        this.nombre = nombre;
        this.paginas = paginas;
    }

    public String toString() {
        return "Tarea: " + nombre + " (" + paginas + " páginas)";
    }
}
