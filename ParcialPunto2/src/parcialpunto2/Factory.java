package parcialpunto2;

/**
 *
 * @author diegj
 */
public class Factory {
    /*Esta clase factory es para aplicar el patron de diseño Factory Method*/
    public IIntrumentosMusicales escogerInstrumento(String intrumentosMusicales) {
        switch (intrumentosMusicales.toUpperCase()) {
            case "GUITARRA" -> {
                return new Guitarra();
            }
            case "BAJO" -> {
                return new Bajo();
            }
            case "PIANO" -> {
                return new Piano();
            }
            default -> {
                
            }
        }
        return null;
    }
}
