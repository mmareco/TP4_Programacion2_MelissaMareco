public class Cliente {
    String nombre;
    String tipoOperacion;

    public Cliente(String nombre, String tipoOperacion) {
        this.nombre = nombre;
        this.tipoOperacion = tipoOperacion;
    }

    public String toString() {
        return nombre + " (" + tipoOperacion + ")";
    }
}

