package parcialpunto2;

import java.util.Scanner;

/**
 *
 * @author diegj
 */
//Esta clase permite agregar elementos complementarios aplicando el patron singleton, creando una sola instancia
public class ElementosComplementarios {
    Scanner read = new Scanner(System.in);
    int op;
    
    private ElementosComplementarios() {
    }
    private static ElementosComplementarios instancia = null;

    public static ElementosComplementarios getInstace() {
        if (instancia == null) {
            
            instancia = new ElementosComplementarios();
            System.out.println("Se creo instancia");
        }
        return instancia;
    }

    public void elegirElementos() {
        System.out.println("1. Calcomanias");
        System.out.println("2. Afinador");
        System.out.println("3. Salir");
        op = read.nextInt();
        switch (op) {
            case 1 ->
                System.out.println("Calcomanias agregadas");
            case 2 ->
                System.out.println("Afinador agregado");
            case 3 ->
                System.out.println("Salio");
        }
    }
}
