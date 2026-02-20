70
ackage tema9.arraylist;
/* Realiza un array list al que le introduzcas cilor  */
import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
            ArrayList<String> colores = new ArrayList<>();
            
        String color;
        boolean condicion= true ;
        System.out.println("Ingresa colores (presiona Enter sin escribir nada para terminar):");
        
        while (condicion) {
            System.out.print("Color: ");
            color = scanner.nextLine();
            colores.add(color);
            if (color.isEmpty() ){
                condicion=false;
            }
        }
        
        System.out.println("Colores metidos:");
        for (String c : colores) {
            System.out.println(colores);
        }
        
    }
}