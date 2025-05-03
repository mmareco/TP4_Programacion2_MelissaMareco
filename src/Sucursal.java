public class Sucursal {
    private Cliente[] filaRapida;
    private Cliente[] filaRegular;
    private int tamanoFilaRapida;
    private int tamanoFilaRegular;

    public Sucursal(int capacidad) {
        filaRapida = new Cliente[capacidad];
        filaRegular = new Cliente[capacidad];
        tamanoFilaRapida = 0;
        tamanoFilaRegular = 0;
    }

    public void agregarCliente(String nombre, String tipoOperacion) {
        Cliente cliente = new Cliente(nombre, tipoOperacion);
        if (tipoOperacion.equals("simple") && tamanoFilaRapida < filaRapida.length) {
            filaRapida[tamanoFilaRapida++] = cliente;
        } else if (tipoOperacion.equals("complejo") && tamanoFilaRegular < filaRegular.length) {
            filaRegular[tamanoFilaRegular++] = cliente;
        } else {
            System.out.println("No hay espacio en la fila para este cliente.");
        }
    }

    public void atenderCliente() {
        if (tamanoFilaRapida > 0 && tamanoFilaRegular > 0) {
            System.out.println("Atendiendo a: " + filaRapida[0]);
            desplazarFilaRapida();
            System.out.println("Atendiendo a: " + filaRegular[0]);
            desplazarFilaRegular();
        } else if (tamanoFilaRapida > 0) {
            System.out.println("Atendiendo a: " + filaRapida[0]);
            desplazarFilaRapida();
        } else if (tamanoFilaRegular > 0) {
            System.out.println("Atendiendo a: " + filaRegular[0]);
            desplazarFilaRegular();
        } else {
            System.out.println("No hay clientes para atender.");
        }
    }

    private void desplazarFilaRapida() {
        for (int i = 0; i < tamanoFilaRapida - 1; i++) {
            filaRapida[i] = filaRapida[i + 1];
        }
        filaRapida[--tamanoFilaRapida] = null;
    }

    private void desplazarFilaRegular() {
        for (int i = 0; i < tamanoFilaRegular - 1; i++) {
            filaRegular[i] = filaRegular[i + 1];
        }
        filaRegular[--tamanoFilaRegular] = null;
    }

    public void mostrarEstadoColas() {
        System.out.println("Fila rapida:");
        for (int i = 0; i < tamanoFilaRapida; i++) {
            System.out.println(filaRapida[i]);
        }

        System.out.println("Fila regular:");
        for (int i = 0; i < tamanoFilaRegular; i++) {
            System.out.println(filaRegular[i]);
        }
    }
}




