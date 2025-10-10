package tema3.ejerciciot3;
import java.util.Scanner;
public class t3ej {
    public static void main(String[] args) {
        int pesetas ;
        Scanner xx = new Scanner(System.in);
        System.out.print("buenas , introduzca la cantidad de pesetas y se la convertiremos en euros \t ") ;
        pesetas = xx.nextInt();
        
        System.out.printf("si tiene %d usted tenndria %d euros", pesetas , pesetas/164 );
    }
    
}
