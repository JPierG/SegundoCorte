public abstract class Producto {
    public int numero;

    public Producto(int numero) {
        this.numero = numero;
    }

    public abstract void mostrarDetalle();
}