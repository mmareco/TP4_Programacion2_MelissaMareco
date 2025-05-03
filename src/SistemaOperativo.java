public class SistemaOperativo {
    public static void main(String[] args) {
        ColaPrioridad cola = new ColaPrioridad();

        cola.cargarProceso(1, "Proceso A", 5);
        cola.cargarProceso(2, "Proceso B", 10);
        cola.cargarProceso(3, "Proceso C", 7);
        cola.cargarProceso(4, "Proceso D", 3);

        cola.mostrarCola();

        Proceso ejecutado = cola.ejecutarProceso();
        if (ejecutado != null) {
            System.out.println("\nProceso ejecutado: " + ejecutado);
        }

        cola.mostrarCola();
    }
}
