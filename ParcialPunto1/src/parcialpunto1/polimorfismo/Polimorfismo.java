package parcialpunto1.polimorfismo;

/**
 *
 * @author diegj
 */
public class Polimorfismo {

    public static void main(String[] args) {
        // TODO code application logic here
        NequiTopes nt = new NequiTopes();
        NequiSinTopes nst = new NequiSinTopes();
        
        nt.calcularUsoDineroMes(1260000);
        nst.calcularUsoDineroMes(8050000);
    }

}
