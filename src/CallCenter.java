public class CallCenter {
    public static void main(String[] args) {
        ColaLlamadas cola = new ColaLlamadas();

        cola.insertarLlamada(1, "Juan Pérez", 10);
        cola.insertarLlamada(2, "María López", 15);
        cola.insertarLlamada(3, "Carlos García", 8);
        cola.insertarLlamada(4, "Ana Sánchez", 12);

        cola.mostrarLlamadasPendientes();

        Llamada atendida = cola.atenderLlamada();
        if (atendida != null) {
            System.out.println("\nLlamada atendida: " + atendida);
        }

        cola.mostrarLlamadasPendientes();

        int tiempoTotal = cola.calcularTiempoTotalEspera();
        System.out.println("\nTiempo total estimado de espera: " + tiempoTotal + " minutos");
    }
}
