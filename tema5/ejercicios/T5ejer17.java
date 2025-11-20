package tema5.ejercicios;

public class T5ejer17 {
    //SKIBIDI CUADRADO SKIBIDI CUBE

    public static void main(String[] args) {
        int altura ; 
        altura = 5 ;
        for (int i = 0; i < altura ; i++) { // altura
            
            
            for (int j = 0; j < altura ; j++) { //mete relleno siempre pa llega a altura(5)
                
                if ( i == 0 || i == altura-1 || j == 0 || j == altura-1){ //SOLO si  cuando X=0 o altura
                    System.err.print("W ");
                } else {
                    System.err.print("  ");
                }
                    
            }
            System.out.println("");
        }
    }
}
// 0    WWWWWWW


// 5    WWWWWWW