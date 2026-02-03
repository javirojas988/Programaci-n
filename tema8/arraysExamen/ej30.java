package arraysExamen;
/* TRES EN RAYA / */

import java.util.Scanner;

public class ej30 {
    public static Scanner sc = new Scanner(System.in);
    public static final int TABLERO = 3;
    public static void pinta(String[][]tablero){
        int numero=1;
        for (int y = 0; y < TABLERO; y++) {
            System.out.print(numero+ " | ");
            for (int x = 0; x < TABLERO; x++) {
                System.out.print(tablero[x][y]);
            }
            System.out.println();
            numero++;
        }
        System.out.print("   ");
        for (int i = 0; i < TABLERO; i++) {
            System.out.print("---");
        }
        System.out.println();
        System.out.print("   ");
        for (int i = 1; i <= TABLERO; i++) {
            System.out.print(" "+i+" ");
        }
        System.out.println();
    }

    //mencion honorifica a billie elish 
    public static void main(String[] args) {
        String[][]tablero = new String[TABLERO][TABLERO];
        boolean gana = false ; 
        int rX ;
        int rY ; 

        for (int y = 0; y < TABLERO; y++) {
            for (int x = 0; x < TABLERO; x++) {
                tablero[y][x]=" . ";
            }
        }
        
        while (gana == false ){
            pinta(tablero);
            System.out.print("INTRODUCE CORDENADA X");
            rX = sc.nextInt();
            System.out.print("INTRODUCE CORDENADA Y");
            rY = sc.nextInt(); 
            tablero[rY-1][rX-1] = " X " ; 
            pinta(tablero);
            System.out.println("JUGADOR 2 ");
            System.out.print("INTRODUCE CORDENADA X");
            rX = sc.nextInt();
            System.out.print("INTRODUCE CORDENADA Y");
            rY = sc.nextInt(); 
            tablero[rY-1][rX-1] = " 0 " ; //
            
        }
    }
}
