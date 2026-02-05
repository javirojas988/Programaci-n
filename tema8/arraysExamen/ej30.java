package arraysExamen;
/* TRES EN RAYA / */

import java.util.Scanner;

public class ej30 {
    public static Scanner sc = new Scanner(System.in);
    public static final int TABLERO = 3;
    public static void waifu(){
        System.out.printf(" ██████   ██████\n █        █\n █  ████  █  ████\n █     █  █     █\n ██████   ██████"
);;
}
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

    public static boolean comprobación(String[][]tablero){
        boolean gana = false ; 
        int JUGADOR1 = 0 ; 
        int JUGADOR2 = 0 ;
        int x = 0 ;
        int y = 0 ; 

        while ( y < TABLERO && JUGADOR1 != 3 && JUGADOR2 != 3 ){ //VERTICAL
            while ( x < TABLERO && JUGADOR1 != 3 && JUGADOR2 != 3 ){
                if ( tablero[y][x].equals(" X ")){
                    JUGADOR1++ ; 
                    if (JUGADOR1==3){
                        gana = true ; 
                    }
                }
                if ( tablero[y][x].equals(" 0 ")){
                    JUGADOR2++ ; 
                    if (JUGADOR2==3){
                        gana = true ; 
                    } 
                }  
                x++;    
            }
            y++;
            x = 0 ; 
            JUGADOR1 = 0 ; 
            JUGADOR2 = 0 ; 
        }
        x=0 ; 
        y=0 ; 
        while ( x < TABLERO && JUGADOR1 != 3 && JUGADOR2 != 3 ){ // HORIZONTAL
            while ( y < TABLERO && JUGADOR1 != 3 && JUGADOR2 != 3 ){
                if ( tablero[y][x].equals(" X ")){
                    JUGADOR1++ ; 
                    if (JUGADOR1==3){
                        gana = true ; 
                    }
                }
                if ( tablero[y][x].equals(" 0 ")){
                    JUGADOR2++ ; 
                    if (JUGADOR2==3){
                        gana = true ; 
                    } 
                }  
                x++;    
            }
            y++;
            x = 0 ; 
            JUGADOR1 = 0 ; 
            JUGADOR2 = 0 ; 
        }
        

        return gana ;  
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
        pinta(tablero);
        while (gana == false ){
            System.out.println("JUGADOR 1 ");
            System.out.print("INTRODUCE CORDENADA X ");
            rX = sc.nextInt();
            System.out.print("INTRODUCE CORDENADA Y ");
            rY = sc.nextInt(); 
            tablero[rX-1][rY-1] = " X " ; 
            pinta(tablero);
            if (comprobación(tablero) == true) {
                System.out.println("GANASTE JUGADOR 1 ");
                gana = true ; 
                waifu();
            } else {
                System.out.println("JUGADOR 2 ");
                System.out.print("INTRODUCE CORDENADA X ");
                rX = sc.nextInt();
                System.out.print("INTRODUCE CORDENADA Y ");
                rY = sc.nextInt(); 
                tablero[rX-1][rY-1] = " 0 " ; 
                pinta(tablero);
                if (comprobación(tablero) == true) {
                    System.out.println("GANASTE JUGADOR 2 ");
                    gana = true ; 
                    waifu();
                }
            }
        }

    }
}
