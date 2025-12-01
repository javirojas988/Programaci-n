package tema7.Ejercicio; // piramides huecas 

public class T7ejer2 {
    public static void piramide(int altura, int numero) {
        for (int i = 0; i <= altura; i++) { // bucle q printea una

            for (int a = 0; a < numero; a++) { // dice cuantas veces se repite cada linea de la piramide
                for (int y = altura; y > i; y--) { // mientras q Y sea mayor q y resta uno ( altura = 4 ) 4,3,2,1 1=y STOP printea cada vez menos espacios
                                                   
                    System.err.print(" ");

                }
                for (int j = 0; j < i * 2 - 1; j++) { // mientras q j sea menor q y por dos suma , con lo q i*2-1 es la cantidad de X
                                                     
                    
                    if ( i == altura ){
                        
                        System.out.print("x");
                        if ( j == i*2-2 ){
                            System.err.print("  ");
                        }
                    } else {
                        if ( j == i*2-2 || j == 0){
                            System.err.print("x");
                        } else {
                            System.err.print(" ");
                        }
                        if ( j == i*2-2 ){
                            System.err.print("  ");
                        }
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
        int numero ;
        int altura ; 
        altura = 6 ; 
        numero = 5 ;
        piramide(altura , numero );
    }
}
