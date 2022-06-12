package parcialpunto2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author diegj
 */
public class ParcialPunto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Se crea un menu general para poder instanciar las clases
        se usa la clase factory, todos los modulos, la clase elementos complementarios,
        para una opcion se crea un numero ramdon para poder elegir un instrumento
        de forma aleatoria*/
        Scanner read = new Scanner(System.in);
        int op;
        int opcion;
        String opcion2;
        String continuar = "s";
        Factory f = new Factory();
        while (continuar.toUpperCase().equals("S")) {
            System.out.println("Que desea realizar: ");
            System.out.println("1. Cotizar");
            System.out.println("2. Pedido");
            System.out.println("3. Orden Compra");
            System.out.println("4. Instrumento aleatorio");
            System.out.println("5. Elegir instrumento");
            System.out.println("6. Salir");
            System.out.println("-----------------------------------------------------");
            op = read.nextInt();
            switch (op) {
                case 1:
                    ModuloCotizaciones mc = new ModuloCotizaciones();
                    System.out.println("De que instrumento desea realizar la cotizacion");
                    System.out.println("1. Guitarra");
                    System.out.println("2. Bajo");
                    System.out.println("3. Piano");
                    System.out.println("4. Salir");
                    System.out.println("-----------------------------------------------------");
                    opcion = read.nextInt();
                    switch (opcion) {
                        case 1 ->
                            mc.realizarCotizacion("guitarra");
                        case 2 ->
                            mc.realizarCotizacion("bajo");
                        case 3 ->
                            mc.realizarCotizacion("piano");
                        case 4 ->
                            System.out.println("Salio");
                    }
                    break;
                case 2:
                    ModuloPedido mp = new ModuloPedido();
                    System.out.println("De que instrumento desea realizar el pedido");
                    System.out.println("1. Guitarra");
                    System.out.println("2. Bajo");
                    System.out.println("3. Piano");
                    System.out.println("4. Salir");
                    System.out.println("-----------------------------------------------------");
                    opcion = read.nextInt();
                    switch (opcion) {
                        case 1 ->
                            mp.realizarPedido("guitarra");
                        case 2 ->
                            mp.realizarPedido("bajo");
                        case 3 ->
                            mp.realizarPedido("piano");
                        case 4 ->
                            System.out.println("Salio");
                    }
                    break;
                case 3:
                    ModuloOrdenCompra moc = new ModuloOrdenCompra();
                    System.out.println("De que instrumento desea realizar la orden de compra");
                    System.out.println("1. Guitarra");
                    System.out.println("2. Bajo");
                    System.out.println("3. Piano");
                    System.out.println("4. Salir");
                    System.out.println("-----------------------------------------------------");
                    opcion = read.nextInt();
                    switch (opcion) {
                        case 1 ->
                            moc.realizarCompra("guitarra");
                        case 2 ->
                            moc.realizarCompra("bajo");
                        case 3 ->
                            moc.realizarCompra("piano");
                        case 4 ->
                            System.out.println("Salio");
                    }
                    break;
                case 4:

                    Random ran = new Random();
                    opcion = ran.nextInt(3) + 1;
                    switch (opcion) {

                        case 1 -> {
                            IIntrumentosMusicales im = f.escogerInstrumento("guitarra");
                            System.out.println("Guitarra");
                            System.out.println("¿Desea articulos complemenatios? s/n");
                            opcion2 = read.next();
                            switch (opcion2) {
                                case "s" ->
                                    ElementosComplementarios.getInstace().elegirElementos();
                                case "n" ->
                                    System.out.println("Salio...");
                            }
                            System.out.println("Que desea hacer con la guitarra: ");
                            System.out.println("1. Afinar");
                            System.out.println("2. Interpretar");
                            System.out.println("3. Salir");
                            opcion = read.nextInt();
                            switch (opcion) {
                                case 1 ->
                                    im.Afinar();
                                case 2 ->
                                    im.Interpretar();
                                case 3 ->
                                    System.out.println("Salio");
                            }
                        }
                        case 2 -> {
                            IIntrumentosMusicales im1 = f.escogerInstrumento("bajo");
                            System.out.println("Bajo");
                            System.out.println("¿Desea articulos complemenatios? s/n");
                            opcion2 = read.next();
                            switch (opcion2) {
                                case "s" ->
                                    ElementosComplementarios.getInstace().elegirElementos();
                                case "n" ->
                                    System.out.println("Salio...");
                            }
                            System.out.println("Que desea hacer con el bajo: ");
                            System.out.println("1. Afinar");
                            System.out.println("2. Interpretar");
                            System.out.println("3. Salir");
                            opcion = read.nextInt();
                            switch (opcion) {
                                case 1 ->
                                    im1.Afinar();
                                case 2 ->
                                    im1.Interpretar();
                                case 3 ->
                                    System.out.println("Salio");
                            }
                        }
                        case 3 -> {
                            IIntrumentosMusicales im2 = f.escogerInstrumento("piano");
                            System.out.println("Piano");
                            System.out.println("¿Desea articulos complemenatios? s/n");
                            opcion2 = read.next();
                            switch (opcion2) {
                                case "s" ->
                                    ElementosComplementarios.getInstace().elegirElementos();
                                case "n" ->
                                    System.out.println("Salio...");
                            }
                            System.out.println("Que desea hacer con el piano: ");
                            System.out.println("1. Afinar");
                            System.out.println("2. Interpretar");
                            System.out.println("3. Salir");
                            opcion = read.nextInt();
                            switch (opcion) {
                                case 1 ->
                                    im2.Afinar();
                                case 2 ->
                                    im2.Interpretar();
                                case 3 ->
                                    System.out.println("Salio");
                            }
                        }
                        case 4 ->
                            System.out.println("Salio");
                    }

                    break;
                case 5:
                    System.out.println("De que instrumento desea elegir: ");
                    System.out.println("1. Guitarra");
                    System.out.println("2. Bajo");
                    System.out.println("3. Piano");
                    System.out.println("4. Salir");
                    System.out.println("-----------------------------------------------------");
                    opcion = read.nextInt();
                    switch (opcion) {

                        case 1 -> {
                            IIntrumentosMusicales im = f.escogerInstrumento("guitarra");
                            System.out.println("Guitarra");
                            System.out.println("¿Desea articulos complemenatios? s/n");
                            opcion2 = read.next();
                            switch (opcion2) {
                                case "s" ->
                                    ElementosComplementarios.getInstace().elegirElementos();
                                case "n" ->
                                    System.out.println("Salio...");
                            }
                            System.out.println("Que desea hacer con la guitarra: ");
                            System.out.println("1. Afinar");
                            System.out.println("2. Interpretar");
                            System.out.println("3. Salir");
                            opcion = read.nextInt();
                            switch (opcion) {
                                case 1 ->
                                    im.Afinar();
                                case 2 ->
                                    im.Interpretar();
                                case 3 ->
                                    System.out.println("Salio");
                            }
                        }
                        case 2 -> {
                            IIntrumentosMusicales im1 = f.escogerInstrumento("bajo");
                            System.out.println("Bajo");
                            System.out.println("¿Desea articulos complemenatios? s/n");
                            opcion2 = read.next();
                            switch (opcion2) {
                                case "s" ->
                                    ElementosComplementarios.getInstace().elegirElementos();
                                case "n" ->
                                    System.out.println("Salio...");
                            }
                            System.out.println("Que desea hacer con el bajo: ");
                            System.out.println("1. Afinar");
                            System.out.println("2. Interpretar");
                            System.out.println("3. Salir");
                            opcion = read.nextInt();
                            switch (opcion) {
                                case 1 ->
                                    im1.Afinar();
                                case 2 ->
                                    im1.Interpretar();
                                case 3 ->
                                    System.out.println("Salio");
                            }
                        }
                        case 3 -> {
                            IIntrumentosMusicales im2 = f.escogerInstrumento("piano");
                            System.out.println("Piano");
                            System.out.println("¿Desea articulos complemenatios? s/n");
                            opcion2 = read.next();
                            switch (opcion2) {
                                case "s" ->
                                    ElementosComplementarios.getInstace().elegirElementos();
                                case "n" ->
                                    System.out.println("Salio...");
                            }
                            System.out.println("Que desea hacer con el piano: ");
                            System.out.println("1. Afinar");
                            System.out.println("2. Interpretar");
                            System.out.println("3. Salir");
                            opcion = read.nextInt();
                            switch (opcion) {
                                case 1 ->
                                    im2.Afinar();
                                case 2 ->
                                    im2.Interpretar();
                                case 3 ->
                                    System.out.println("Salio");
                            }
                        }
                        case 4 ->
                            System.out.println("Salio");
                    }

                    break;
                case 6:
                    continuar = "N";
                default:
                    break;
            }
            System.out.println("¿Desea elegir una nueva opcion? s/n");
            continuar = read.next();
        }

    }
}
