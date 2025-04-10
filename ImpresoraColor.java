public class ImpresoraColor implements Impresora {
    @Override
    public void imprimir(String fichero) {
        System.out.println("*"+fichero+" (Imprimiendo a color)" );
    }
}