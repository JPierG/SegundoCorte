public class Main {
    public static void main(String[] args) {
        // Crear cliente
        Cliente cliente = new Cliente("1109186125", "Jean Pier");
        Cliente cliente2 = new Cliente("6457251347", "Pier Jean");

        // Crear pedido
        Pedido pedido = new Pedido(cliente, 987654321);
        Pedido pedido2 = new Pedido(cliente2, 987654321);

        // Crear productos usando la fábrica
        Producto camara = ProductoFactory.crearProducto("camara", 1);
        Producto impresion = ProductoFactory.crearProducto("impresion", 2);

        // Agregar fotos a la impresión
        if (impresion instanceof Impresion) {
            Impresion imp = (Impresion) impresion;
            imp.agregarFoto(new Foto("foto1.jpg", new ImpresoraColor()));
            imp.agregarFoto(new Foto("foto2.png", new ImpresoraBlancoNegro()));
            imp.agregarFoto(new Foto("foto3.jpg", new ImpresoraColor()));
            imp.agregarFoto(new Foto("foto4.png", new ImpresoraBlancoNegro()));
        }

        // Agregar productos al pedido
        pedido.agregarProducto(camara);
        pedido.agregarProducto(impresion);
        pedido2.agregarProducto(camara);
        pedido2.agregarProducto(impresion);

        // Mostrar detalles del pedido
        System.out.println("Pedido de: " + cliente.nombre + " Con Cedula:" + cliente.cedula);
        System.out.println("Fecha: " + pedido.fecha + " - Numero de tarjeta: " + pedido.numeroTarjetaCredito);
        System.out.println("Productos en el pedido:");
        for (Producto p : pedido.productos) {
            p.mostrarDetalle();
        }
        System.out.println("-------------------------------------------------");
        // Mostrar detalles del pedido2
        System.out.println("Pedido de: " + cliente2.nombre + " Con Cedula:" + cliente2.cedula);
        System.out.println("Fecha: " + pedido2.fecha + " - Numero de tarjeta: " + pedido2.numeroTarjetaCredito);
        System.out.println("Productos en el pedido:");
        for (Producto p : pedido2.productos) {
            p.mostrarDetalle();
        }
        System.out.println("-------------------------------------------------");
        // Mostrar lista de fotos de la impresión
        if (impresion instanceof Impresion) {
            Impresion imp = (Impresion) impresion;
            System.out.println("Fotos en cola de impresión:");
            for (Foto f : imp.fotos) {
               f.print();
            }
        }
    }
}
