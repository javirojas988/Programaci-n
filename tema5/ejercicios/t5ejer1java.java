package tema5.ejercicios;

public class t5ejer1java {
    public static void main(String[] args) {
    int numero ;
    int suma = 0 ; 
    int total = 0 ;
    
    
    System.out.println("introduce numeros , pon uno negativo cuando quieras acabar");
    suma = Integer.parseInt(System.console().readLine());

        do {
            System.out.print("?  ");
            numero = Integer.parseInt(System.console().readLine());
            
            if (numero >= 0 ) {
                suma += numero ;
                total++ ;
            }


        } while (suma  >= 0);
    }
}
