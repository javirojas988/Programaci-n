package tema4.ejercicio;

//REALIZA PROGRAMA QUE DIGA SI ES PAR Y DIVISIBLE ENTRE 5 

import java.util.Scanner;

public class T4ejer12 {
    public static void main(String[] args) {
        int numero;
        int resto;
        Scanner scanner = new Scanner(System.in);
        System.out.print("introduce un numero entero: ");
        try {
            numero = scanner.nextInt();
            resto = numero % 2;

            if (resto == 0) {
                System.out.println("Es par");
            } else {
                System.out.println("Impar ");
            }

            if ( numero % 5 == 0){
                System.out.println("Divisible entre 5");
            } else {
                System.err.println(" no lo es");
            }
        } catch (Exception e) {
            System.out.println(" Error génerico " + e);
        }

    }
}
