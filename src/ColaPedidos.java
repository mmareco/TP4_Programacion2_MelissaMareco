public class ColaPedidos {
    private NodoPedido frente;

    public ColaPedidos() {
        frente = null;
    }

    public void registrarPedido(int numero, String nombreCliente, String detalle) {
        Pedido nuevoPedido = new Pedido(numero, nombreCliente, detalle);
        NodoPedido nuevoNodo = new NodoPedido(nuevoPedido);

        if (frente == null) {
            frente = nuevoNodo;
        } else {
            NodoPedido actual = frente;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
    }

    public Pedido entregarPedido() {
        if (frente == null) {
            System.out.println("No hay pedidos pendientes.");
            return null;
        }
        Pedido pedidoEntregado = frente.pedido;
        frente = frente.siguiente;
        return pedidoEntregado;
    }

    public void listarPedidos() {
        if (frente == null) {
            System.out.println("No hay pedidos pendientes.");
            return;
        }
        NodoPedido actual = frente;
        System.out.println("Pedidos pendientes:");
        while (actual != null) {
            System.out.println(actual.pedido);
            actual = actual.siguiente;
        }
    }

    public void cancelarPedido(int numero) {
        if (frente == null) {
            System.out.println("No hay pedidos pendientes.");
            return;
        }

        if (frente.pedido.getNumero() == numero) {
            frente = frente.siguiente;
            System.out.println("Pedido Nº " + numero + " cancelado.");
            return;
        }

        NodoPedido actual = frente;
        while (actual.siguiente != null && actual.siguiente.pedido.getNumero() != numero) {
            actual = actual.siguiente;
        }

        if (actual.siguiente == null) {
            System.out.println("Pedido Nº " + numero + " no encontrado.");
        } else {
            actual.siguiente = actual.siguiente.siguiente;
            System.out.println("Pedido Nº " + numero + " cancelado.");
        }
    }

    private class NodoPedido {
        Pedido pedido;
        NodoPedido siguiente;

        NodoPedido(Pedido pedido) {
            this.pedido = pedido;
            siguiente = null;
        }
    }
}

