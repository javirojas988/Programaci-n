package arraysMAsPapus;
import java.util.Scanner;

/* tesoro
aleatorio mina y tesoro 
4*5
Al final muestra tablero con los disparos realizados la mina y el tesoro

*/
public class tesoro27 {
    public static Scanner sc = new Scanner(System.in);
    final static int MAXIMOX = 5 ; 
    final static int MAXIMOY = 4 ;  
    public static void pinta(int[][] tesoro){
        int numeroFil = 3 ;
        int numeroCol = 4 ; 
        System.out.println("TESORROOOOOOOOOOO");

        for (int x = 0; x < MAXIMOX; x++) {
            for (int y = 0; y < MAXIMOY; y++) {
                tesoro [y][x] = 0 ;
            }
        } 
    }
    public static void main(String[] args) {
        int xtesoro = (int)((Math.random()*(5-1+1))+1); 
        int ytesoro = (int)((Math.random()*(4-1+1))+1); ; 
        int xmina = (int)((Math.random()*(5-1+1))+1) ; 
        int ymina = (int)((Math.random()*(4-1+1))+1);; 
        int xRespuesta ; 
        int yRespuesta ; 
        boolean ganador = false ;
        boolean detonado = false;
        
        int[][] tesoro = new int[MAXIMOY][MAXIMOX]; //4 filas (y) , 5 columnas (x)
        for (int x = 0; x < MAXIMOX; x++) {
            for (int y = 0; y < MAXIMOY; y++) {
                tesoro [y][x] = 0 ;
            }
        }
        tesoro[ytesoro][xtesoro] = 1 ; 
        tesoro[ymina][ytesoro] = 2 ; 

        while(detonado == false || ganador == false){
            System.out.print("introduzca cordenadas, (x,y): ");
            xRespuesta = sc.nextInt();
            yRespuesta = sc.nextInt();
            pinta(tesoro);

        }
        
    }


}
