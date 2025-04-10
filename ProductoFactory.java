public class ProductoFactory {
    public static Producto crearProducto(String tipo, int numero) {
        if (tipo.equalsIgnoreCase("camara")) {
            return new Camara(numero, "Canon", "X5"); // Datos de ejemplo
        } else if (tipo.equalsIgnoreCase("impresion")) {
            return new Impresion(numero, "Color");
        }
        return null;
    }
}