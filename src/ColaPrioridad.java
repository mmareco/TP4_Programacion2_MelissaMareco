public class ColaPrioridad {
    private NodoProceso frente;

    public ColaPrioridad() {
        frente = null;
    }

    public void cargarProceso(int id, String nombre, int prioridad) {
        Proceso nuevoProceso = new Proceso(id, nombre, prioridad);
        NodoProceso nuevoNodo = new NodoProceso(nuevoProceso);

        if (frente == null || frente.proceso.getPrioridad() < nuevoProceso.getPrioridad()) {
            nuevoNodo.siguiente = frente;
            frente = nuevoNodo;
        } else {
            NodoProceso actual = frente;
            while (actual.siguiente != null && actual.siguiente.proceso.getPrioridad() >= nuevoProceso.getPrioridad()) {
                actual = actual.siguiente;
            }
            nuevoNodo.siguiente = actual.siguiente;
            actual.siguiente = nuevoNodo;
        }
    }

    public Proceso ejecutarProceso() {
        if (frente == null) {
            System.out.println("No hay procesos para ejecutar.");
            return null;
        }
        Proceso procesoEjecutado = frente.proceso;
        frente = frente.siguiente;
        return procesoEjecutado;
    }

    public void mostrarCola() {
        if (frente == null) {
            System.out.println("No hay procesos en la cola.");
            return;
        }
        NodoProceso actual = frente;
        System.out.println("Estado actual de la cola de procesos:");
        while (actual != null) {
            System.out.println(actual.proceso);
            actual = actual.siguiente;
        }
    }

    private class NodoProceso {
        Proceso proceso;
        NodoProceso siguiente;

        NodoProceso(Proceso proceso) {
            this.proceso = proceso;
            siguiente = null;
        }
    }
}

