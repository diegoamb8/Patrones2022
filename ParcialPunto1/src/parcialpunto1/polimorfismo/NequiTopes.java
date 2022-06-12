package parcialpunto1.polimorfismo;

/**
 *
 * @author diegj
 */
public class NequiTopes implements INequi{

    private double libre4x1000 = 2470260;
    private double disponibleSin4x1000;
    
    @Override
    public void calcularUsoDineroMes(double dineroUsado) {
        System.out.println("Nequi con topes");
        System.out.println("Al ser una cuenta con topes puedes usar: $2.470.260 libre de 4x1000");
        if(dineroUsado<libre4x1000){
            disponibleSin4x1000 = libre4x1000-dineroUsado;
            System.out.println("Aun puedes usar: $"+disponibleSin4x1000+" libre de 4x1000");
        }else if(dineroUsado>=libre4x1000){
            System.out.println("Todos los movimientos que realizes se les cobrara el 4x1000");
        }
    }


}
