public class BancoRapido {
    public static void main(String[] args) {
        Sucursal sucursal = new Sucursal(10);

        sucursal.agregarCliente("Juan Perez", "simple");
        sucursal.agregarCliente("Maria Lopez", "complejo");
        sucursal.agregarCliente("Carlos Garcia", "simple");
        sucursal.agregarCliente("Ana Sanchez", "complejo");

        sucursal.mostrarEstadoColas();

        System.out.println("\nAtendiendo clientes...");
        sucursal.atenderCliente();
        sucursal.atenderCliente();

        sucursal.mostrarEstadoColas();
    }
}
