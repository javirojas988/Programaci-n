package Mazmorras;
import java.util.Scanner;
public class MazmorrasProfe {
    //
    public static void inicio(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("█   █  █████  █████  █   █  █████  █████  █████  █████   █████\n██ ██  █   █      █  ██ ██  █   █  █   █  █   █  █   █   █\n█ █ █  █   █     █   █ █ █  █   █  █   █  █   █  █   █   █\n█   █  █████    █    █   █  █   █  █████  █████  █████   █████\n█   █  █   █   █     █   █  █   █  █ █    █ █    █   █       █\n█   █  █   █  █      █   █  █   █  █  █   █  █   █   █       █\n█   █  █   █  █████  █   █  █████  █   █  █   █  █   █   █████\n\n");
        System.out.println("Pulsa enter para empezar para empezar");
        sc.nextLine();
    }
    //
    public static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
    }
    //
    public static void menuPrincipal(){
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------");
        System.out.println("1.Explorar mazmorra");
        System.out.println("2 Ver estado del jugador");
        System.out.println("3 Usar pocion");
        System.out.println("4 Tienda");
        System.out.println("5 Salir del juego");
        System.out.println("----------------------");
        System.out.print("Elige opción:");         
    }
    public static void explorarMazmorra(){

    }
    public static void estadoJugador(int vida , int ataque , int defense , int oro , int pociones , int turno){
        System.out.printf("_____________\n| Vidad | %d |", vida ,"");
    }
    public static void usarPocion(){
        
    }
    public static void tienda(){
        
    }
    public static void salirDelJuego(){
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion ; 
        inicio();
        limpiarPantalla();     
        for ( int rondas=0 ; rondas <10; rondas++){
            menuPrincipal();
            opcion = sc.nextInt();

        }
    }
}
