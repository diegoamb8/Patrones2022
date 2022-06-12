package parcialpunto1.abstraccion;

/**
 *
 * @author diegj
 */
public class CuentaMovii {

    public void Retirar(){
        consultarSaldo();
        ingresarContraseña();
    }
    
    public void Depositar(){}
    
    public void VerMovimientos(){}
    
    private void consultarSaldo(){
        System.out.println("El saldo es: 20000");
    }
    
    private void ingresarContraseña(){
        System.out.println("Contraseña: 12345");
    }
    
}
