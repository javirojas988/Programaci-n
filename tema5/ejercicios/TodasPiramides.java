package tema5.ejercicios;

public class TodasPiramides { /// SIN TERMINAr
    public static void main(String[] args) {
        int altura;
        altura = 6;
        
        int piramides;
        piramides = 3 ; 
        for (piramides = 1; piramides >= 0; piramides--) {
            for (int i = 0; i <= altura; i++) {
                for (int j = altura; j > i; j--) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i * 2 - 1; j++) {
                    System.out.print("*");

                }
                
                System.out.println("");
            }
        }
    }
}
