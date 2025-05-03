public class Pedido {
    private int numero;
    private String nombreCliente;
    private String detalle;

    public Pedido(int numero, String nombreCliente, String detalle) {
        this.numero = numero;
        this.nombreCliente = nombreCliente;
        this.detalle = detalle;
    }

    public int getNumero() {
        return numero;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getDetalle() {
        return detalle;
    }

    @Override
    public String toString() {
        return "Pedido Nº: " + numero + ", Cliente: " + nombreCliente + ", Detalle: " + detalle;
    }
}

