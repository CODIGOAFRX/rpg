package rpg;

import java.util.Scanner;
import java.lang.Math;

public class main {

    public static int MostrarMenu() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("*****************     MENU   ******************");
        System.out.println("***********************************************");
        System.out.println("*****************  1. LUCHAR        ***********");
        System.out.println("*****************  2. TIENDA        ***********");
        System.out.println("*****************  3. INVENTARIO    ***********");
        System.out.println("*****************  4. ESTADISTICAS  ***********");
        System.out.println("*****************  5. SALIR         ***********");
        System.out.println("***********************************************");
        int opcion = teclado.nextInt();
        return opcion;
    }

    public static String Bienvenida() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("***********************************************");
        System.out.println("Bienvenido al despertar de las Sombras de Medac");
        System.out.println("***********************************************");
        System.out.println("Pulsa enter para continuar...");

        System.out.println("¿Cual es tu nombre viajero?");
        String NombreUsuario = teclado.nextLine();
        System.out.println("Encantado de conocerte " + NombreUsuario
                + " ...tome asiento junto al fuego hay mucho de lo que hablar...");
        System.out.println("Pulsa enter para continuar...");
        teclado.nextLine();
        return NombreUsuario;

    }

    public static void Mensaje() {
        System.out.println("\n");
        System.out.println(
                "TE QUEDAN MUCHAS AVENTURAS POR DELANTE VIAJERO, HA,HA,HA... SELECCIONA LO QUE DESEAS HACER AHORA...SI TE ATREVES");
    }

    public static int Pueblo() {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Parece que vienes de muy lejos... ¿Cual es tu origen camarada? ");
        System.out.println("1. Fuerte de los Guerreros de las minas");
        System.out.println("2. Aldea de Paladines de luz");
        System.out.println("3. Castillo Demoniaco de la Muerte");
        System.out.println("4. Ciudad Botín Elfica");
        int pueblo = teclado.nextInt();

        return pueblo;
    }

    public static void main(String[] args) {

        int random1 = (int) (Math.random() * 40 + 20);
        int random2 = (int) (Math.random() * 20 + 10);
        int random3 = (int) (Math.random() * 35 + 15);
        int random4 = (int) (Math.random() * 70 + 50);
        

        Enemigo enemigo1 = new Enemigo("Javi", random1);
        Enemigo enemigo2 = new Enemigo("Jose", random2);
        Enemigo enemigo3 = new Enemigo("Luis", random3);
        Enemigo enemigo4 = new Enemigo("PEDROISONOMIKUE", random4);
        Enemigo [] enemigos = new Enemigo[4];
            enemigos[0] = enemigo1;
            enemigos[1] = enemigo2;
            enemigos[2] = enemigo3;
            enemigos[3] = enemigo4;

        Scanner entrada = new Scanner(System.in);
        String Nombre;
        int Salud, Dinero, Ataque;
        Jugador jugador1 = null; // se tiene que inicializar el jugador ya que al solo existir en el if cabe la
                                 // posibilidad de que no entre por lo que se iguala a "null" que significa vacio
                                 // y ya .
        // CREAMOS OBJETOS DE RELEVANCIA

        Bienvenida();

        int NumeroPueblos = Pueblo(); ///

        if (NumeroPueblos == 1) {
            jugador1 = new Jugador("Guerrero", 10, 35, 150);
            // jugador1.setNombre("Guerrero");

            System.out.println("Se aprecia que eres un feroz Guerrero dispuesto a la batalla!!");
        } else if (NumeroPueblos == 2) {
            jugador1 = new Jugador("Paladin", 15, 20, 300);
            System.out.println("El brillo de tu armadura sagrada casi me deja ciego Paladin...");
        } else if (NumeroPueblos == 4) {
            jugador1 = new Jugador("Elfo", 8, 22, 500);
            System.out.println("Menos mal que mi arca está vacia de oro eh Granujila... bienvenido elfo");
        } else if (NumeroPueblos == 3) {
            jugador1 = new Jugador("Demonio", 20, 30, 50);
            System.out.println("Ya decía yo que olía a azufre por aqui... bienvenido Gran Demonio");
        }
       

        Mensaje();
        int opcion = MostrarMenu();
        if (opcion == 4 && jugador1 != null) { // esto lo que quiere decir es que funcione este if cuando opcion sea 4 y
                                               // jugador 1 exista.
            System.out.println(jugador1);
        } else if (opcion == 1 && jugador1 != null) {
            Scanner teclado = new Scanner(System.in);
            int random5 = (int) (Math.random() * 4);
            System.out.println("AL ATAQUEEEEEEEEEEEEEEEEEEEEE!!");
            System.out.println("Ha aparecido un enemigo salvaje...¿estarás a su altura? ");//array con el random para sacar al enemigo aleatorio
            System.out.println(enemigos[random5]);
            int AtaqueOpcion = 0;
            System.out.println("¿Quieres enfrentarte a esta bestia?");
            System.out.println("Recuerda si alcanzas la victoria obtendrás recompensas... pero si pierdes perderás puntos de salud");
            System.out.println("1. LUCHAR");
            System.out.println("2. HUIR");
            int OpcionLucha = teclado.nextInt();
                if (OpcionLucha==1) {
                    //CERRAMOS LAS LUCHAS Y PROPONEMOS LAS GANANCIAS EN ORO, PUNTOS DE VIDA Y DROPEO DE ARMAS MÁS UN COONTADOR 
                    
                }
        }

    }// cierre main

}// cierre clase