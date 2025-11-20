package tema5;

public class Cuadrado {
    public static void main(String[] args) {
        int altura ; 
        altura = 2 ;
        for (int i = 0; i <= altura ; i++) { // i 0 - 5 

            for (int y = altura ; y > i  ; y--) {  // y 5 - 0
                System.err.print(" ");
            }
            for (int j = 0; j < i*2-1  ; j++ ) {  // j  1 - 5
                System.err.print("x");
            }
            System.err.println("");
        }
    }
    
}
