import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    public Cliente cliente;
    public List<Producto> productos;
    public Date fecha;
    public int numeroTarjetaCredito;

    public Pedido(Cliente cliente, int numeroTarjetaCredito) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.fecha = new Date();
        this.numeroTarjetaCredito = numeroTarjetaCredito;
    }

    public Producto agregarProducto(ProductoCreator creator, int numero) {
        Producto producto = creator.crearProducto(numero);
        productos.add(producto);
        return producto;
    }
}