package parcialpunto2;

import java.util.Scanner;

/**
 *
 * @author diegj
 */
/*Este modulo es el de facturacion, muestra una pequeña factura con el precio del instrumento y pregunta si 
desean articulos complementario usando la clase ElementosComplementarios que aplica el patron singleton, 
despues seleccionara que desea hacer con el intrumento, los metodos de accion del instrumento son 
llamados usando el patron factory*/
public class ModuloFacturacion {

    Scanner read = new Scanner(System.in);
    int op;
    String opcion;

    public void realizarFactura(String intrumento) {
        switch (intrumento.toUpperCase()) {
            case "GUITARRA" -> {
                Factory f = new Factory();
                IIntrumentosMusicales im = f.escogerInstrumento("guitarra");
                System.out.println("------------------------------");
                System.out.println("            FACTURA           ");
                System.out.println("     Instrumento: Guitarra    ");
                System.out.println("       Precio: $550.000       ");
                System.out.println("------------------------------");
                System.out.println("¿Desea articulos complemenatios? s/n");
                opcion = read.next();
                switch (opcion) {
                    case "s" ->
                        ElementosComplementarios.getInstace().elegirElementos();
                    case "n" ->
                        System.out.println("Salio...");
                }
                System.out.println("Que desea hacer con la guitarra: ");
                Menu();
                switch (op) {
                    case 1 ->
                        im.Afinar();
                    case 2 ->
                        im.Interpretar();
                    case 3 ->
                        System.out.println("Salio");
                }
            }
            case "BAJO" -> {
                Factory f = new Factory();
                IIntrumentosMusicales im = f.escogerInstrumento("bajo");
                System.out.println("------------------------------");
                System.out.println("            FACTURA           ");
                System.out.println("       Instrumento: Bajo      ");
                System.out.println("        Precio: $450.000      ");
                System.out.println("------------------------------");
                System.out.println("¿Desea articulos complemenatios? s/n");
                opcion = read.next();
                switch (opcion) {
                    case "s" ->
                        ElementosComplementarios.getInstace().elegirElementos();
                    case "n" ->
                        System.out.println("Salio...");
                }
                System.out.println("Que desea hacer con el bajo: ");
                Menu();
                switch (op) {
                    case 1 ->
                        im.Afinar();
                    case 2 ->
                        im.Interpretar();
                    case 3 ->
                        System.out.println("Salio");
                }
            }
            case "PIANO" -> {
                Factory f = new Factory();
                IIntrumentosMusicales im = f.escogerInstrumento("piano");
                System.out.println("------------------------------");
                System.out.println("            FACTURA           ");
                System.out.println("       Instrumento: Piano     ");
                System.out.println("        Precio: $700.000      ");
                System.out.println("------------------------------");
                System.out.println("¿Desea articulos complemenatios? s/n");
                opcion = read.next();
                switch (opcion) {
                    case "s" ->
                        ElementosComplementarios.getInstace().elegirElementos();
                    case "n" ->
                        System.out.println("Salio...");
                }
                System.out.println("Que desea hacer con el piano: ");
                Menu();
                switch (op) {
                    case 1 ->
                        im.Afinar();
                    case 2 ->
                        im.Interpretar();
                    case 3 ->
                        System.out.println("Salio");
                }
            }
            default -> {

            }
        }

    }

    private int Menu() {
        System.out.println("1. Afinar");
        System.out.println("2. Interpretar");
        System.out.println("3. Salir");
        op = read.nextInt();
        return op;
    }
}
