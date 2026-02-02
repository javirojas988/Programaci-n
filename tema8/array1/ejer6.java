// numeros en array  y los roto 
import java.util.Scanner;
public class ejer6 {
    public static Scanner entrada = new Scanner(System.in);
    public static final int tope=10 ; 
    public static void leer(int numeros[] , int tope){
        int respuesta ; 
        try {
            System.out.println("introduce "+ tope +" números");
            for(int i= 0 ; i < tope ; i++ ){
                respuesta = entrada.nextInt();
                numeros[i] = respuesta ; 
            }
            System.out.println();
        } catch (ArrayIndexOutOfBoundsException ime ) {
            System.out.println("introduce números validos");
        }
    }

    public static void rotar(int numeros[], int tope){
        int auxiliar  ;
        auxiliar = numeros[0] ;
        for(int i = 0 ; i < tope ; i++){
            if ( i != tope-1 ){
                numeros[i] = numeros[i+1] ;
            }
            
        }
        numeros[tope-1] = auxiliar ; 
        
        
    }

    public static void printear(int numeros[], int tope){
        for(int i= 0 ; i < tope ; i++ ){
            System.out.print(numeros[i]+ " | ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numeros ; 
         
        System.out.print("Cantidad números:");
        
        numeros = new int [tope] ; 
        
        leer(numeros , tope);
        for(int j=0;j<tope;j++){
            System.out.print(j+" | ");
        }
        System.out.println();
        for(int j=0;j<tope;j++){
            System.out.print("----");
        }
        System.out.println();
        printear(numeros , tope );
        System.out.println("Array rotado a la derecha");
        rotar(numeros , tope);
        for(int j=0;j<tope;j++){
            System.out.print(j+" | ");
        }
        System.out.println();
        for(int j=0;j<tope;j++){
            System.out.print("----");
        }
        System.out.println();
        printear(numeros , tope );

        
    }
} 