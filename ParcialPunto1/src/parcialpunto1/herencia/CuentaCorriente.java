package parcialpunto1.herencia;

/**
 *
 * @author diegj
 */
public class CuentaCorriente extends CuentaBancolombia{
    
    private double cupoSobregiro;

    public CuentaCorriente(int numCuenta, double saldo, int contraseña, double cupoSobregiro) {
        super(numCuenta, saldo, contraseña);
        this.cupoSobregiro = cupoSobregiro;
    }

    public double getCupoSobregiro() {
        return cupoSobregiro;
    }

    public void setCupoSobregiro(double cupoSobregiro) {
        this.cupoSobregiro = cupoSobregiro;
    }

    @Override
    public void Consignar() {
        super.Consignar();
    }
    
    
    
    public void PagarIntereses(){
        System.out.println("Sus interes a pagar son: $100.000");
    }
    
}
