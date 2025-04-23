public class Main {
    public static void main(String[] args) {
        // 1. Crear cliente
        Cliente cliente = new Cliente("12345678", "Juan Pérez");
        System.out.println("Cliente creado: " + cliente.nombre);
        
        // 2. El cliente crea un pedido
        Pedido pedido = cliente.crearPedido(987654321);
        System.out.println("Pedido creado con tarjeta: " + pedido.numeroTarjetaCredito);
        
        // 3. Crear creadores de productos (Factory Method)
        ProductoCreator camaraCreator = new CamaraCreator("Canon", "EOS R5");
        ProductoCreator impresionCreator = new ImpresionCreator("Color Premium");
        
        // 4. Agregar productos al pedido usando los creadores
        Producto camara = pedido.agregarProducto(camaraCreator, 1001);
        Producto impresion = pedido.agregarProducto(impresionCreator, 2001);
        
        // 5. Mostrar detalles de los productos
        System.out.println("\nProductos en el pedido:");
        for (Producto producto : pedido.productos) {
            producto.mostrarDetalle();
        }
        
        // 6. Demostrar el patrón Bridge con fotos e impresoras
        System.out.println("\nDemostrando el patrón Bridge:");
        
        // Crear impresoras (implementaciones)
        Impresora impresoraColor = new ImpresoraColor();
        Impresora impresoraBN = new ImpresoraBlancoNegro();
        
        // Crear fotos con diferentes impresoras (abstracción + implementación)
        Foto fotoVacaciones = new Foto("vacaciones.jpg", impresoraColor);
        Foto fotoDocumento = new Foto("documento.pdf", impresoraBN);
        
        // Agregar fotos a la impresión
        ((Impresion)impresion).agregarFoto(fotoVacaciones);
        ((Impresion)impresion).agregarFoto(fotoDocumento);
        
        // Imprimir fotos usando el bridge
        System.out.println("\nImprimiendo fotos:");
        fotoVacaciones.print();
        fotoDocumento.print();
        
        // Mostrar detalles actualizados de la impresión
        System.out.println("\nDetalles actualizados de la impresión:");
        impresion.mostrarDetalle();
    }
}