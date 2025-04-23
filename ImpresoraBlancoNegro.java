public class ImpresoraBlancoNegro implements Impresora {
    @Override
    public void imprimir(String fichero) {
        System.out.println("Imprimiendo " + fichero + " en blanco y negro");
    }
}