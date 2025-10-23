package tema3.ejerciciot3;
 import java.util.Scanner;
public class t3ej3 {
    public static void main(String[] args) {
        int diner ;
        Scanner xx = new Scanner(System.in);
        System.out.println("cuanto cuesta?") ;
        diner = xx.nextInt();
        System.out.println("");
        System.out.printf("Base imponible   %d \n ", diner );
        int iva ; 
        iva = (diner*21)/100 ;
        
        System.out.printf("iva (21%%) \t %d \n" , iva );
        System.out.println("--------------------------");
        System.out.printf("Total \t \t %d \n" , (diner - iva ));
        
    }
}
