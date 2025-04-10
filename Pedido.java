import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    public Cliente cliente;
    public ArrayList<Producto> productos;
    public Date fecha;
    public int numeroTarjetaCredito;

    public Pedido(Cliente cliente, int numeroTarjetaCredito) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.fecha = new Date(); // Fecha actual
        this.numeroTarjetaCredito = numeroTarjetaCredito;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
}