public class ImpresionCreator implements ProductoCreator {
    private String color;

    public ImpresionCreator(String color) {
        this.color = color;
    }

    @Override
    public Producto crearProducto(int numero) {
        return new Impresion(numero, color);
    }
}