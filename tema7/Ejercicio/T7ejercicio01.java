package Ejercicio;

public class T7ejercicio01 {
    public static void piramide(int altura, int numero) {
        for (int i = 0; i <= altura; i++) { // bucle q printea una

            for (int a = 0; a < numero; a++) {
                for (int y = altura; y > i; y--) { // mientras q Y sea mayor q y resta uno ( altura = 4 ) 4,3,2,1 1=y STOP printea cada vez menos espacios
                                                   
                    System.err.print(" ");

                }
                for (int j = 0; j < i * 2 - 1; j++) { // mientras q j sea menor q y por dos suma , con lo q i*2-1 es la cantidad de X
                                                     
                    System.err.print("x");
                    if ( j == i*2-2){
                        System.err.print("   ");
                    }

                }
                for (int y = altura; y > i; y--) { // mientras q Y sea mayor q y resta uno ( altura = 4 ) 4,3,2,1 1=y STOP printea cada vez menos espacios
                                                   
                    System.err.print(" ");

                }
            }
            System.err.println("");

        }
    }

    public static void main(String[] args) {
        int numero;
        int altura = 4;

        numero = 3; 
        piramide(altura, numero);

    }
}