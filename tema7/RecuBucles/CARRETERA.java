package tema7.RecuBucles;

// longitud carretera 
// anchura es la misma 4 relleno 2 borde
// cada metro puede GIRAR IZQ , GIRAR DERECH , IR RECTO , 
// probabilidad 50% de obstaculo , posicion aleatoria , 0 / * 

// Switch cada cacho de acera con IZQ , DER , REC 
// Math random en cada cacho 0/1 obstaculo 
// Obstculo O / * , posicion 1/4

import java.util.Scanner;

public class CARRETERA {

    
    public static void Cacho(int obstaculo) {
        int tipoObstucalo ; 
        int posicionObstucalo;
        int direccion;
        direccion = (int) (Math.random() * (3 - 1 + 1) + 1); // Der Rec Izq

        if (obstaculo == 1) {

            //OBSTACULOS SI 

            tipoObstucalo = (int) (Math.random() * (2 - 1 + 1) + 1);
            posicionObstucalo = (int) (Math.random() * (4 - 1 + 1) + 1);

            switch (direccion) {
                case 1: // Der
                    if (tipoObstucalo == 2 ){
                        System.err.println("  |0   |");
                    } else if ( tipoObstucalo == 1){
                        System.err.println("  |  * |");
                    }
                    break;
                case 2: // Izq
                    if (tipoObstucalo == 2 ){
                        System.err.println("|0   | ");
                    } else if ( tipoObstucalo == 1){
                        System.err.println("|*   | ");
                    }
                    break;
                case 3: // Cen
                     if (tipoObstucalo == 2 ){
                        System.err.println(" | 0  | ");
                    } else if ( tipoObstucalo == 1){
                        System.err.println(" |  * | ");
                    }
                    break;
            }
        } else {

            //OBSTACULOS NO

            switch (direccion) {
                case 1: // Der
                    System.out.println("  |    |");
                    break;
                case 2: // Izq
                    System.out.println("|    | ");
                    break;
                case 3: // Cen
                    System.out.println(" |    | ");
                    break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int obstucalo ; 
        int longitud ; 

        

        System.out.print("Longitud carretera: ");
        longitud = sc.nextInt();

        for ( int i = 0 ; i < longitud ; i++ ){
            obstucalo = (int) (Math.random() * (2 - 1 + 1) + 1);
            Cacho(obstucalo);
            
        }
    }
}
