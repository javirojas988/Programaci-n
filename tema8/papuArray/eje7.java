import java.util.Scanner;

public class eje7 {

    public static void numeros100(int[]array){
        int numeros ; 
        int j=0 ; 
        
        while (j < 100 ){
            numeros = (int)((Math.random()*(20-0+1))-0);
            array[j] = numeros ;
            j++ ; 
            System.out.printf("%d ",numeros);
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroUsuario ; 
        int nuevoNumero ; 
        int[]array= new int[100];


        numeros100(array );
        System.out.println("Introduzca un número de los que se han mostrado");
        numeroUsuario = sc.nextInt();
        System.out.println("Introduzca un número para remplazarlo");
        nuevoNumero = sc.nextInt();
        
        for (int j = 0 ; j < 100 ; j++ ){
            
            if ( array[j] ==  numeroUsuario){
                array[j] = nuevoNumero ; 
            }
            
        }
        for( int i = 0 ; i < 100 ; i ++ ){
            System.out.print(array[i] + " ");
        }
    }
}