package tema8;
import java.util.InputMismatchException;
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // float [] votos = new float[4] ;
        // votos[0] = 1000000;


        int respuesta ; 
        float[] votos = { 1 , 2 , 67 , 56 ,54};
        try {
            
            System.out.println("introduze num 1-5");
            respuesta = sc.nextInt();
            System.out.println(votos[respuesta - 1]);

            

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Introduze un valor del 1-5");
        } catch (InputMismatchException e ){
            System.out.println("Introduze un número");
        }



        //cerramo flujo de la entrada
        sc.close() ; 
    }
}
