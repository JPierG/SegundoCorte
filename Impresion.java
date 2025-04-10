import java.util.ArrayList;

public class Impresion extends Producto {
    public String color;
    public ArrayList<Foto> fotos; 

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
        System.out.println("("+ numero +")"+ " Impresión "+ " - Color: " + color);
    }
}