package tema9.ejclase;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {
        boolean condicion= true ;
        String valor ; 

        Scanner sc = new Scanner(System.in);
        Disco Ye = new Disco("Abc123", "YE", "kanye", "POPIUM", 40);
        Colecciondiscos coleccion  = new Colecciondiscos();

        while (condicion) {
            System.out.print("-------------------------- ");
            System.out.println(Ye);
            valor = sc.nextLine();
            // coleccion.add(valor);
            if (valor.isEmpty() ){
                condicion=false;
            }
        }
        
    }
}
