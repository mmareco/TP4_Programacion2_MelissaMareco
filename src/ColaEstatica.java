public class ColaEstatica implements Cola{
    private int[] elementos;
    private int frente;
    private int fin;
    private int tamaño;

    public ColaEstatica(int capacidad) {
        elementos = new int[capacidad];
        frente = 0;
        fin = -1;
        tamaño = 0;
    }

    @Override
    public void encolar(int elemento) {
        if (estaLlena()) {
            System.out.println("La cola está llena. No se puede agregar: " + elemento);
            return;
        }
        fin++;
        elementos[fin] = elemento;
        tamaño++;
    }

    @Override
    public int desencolar() {
        if (estaVacia()) {
            System.out.println("La cola está vacía. No se puede eliminar.");
            return -1;
        }
        int eliminado = elementos[frente];
        frente++;
        tamaño--;
        return eliminado;
    }

    @Override
    public boolean estaVacia() {
        return tamaño == 0;
    }

    @Override
    public boolean estaLlena() {
        return fin == elementos.length - 1;
    }

    @Override
    public int verFrente() {
        if (estaVacia()) {
            System.out.println("La cola está vacía.");
            return -1;
        }
        return elementos[frente];
    }

    @Override
    public void mostrar() {
        if (estaVacia()) {
            System.out.println("Cola vacía.");
            return;
        }
        System.out.print("Cola: ");
        for (int i = frente; i <= fin; i++) {
            System.out.print(elementos[i] + " ");
        }
        System.out.println();
    }
}
