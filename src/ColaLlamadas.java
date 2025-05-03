public class ColaLlamadas {
    private NodoLlamada frente;

    public ColaLlamadas() {
        frente = null;
    }

    public void insertarLlamada(int id, String nombreCliente, int duracionEstimada) {
        Llamada nuevaLlamada = new Llamada(id, nombreCliente, duracionEstimada);
        NodoLlamada nuevoNodo = new NodoLlamada(nuevaLlamada);

        if (frente == null) {
            frente = nuevoNodo;
        } else {
            NodoLlamada actual = frente;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
    }

    public Llamada atenderLlamada() {
        if (frente == null) {
            System.out.println("No hay llamadas pendientes.");
            return null;
        }
        Llamada llamadaAtendida = frente.llamada;
        frente = frente.siguiente;
        return llamadaAtendida;
    }

    public void mostrarLlamadasPendientes() {
        if (frente == null) {
            System.out.println("No hay llamadas pendientes.");
            return;
        }
        NodoLlamada actual = frente;
        System.out.println("Llamadas pendientes:");
        while (actual != null) {
            System.out.println(actual.llamada);
            actual = actual.siguiente;
        }
    }

    public int calcularTiempoTotalEspera() {
        int tiempoTotal = 0;
        NodoLlamada actual = frente;
        while (actual != null) {
            tiempoTotal += actual.llamada.getDuracionEstimada();
            actual = actual.siguiente;
        }
        return tiempoTotal;
    }

    private class NodoLlamada {
        Llamada llamada;
        NodoLlamada siguiente;

        NodoLlamada(Llamada llamada) {
            this.llamada = llamada;
            siguiente = null;
        }
    }
}
