//mesa 0 o 4
/*
pregunta 1-4
primero libres 
si no rellenas mesas

Llegan , REVISO , ASIGNO
*/
import java.util.Scanner;

public class eje10 {
    public static void tabla(int mesas []){
        System.out.println("nº mesa   | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 ");
        System.out.println("----------------------------------------------------");
        System.out.print("ocupacion ");
        for ( int i = 0 ; i < 10 ; i++ ){
            System.out.print("| "+mesas[i]+" ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        int [] mesas = new int [10];
        
        //se pide mesa , reviso las libres y asigno si no relleno . 
        Scanner sc = new Scanner(System.in);
        int clientes = 6 ; 
        int respuesta ;
        boolean asignado = false;

        for ( int i = 0 ; i < clientes ;  i++){
            System.out.println("Bienvenidos cuantos sois ? ");
            respuesta = sc.nextInt();   // num clientes

            if (respuesta>4 || respuesta<0){
                System.out.println("Lo siento, no admitimos grupos de "+respuesta+", haga grupos de 4 personas como máximo e intente de nuevo»");
                
            }else{
                tabla(mesas);           // estado de las mesas
                System.out.println();

                
                for(int j = 0 ; j< 10 ; j++){
                    if (mesas[j]== 0 ){            //mirar si hay libres y asignar
                        mesas[j]=respuesta ; 
                        System.out.println("Ve a la mesa "+ (j+1));
                        j=11 ; 
                        tabla(mesas);
                        asignado = true ; 
                    } 
                    asignado = false ; 
                }
                
                if ( asignado == false ){
                    for(int x = 0 ; x< 10 ; x++){       //mirar si hay hueco pa rellena
                        if ( respuesta+mesas[x] <= 4)  {
                            asignado = true  ;
                            System.out.println("Ve a la mesa "+ (x+1));
                        }else {
                            System.out.println("no queda hueco para un grupo tan grande lo sentimos");
                        }
                    }
                }
                
            }

            
        }
        

    }
}
