public class CamaraCreator implements ProductoCreator {
    private String marca;
    private String modelo;

    public CamaraCreator(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public Producto crearProducto(int numero) {
        return new Camara(numero, marca, modelo);
    }
}