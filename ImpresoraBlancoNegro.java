public class ImpresoraBlancoNegro implements Impresora {
    @Override
    public void imprimir(String fichero) {
        System.out.println("*"+fichero+" (Imprimiendo en blanco y negro)" );
    }
}