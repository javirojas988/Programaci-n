package tema5.ejercicios;
// multiplos de 5 de 0 a 100 FOr

public class T5ejer2java {
    public static void main(String[] args) {
        int numero ;
        int multiplo ; 
        numero = 0 ;
        multiplo = 0 ; 
        do {
            System.out.printf("%d ", multiplo );
            numero = numero + 1 ; 
            multiplo = numero * 5 ;


        } while ( multiplo <= 100 );
    }
}
