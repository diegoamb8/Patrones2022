package parcialpunto1.herencia;

/**
 *
 * @author diegj
 */
public class CuentaBancolombia {
    
    protected int numCuenta;
    protected double saldo;
    protected int contraseña;

    public CuentaBancolombia(int numCuenta, double saldo, int contraseña) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;
        this.contraseña = contraseña;
    }
    
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

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public int getContraseña() {
        return contraseña;
    }

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }
    
    public void Consignar(){
        System.out.println("Realizo una consignacion");
    }
    
    
}
