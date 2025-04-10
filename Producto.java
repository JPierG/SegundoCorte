public abstract class Producto {
    public int numero;

    public Producto(int numero) {
        this.numero = numero;
    }

    // Método abstracto para mostrar información
    public abstract void mostrarDetalle();
}