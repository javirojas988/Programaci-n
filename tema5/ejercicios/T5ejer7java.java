package tema5.ejercicios;

public class T5ejer7java {
    public static void main(String[] args) {
        int numero ;
        int suma ;
        int media ;
        int veces ; 

        veces = -1 ; 
        suma= 0 ;
        numero = 0 ;
        System.out.println("Introduce numeros y te diremos tu media , pon 1 negativo cuando hayas acabo de poner tus numeros");

        try {
            do {
                suma = suma + numero ;
                
                System.out.print("Introduce numero: ");
                numero = Integer.parseInt(System.console().readLine());
                veces = veces + 1 ;


            } while(numero >= 0 );

            System.out.printf("Suma: %s \nNumeros introducidos: %s \n" , suma , veces );
            media = suma / veces  ;
            System.out.println("Media = "+ media);


        } catch (Exception e) {
            System.out.println(" ");
            System.out.println("Error: "+ e);
            System.out.println("Intentalo de nuevo" );
        }
        
    }
}
