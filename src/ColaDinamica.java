public class ColaDinamica implements Cola{
    private Nodo frente;
    private Nodo fin;

    public ColaDinamica() {
        frente = null;
        fin = null;
    }

    @Override
    public void encolar(int elemento) {
        Nodo nuevo = new Nodo(elemento);
        if (estaVacia()) {
            frente = nuevo;
            fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            fin = nuevo;
        }
    }

    @Override
    public int desencolar() {
        if (estaVacia()) {
            System.out.println("La cola está vacía.");
            return -1;
        }
        int dato = frente.dato;
        frente = frente.siguiente;
        if (frente == null) {
            fin = null; // la cola quedó vacía
        }
        return dato;
    }

    @Override
    public boolean estaVacia() {
        return frente == null;
    }

    @Override
    public boolean estaLlena() {
        return false;
    }

    @Override
    public int verFrente() {
        if (estaVacia()) {
            System.out.println("La cola está vacía.");
            return -1;
        }
        return frente.dato;
    }

    @Override
    public void mostrar() {
        if (estaVacia()) {
            System.out.println("Cola vacía.");
            return;
        }

        System.out.print("Cola: ");
        Nodo actual = frente;
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
}
