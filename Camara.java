public class Camara extends Producto {
    public String marca;
    public String modelo;

    public Camara(int numero, String marca, String modelo) {
        super(numero);
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("Cámara #" + numero + ": " + marca + " " + modelo);
    }
}