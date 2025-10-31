package tema4.ejercicio;
//hola
import java.util.Scanner;
public class T4_EJER6 {
    public static void main(String[] args) {
        float g ;
        float resultado ;
        int respuesta ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("buenas tarde , somo lo calculadores de cuanto tarde un objeto en caer , quiere usted calcular algo , caballero ?? ");
        System.out.println("SI QUIERE CALCULA ALTURA RESPONDA 1 SI NO QUIERE CUALQUIER OTRO NUMERO") ; 
        respuesta = Integer.parseInt(System.console().readLine()) ;
        
        if (respuesta == 1  ) {
            System.out.println("inserte desde donde usted quiere lanzar el objeto , o desde donde va a caer");
            resultado = scanner.nextFloat();
            respuesta = //raiz cuadrada
            System.out.println("el resultado es"+ respuesta);
        }
        else{
            System.out.println("q tenga buen dia ");

        }
 
       
        
    }
}
