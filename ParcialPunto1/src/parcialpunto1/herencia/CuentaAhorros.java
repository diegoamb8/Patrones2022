package parcialpunto1.herencia;

/**
 *
 * @author diegj
 */
public class CuentaAhorros extends CuentaBancolombia{
    
    private double interesAnuales;

    public CuentaAhorros(int numCuenta, double saldo, int contraseña, double interesAnuales) {
        super(numCuenta, saldo, contraseña);
        this.interesAnuales = interesAnuales;
    }

    public double getInteresAnuales() {
        return interesAnuales;
    }

    public void setInteresAnuales(double interesAnuales) {
        this.interesAnuales = interesAnuales;
    }

    public void Retirar() {
        System.out.println("Se retiro todo el saldo: $"+saldo+" de la cuenta: "+numCuenta);
    }
    
    

    
}
