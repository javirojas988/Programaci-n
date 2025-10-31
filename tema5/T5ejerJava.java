package tema5;

public class T5ejerJava {
    public static void main(String[] args) {
            
    // for (int i= 1 ; i < 10 ; i++ ){
        // inicializacion de la variable de control -- condicion -- incremento ;

        int edad  ; 

        System.out.print("Escribe tu edad ");
        edad = Integer.parseInt(System.console().readLine()); 

        for (int i = 1; i <= edad ; i++ ){
            System.out.print("  " + i);
        }

    }
}
