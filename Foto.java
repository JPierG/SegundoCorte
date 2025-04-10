public class Foto {
    public String fichero;
    private Impresora impresora;

    public Foto(String fichero, Impresora impresora) {
        this.fichero = fichero;
        this.impresora = impresora;
    }

    public void print() {
        impresora.imprimir(fichero);
    }
}