package parcialpunto2;

import java.util.Scanner;

/**
 *
 * @author diegj
 */
/*Este modulo muestra la cotizacion de un intrumento elegido en el menu principal y mandara a la 
clase ModuloPedido para poder continuar con el proceso de compra del instrumento*/
public class ModuloCotizaciones {
    Scanner read = new Scanner(System.in);
    String op;
    
    public void realizarCotizacion(String intrumento) {
        ModuloPedido mp = new ModuloPedido();
        switch (intrumento.toUpperCase()) {
            case "GUITARRA" -> {
                System.out.println("-----------------------------------------------------");
                System.out.println("                     COTIZACIÓN                      ");
                System.out.println("                Instrumento: Guitarra                ");
                System.out.println("                   Precio: $550.000                  ");
                System.out.println("         Pasara al modulo pedido para continuar      ");
                System.out.println("-----------------------------------------------------");
                System.out.println("¿Seguro desea continuar? s/n");
                op = read.next();
                switch (op) {
                    case "s" ->
                        mp.realizarPedido(intrumento);
                    case "n" ->
                        System.out.println("Salio...");
                }
            }
            case "BAJO" -> {
                System.out.println("-----------------------------------------------------");
                System.out.println("                     COTIZACIÓN                      ");
                System.out.println("                  Instrumento: Bajo                  ");
                System.out.println("                   Precio: $450.000                  ");
                System.out.println("         Pasara al modulo pedido para continuar      ");
                System.out.println("-----------------------------------------------------");
                System.out.println("¿Seguro desea continuar? s/n");
                op = read.next();
                switch (op) {
                    case "s" ->
                        mp.realizarPedido(intrumento);
                    case "n" ->
                        System.out.println("Salio...");
                }
            }
            case "PIANO" -> {
                System.out.println("-----------------------------------------------------");
                System.out.println("                     COTIZACIÓN                      ");
                System.out.println("                  Instrumento: Piano                 ");
                System.out.println("                   Precio: $700.000                  ");
                System.out.println("         Pasara al modulo pedido para continuar      ");
                System.out.println("-----------------------------------------------------");
                System.out.println("¿Seguro desea continuar? s/n");
                op = read.next();
                switch (op) {
                    case "s" ->
                        mp.realizarPedido(intrumento);
                    case "n" ->
                        System.out.println("Salio...");
                }
            }
            default -> {

            }
        }

    }
}
