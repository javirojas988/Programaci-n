package tema5.ejercicios;

public class T5piramideHueca {
    public static void main(String[] args) {
        int altura ; 
        altura = 5 ;
        for (int i = 0; i <= altura ; i++) { // mientras que i sea menor que cero i+1

            for (int y = altura ; y > i  ; y--) {  // mientras que y sea mayor que i y-1 , con lo q baja de 5 y se encuentra con una i cada ve mayo = menos espacios
                System.err.print(" ");
            }
            for (int j = 0; j < i*2-1  ; j++ ) {  // mientras q j sea menor printea hasta llegar a i que cada es mayor ,  2*-1 indica cuantas veces printeara
                if (  i == 1 || i == altura || j == 0 || j == i*2-2 ) { // entonces si modifico el interior tengo q modificar i 
                    System.err.print("x");
                } else  {
                    System.err.print(" ");
                }
                
            }
            System.err.println("");
        }
    }
}
