import java.util.ArrayList;
import java.util.List;

public class Impresion extends Producto {
    public String color;
    public List<Foto> fotos;

    public Impresion(int numero, String color) {
        super(numero);
        this.color = color;
        this.fotos = new ArrayList<>();
    }

    public void agregarFoto(Foto foto) {
        fotos.add(foto);
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("Impresión #" + numero + " - " + color + " con " + fotos.size() + " fotos");
    }
}