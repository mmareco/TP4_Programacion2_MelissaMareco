public class Cafeteria {
    public static void main(String[] args) {
        ColaPedidos cola = new ColaPedidos();

        cola.registrarPedido(1, "Juan Pérez", "Café con leche");
        cola.registrarPedido(2, "María López", "Té verde");
        cola.registrarPedido(3, "Carlos García", "Café americano");
        cola.registrarPedido(4, "Ana Sánchez", "Croissant");

        cola.listarPedidos();

        Pedido entregado = cola.entregarPedido();
        if (entregado != null) {
            System.out.println("\nPedido entregado: " + entregado);
        }

        cola.listarPedidos();

        cola.cancelarPedido(3);

        cola.listarPedidos();

        cola.cancelarPedido(5);
    }
}
