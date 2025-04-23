public class Cliente {
    public String cedula;
    public String nombre;

    public Cliente(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public Pedido crearPedido(int numeroTarjetaCredito) {
        return new Pedido(this, numeroTarjetaCredito);
    }
}