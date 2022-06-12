package parcialpunto1.polimorfismo;

/**
 *
 * @author diegj
 */
public class NequiSinTopes implements INequi{
 
    private double topeMes = 13301400;
    private double usoLibre4x1000;
    @Override
    public void calcularUsoDineroMes(double dineroUsado) {
        System.out.println("Nequi sin topes");
        System.out.println("Al ser una cuenta sin topes puedes usar: $13.301.400 libre de 4x1000");
        if(dineroUsado<topeMes){
            usoLibre4x1000 = topeMes - dineroUsado;
            System.out.println("Puedes usar: $"+usoLibre4x1000+" libre de 4x1000");
        }else if(dineroUsado>=topeMes){
            System.out.println("Tienes que pagar 4x1000 al superar el tope libre de este impuesto");
        }
        
    }

    
}
