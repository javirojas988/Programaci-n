package tema5.ejercicios;

// pinte una piramide , pide altura y tecla
/*
 *         x
 *        xxx
 *       xxxxx
 */
public class T5ejer16 {
    public static void main(String[] args) {
        int altura;
        int i;
        
        System.out.println("altura ? ");
        altura = Integer.parseInt(System.console().readLine());
    

        for ( i = 0; i <= altura; i++) {
            for (int a = altura; a >= i; a--) {
                System.err.print(" ");
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                System.err.print("X");
            }
            System.err.println();
        }

    }
}
