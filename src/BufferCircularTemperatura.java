public class BufferCircularTemperatura {
    private double[] buffer;
    private int capacidad;
    private int indiceActual;
    private int cantidad;

    public BufferCircularTemperatura(int capacidad) {
        this.capacidad = capacidad;
        this.buffer = new double[capacidad];
        this.indiceActual = 0;
        this.cantidad = 0;
    }

    public void agregarTemperatura(double temp) {
        buffer[indiceActual] = temp;
        indiceActual = (indiceActual + 1) % capacidad;

        if (cantidad < capacidad) {
            cantidad++;
        }
    }

    public void mostrarTemperaturas() {
        if (cantidad == 0) {
            System.out.println("No hay temperaturas registradas.");
            return;
        }

        System.out.println("Temperaturas (de la más reciente a la más antigua):");

        int pos = (indiceActual - 1 + capacidad) % capacidad;
        for (int i = 0; i < cantidad; i++) {
            System.out.println("  - " + buffer[pos] + "°C");
            pos = (pos - 1 + capacidad) % capacidad;
        }
    }
}
