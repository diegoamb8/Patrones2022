package parcialpunto2;

/**
 *
 * @author diegj
 */
public class Bajo implements IIntrumentosMusicales{
/*Esta es una clase que implementa la interface de instrumentos musicales, hace uso de los metodos 
tomando un comportamiento distinto al de las clases de los otros instrumentos*/
     @Override
    public void Afinar() {
        int i = 0;
        while(i<4){
            System.out.println("Afinando Bajo...");
            i++;
        }
        System.out.println("Bajo Afinado");
    }

    @Override
    public void Interpretar() {
        int i = 0;
        while(i<4){
            System.out.println("Interpretando Piano..");
            i++;
        }
        System.out.println("Interpretacion finalizada");
    }
    
}
