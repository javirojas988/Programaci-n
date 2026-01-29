//jugado contra jugador
package arraysMAsPapus;
import java.util.Scanner;
public class conectaPapu {
    public static final int MAXY = 8 ; 
    public static final int MAXX = 10 ;
    public static Scanner sc = new Scanner(System.in);

    public static void pintatablero(String[][]tablero){
        int numero = MAXY-1 ; 
        for ( int y = 0 ; y < MAXY ; y++ ) {
            System.out.print(numero +" |");
            for ( int x = 0 ; x < MAXX ; x++ ){
                System.out.print(tablero[y][x]);;
            }
            System.out.print("|");
            System.out.println();
            numero -- ; 
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
    
        if
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

        while (gana = false ) {
            System.out.println("Introduce cordenadas JUGADOR 1");
            System.out.print("x:");
            respuestaX = sc.nextInt();
            System.out.print("y:");
            respuestaY = sc.nextInt();
            tablero[respuestaY][respuestaX] = "0" ;

            System.out.println("Introduce cordenadas JUGADOR 1");
            System.out.print("x:");
            respuestaX = sc.nextInt();
            System.out.print("y:");
            respuestaY = sc.nextInt();
            tablero[respuestaY][respuestaX] = "0" ;

            //FUNCION GANADOR SI O NO 
        }
    }
}
