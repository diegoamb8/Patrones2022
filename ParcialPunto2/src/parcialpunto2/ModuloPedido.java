package parcialpunto2;

import java.util.Scanner;

/**
 *
 * @author diegj
 */
public class ModuloPedido {
    /*Este modulo muestra el pedido de un intrumento elegido en el menu principal o de un
    instrumento proveniente de la clase ModuloCotizacion y mandara a la clase ModuloOrdenCompra 
    para poder continuar con el proceso de compra del instrumento*/

    Scanner read = new Scanner(System.in);
    String op;
    public void realizarPedido(String intrumento) {
        ModuloOrdenCompra moc = new ModuloOrdenCompra();
        switch (intrumento.toUpperCase()) {
            case "GUITARRA" -> {
                System.out.println("-----------------------------------------------------");
                System.out.println("                       PEDIDO                        ");
                System.out.println("                Instrumento: Guitarra                ");
                System.out.println("                   Precio: $550.000                  ");
                System.out.println("  Pasara al modulo orden de compra para continuar    ");
                System.out.println("-----------------------------------------------------");
                System.out.println("¿Seguro desea continuar? s/n");
                op = read.next();
                switch (op) {
                    case "s" ->
                        moc.realizarCompra(intrumento);
                    case "n" ->
                        System.out.println("Salio...");
                }
            }
            case "BAJO" -> {
                System.out.println("-----------------------------------------------------");
                System.out.println("                       PEDIDO                        ");
                System.out.println("                  Instrumento: Bajo                  ");
                System.out.println("                   Precio: $450.000                  ");
                System.out.println("  Pasara al modulo orden de compra para continuar    ");
                System.out.println("-----------------------------------------------------");
                System.out.println("¿Seguro desea continuar? s/n");
                op = read.next();
                switch (op) {
                    case "s" ->
                        moc.realizarCompra(intrumento);
                    case "n" ->
                        System.out.println("Salio...");
                }
            }
            case "PIANO" -> {
                System.out.println("-----------------------------------------------------");
                System.out.println("                       PEDIDO                        ");
                System.out.println("                  Instrumento: Piano                 ");
                System.out.println("                   Precio: $700.000                  ");
                System.out.println("  Pasara al modulo orden de compra para continuar    ");
                System.out.println("-----------------------------------------------------");
                System.out.println("¿Seguro desea continuar? s/n");
                op = read.next();
                switch (op) {
                    case "s" ->
                        moc.realizarCompra(intrumento);
                    case "n" ->
                        System.out.println("Salio...");
                }
            }
            default -> {

            }
        }

    }
}
