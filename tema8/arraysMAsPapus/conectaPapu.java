//jugado contra jugador
package arraysMAsPapus;
import java.util.Scanner;
public class conectaPapu {
    public static final int MAXY = 4 ; 
    public static final int MAXX = 4 ;
    public static final int WINCONDITION = 4 ; 
    public static Scanner sc = new Scanner(System.in);

    public static void pintatablero(String[][]tablero){
        int numero = 0 ; 
        for ( int y = 0 ; y < MAXY ; y++ ) {
            System.out.print(numero +" |");
            for ( int x = 0 ; x < MAXX ; x++ ){
                System.out.print(tablero[y][x]);;
            }
            System.out.print("|");
            System.out.println();
            numero ++ ; 
        }
        System.out.print("   ");
        for ( int x = 0 ; x < MAXX ; x++ ){
            System.out.print("---");
        }
        System.out.println();
        System.out.print("   ");
        for ( int x = 0 ; x < MAXX ; x++ ){
            System.out.print(" "+ x +" ");
        }  
    }
    public static boolean comprobacion(String[][]tablero){
        boolean gana = false ; 
        int XA ;
        int YA ; 
        int i ; 
        for ( int y = 0 ; y < MAXY ;y++ ) {
            for ( int x = 0 ; x < MAXX ; x++){
                if ( tablero[y][x] == " 0 " || tablero[y][x] == " X "){ //vertical
                    for ( i = 0 ; 0 < WINCONDITION ; i++ ){ 
                        XA = x ; 
                        YA = y ; 
                        if (tablero[YA][XA+1] != " 0 " || tablero[YA][XA+1] != " X " ){
                            i = 100 ; // pausar el bucle
                        }
                    }
                }
                if ( tablero[y][x] == " 0 " || tablero[y][x] == " X "){ //HOrizontal
                    for ( i = 0 ; 0 < WINCONDITION ; i++ ){ 
                        XA = x ; 
                        YA = y ; 
                        if (tablero[YA+1][XA+1] != " 0 " || tablero[YA+1][XA+1] != " X " ){
                            i = 100 ; // pausar el bucle
                        }
                    }
                }
                if ( tablero[y][x] == " 0 " || tablero[y][x] == " X "){ //izquierda arriba
                    for ( i = 0 ; 0 < WINCONDITION ; i++ ){ 
                        XA = x ; 
                        YA = y ; 
                        if (tablero[YA+1][XA+1] != " 0 " || tablero[YA+1][XA+1] != " X " ){
                            i = 100 ; // pausar el bucle
                        }
                    }
                }
            }
        }
        return gana ; 
    }
    public static void main(String[] args) {
        boolean gana = false; 
        int respuestaX ; 
        int respuestaY ; 

        String [][] tablero = new String[MAXY][MAXX]; // fila Y , columnas X 

        for ( int y = 0 ; y < MAXY ;y++ ) {
            for ( int x = 0 ; x < MAXX ; x++){
                tablero[y][x] = " . " ;
            }
        }

        pintatablero(tablero);

        while (gana == false ) {
            System.out.println();
            System.out.println("Introduce cordenadas JUGADOR 1");
            System.out.print("x:");
            respuestaX = sc.nextInt();
            System.out.print("y:");
            respuestaY = sc.nextInt();
            tablero[respuestaY][respuestaX] = " 0 " ;
            pintatablero(tablero);
            System.out.println("Introduce cordenadas JUGADOR 2");
            System.out.println();
            System.out.print("x:");
            respuestaX = sc.nextInt();
            System.out.print("y:");
            respuestaY = sc.nextInt();
            tablero[respuestaY][respuestaX] = " X " ;
            pintatablero(tablero);
            //FUNCION GANADOR SI O NO 
            gana = comprobacion(tablero) ; 
        }
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAA");
    }
}
