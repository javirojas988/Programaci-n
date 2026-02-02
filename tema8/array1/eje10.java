//mesa 0 o 4
/*
pregunta 1-4
primero libres 
si no rellenas mesas

Llegan , REVISO , ASIGNO
*/
import java.util.Scanner;

public class eje10 {

    public static Scanner sc  = new Scanner(System.in);

    public static void estadoMesas(int[]mesas){
        System.out.println("Estados de las mesas : ");
        System.out.println("┌───────────────────────────────────────────────────────────────┐");
        System.out.print("┼ Nº Mesas  │");
        for(int i = 0 ; i<10 ; i++){
            System.out.print("│ "+ i + " │");
        }
        System.out.println();
        System.out.println("┼───────────────────────────────────────────────────────────────┼");
        System.out.print("┼ Ocupación │");
        for(int i = 0 ; i<10 ; i++){
            System.out.print("│ "+ mesas[i] + " │");
        }
        System.out.println();
        System.out.println("└───────────────────────────────────────────────────────────────┘");

    }

    public static int revisaMesasVacias(int[]mesas){
        int mesaVacia = 50 ; 
        for(int i = 0 ; i<10 ; i++){
            if (mesas[i] == 0 ){
                mesaVacia = i ; 
            }
        }

        return mesaVacia ; // returnea que mesa esta disponible , SI NO DEVUELVE 50 
    }

    public static int revisaMesasCasi(int[]mesas , int personas){
        int mesaCasi = 50 ; 
        for(int i = 0 ; i<10 ; i++){
            if (mesas[i] + personas <= 4 ){
                mesaCasi = i ; 
            }
        }

        return mesaCasi ;  // returnea que mesa esta disponible de las casi llenas , SI NO DEVUELVE 50 
    }

    public static void main(String[] args) {
        
        int[] mesas = new int[10];
        for (int x = 0; x < 10; x++) {
            mesas[x]=0 ;
        }
        
        for ( int j = 0 ; j < 15 ; j++ ){
            // limpiar scream
            System.out.print("Bienvenidos, cuantas sois ? ");
            int personas = sc.nextInt() ; 
            estadoMesas(mesas);

            if (personas >= 1 && personas <= 4){
                // aqui printear codigo que se repetira 15 veces


                int mesaVacia = revisaMesasVacias(mesas); // revisa y avisa si hay mesas vacia

                if ( mesaVacia == 50 ) { // si no hay
                    int mesaCasi= revisaMesasCasi(mesas, personas) ; //revisa mesas rellenable

                    if ( mesaCasi == 50){ // si no hay
                        System.out.println("Losiento, no hay mesas libres a no ser que separemos vuestro grupo :/");
                    } else {
                        mesas[mesaCasi] = mesas[mesaCasi] + personas ; 
                        estadoMesas(mesas);
                        // esperar 3 s 
                    }
                } else {
                    mesas[mesaVacia]= mesas[mesaVacia] + personas ; 
                    estadoMesas(mesas);
                    
                }


            } else {
                System.out.println("losiento, solo grupos de 4 o menos");
            }
        }
        

    }
}