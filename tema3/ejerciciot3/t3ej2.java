package tema3.ejerciciot3;
import java.util.Scanner;
public class t3ej2 {
    public static void main(String[] args) {
        int num1 ;
        int num2 ;
        Scanner xx = new Scanner(System.in) ; 
        System.out.print("introduzca dos numeros\n");
        num1 = xx.nextInt() ;
        num2 = xx.nextInt() ;
        System.out.printf("%d + %d = %d", num1 , num2 , (num1 + num2)) ;
        System.out.println("");
        System.out.printf( "%d * %d = %d", num1 , num2 , num1*num2) ;
        System.out.println("");
        System.out.printf("%d - %d = %d", num1 , num2 , (num1 - num2)) ;
        System.out.println("");
        System.out.printf( "%d / %d = %d", num1 , num2 , num1/num2) ;
    }
}
