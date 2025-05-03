public class Llamada {
    private int id;
    private String nombreCliente;
    private int duracionEstimada;

    public Llamada(int id, String nombreCliente, int duracionEstimada) {
        this.id = id;
        this.nombreCliente = nombreCliente;
        this.duracionEstimada = duracionEstimada;
    }

    public int getId() {
        return id;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public int getDuracionEstimada() {
        return duracionEstimada;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Cliente: " + nombreCliente + ", Duración estimada: " + duracionEstimada + " minutos";
    }
}

