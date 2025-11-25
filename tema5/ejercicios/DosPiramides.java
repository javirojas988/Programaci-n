package tema5.ejercicios;

/*

     +      +
    +++    +++
   +++++  +++++

*/
public class DosPiramides {
    public static void main(String[] args) {
        int altura ;
        altura = 6 ;


        for (int i = 0; i <= altura; i++) {
            for (int j = altura; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print("*");
                
            }
            for (int j = altura; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = altura; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print("*");
                
            }
            System.out.println();
        }
    }
}
