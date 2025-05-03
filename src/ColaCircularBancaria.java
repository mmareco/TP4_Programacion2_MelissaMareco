public class ColaCircularBancaria {
    private String[] cola;
    private int capacidad;
    private int frente;
    private int fin;
    private int cantidad;

    public ColaCircularBancaria(int capacidad) {
        this.capacidad = capacidad;
        this.cola = new String[capacidad];
        this.frente = 0;
        this.fin = 0;
        this.cantidad = 0;
    }

    public boolean estaLlena() {
        return cantidad == capacidad;
    }

    public boolean estaVacia() {
        return cantidad == 0;
    }

    public void encolar(String cliente) {
        if (estaLlena()) {
            System.out.println("La cola está llena. No se puede agregar a " + cliente + ".");
            return;
        }

        cola[fin] = cliente;
        fin = (fin + 1) % capacidad;
        cantidad++;
        System.out.println("Cliente " + cliente + " agregado a la cola.");
    }

    public void atender() {
        if (estaVacia()) {
            System.out.println("La cola está vacía. No hay clientes para atender.");
            return;
        }

        String cliente = cola[frente];
        cola[frente] = null; // Limpia la posición
        frente = (frente + 1) % capacidad;
        cantidad--;
        System.out.println("Atendiendo al cliente: " + cliente);
    }

    public void mostrarCola() {
        if (estaVacia()) {
            System.out.println("Cola vacía.");
            return;
        }

        System.out.println("Clientes en la cola:");
        int pos = frente;
        for (int i = 0; i < cantidad; i++) {
            System.out.println("  - " + cola[pos]);
            pos = (pos + 1) % capacidad;
        }
    }
}
