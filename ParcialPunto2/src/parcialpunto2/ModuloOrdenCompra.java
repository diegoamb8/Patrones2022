package parcialpunto2;

import java.util.Scanner;

/**
 *
 * @author diegj
 */
public class ModuloOrdenCompra {

    /*Este modulo muestra la orden de compra de un intrumento elegido en el menu principal o de un
    instrumento proveniente de la clase ModuloPedido y mandara a la clase ModuloFacturacion 
    para poder TERMINAR con el proceso de compra del instrumento*/
    Scanner read = new Scanner(System.in);
    String op;

    public void realizarCompra(String intrumento) {
        ModuloFacturacion mf = new ModuloFacturacion();
        switch (intrumento.toUpperCase()) {
            case "GUITARRA" -> {
                System.out.println("-----------------------------------------------------");
                System.out.println("                 CONFIRMACION COMPRA                 ");
                System.out.println("                Instrumento: Guitarra                ");
                System.out.println("                   Precio: $550.000                  ");
                System.out.println("         Pasara al modulo factura para finalizar     ");
                System.out.println("-----------------------------------------------------");
                System.out.println("¿Seguro desea continuar? s/n");
                op = read.next();
                switch (op) {
                    case "s" ->
                        mf.realizarFactura(intrumento);
                    case "n" ->
                        System.out.println("Salio...");
                }
            }
            case "BAJO" -> {
                System.out.println("-----------------------------------------------------");
                System.out.println("                 CONFIRMACION COMPRA                 ");
                System.out.println("                  Instrumento: Bajo                  ");
                System.out.println("                   Precio: $450.000                  ");
                System.out.println("         Pasara al modulo factura para finalizar     ");
                System.out.println("-----------------------------------------------------");
                System.out.println("¿Seguro desea continuar? s/n");
                op = read.next();
                switch (op) {
                    case "s" ->
                        mf.realizarFactura(intrumento);
                    case "n" ->
                        System.out.println("Salio...");
                }
            }
            case "PIANO" -> {
                System.out.println("-----------------------------------------------------");
                System.out.println("                 CONFIRMACION COMPRA                 ");
                System.out.println("                  Instrumento: Piano                 ");
                System.out.println("                   Precio: $700.000                  ");
                System.out.println("         Pasara al modulo factura para finalizar     ");
                System.out.println("-----------------------------------------------------");
                System.out.println("¿Seguro desea continuar? s/n");
                op = read.next();
                switch (op) {
                    case "s" ->
                        mf.realizarFactura(intrumento);
                    case "n" ->
                        System.out.println("Salio...");
                }
            }
            default -> {

            }
        }

    }
}
