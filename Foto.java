public class Foto {
    public String fichero;
    private Impresora impresora; // Bridge: implementación de impresión

    public Foto(String fichero, Impresora impresora) {
        this.fichero = fichero;
        this.impresora = impresora;
    }

    public void print() {
        impresora.imprimir(fichero);
    }
}