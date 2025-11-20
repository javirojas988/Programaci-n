package tema5.ejercicios;
//Programa ^2 ^3  apartir del q se introduzca  | n | n2 | n3 |
public class T5ejer8 {
    public static void main(String[] args) {
        int numero ; 
        int i ;
        int inicio ;

        System.out.println("introduce un numero");
        numero = Integer.parseInt(System.console().readLine());
        i = numero + 5 ;
        inicio = numero ;
        for ( numero = inicio  ; numero <= i ; numero++ ){
            System.out.println( numero + " | " + (numero * numero) + " | " + (numero * numero * numero) );
        }
    }
}
