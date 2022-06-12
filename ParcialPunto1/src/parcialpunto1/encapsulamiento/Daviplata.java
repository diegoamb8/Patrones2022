package parcialpunto1.encapsulamiento;

/**
 *
 * @author diegj
 */
public class Daviplata {
    
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if(saldo>0){
            this.saldo = saldo;
        }else{
            System.out.println("No puede ingresar ese saldo");
        }
        
    }
}
