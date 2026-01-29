package tema8;
import java.util.Scanner;
public class ejerP1 {
    //lee 10 número por teclao y luego printeamos en orden invero
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in) ;

    int[] numeros ;
    numeros = new int[10] ;

    for(int i=0; i<10 ; i++){
        System.out.print("introduce numero: ");
        int respuesta = sc.nextInt();
        
        
        numeros[i]  = respuesta ; 
    }
    for (int j = 9 ; j<10 ; j--){
        System.out.println(numeros[j]);
    }
  }
}
