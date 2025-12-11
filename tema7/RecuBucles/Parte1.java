package RecuBucles;
import java.util.Scanner;
public class Parte1 {
    public static void Superior(boolean respuesta0 ){ ; System.out.print(( respuesta0 == true)?" *** " : "     "); }
    public static void SupIZq(boolean respuesta1 ) { ; System.out.print(( respuesta1 == true)?"*   " : "    "); }
    public static void SupDer(boolean respuesta2) { ; System.out.print(( respuesta2 == true)?"*" : " "); }
    public static void Centro(boolean respuesta3 ) { ; System.out.print(( respuesta3 == true)?" *** " : "     "); }
    public static void InfDer(boolean respuesta4 ) { ; System.out.print(( respuesta4 == true)?"*" : " "); }
    public static void InfIzq(boolean respuesta5 ) { ; System.out.print(( respuesta5 == true)?"*   " : "    "); }
    public static void Inferior(boolean respuesta6 ) { ; System.out.print(( respuesta6 == true)?" *** " : "     "); }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digito = 5;

            switch (digito) {
                case 1:
                    break; 
                case 2 : 
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5: 
                    Superior(true); // fila uno
                    System.out.println();
                    SupIZq(true);// fila 2
                    SupDer(false);
                    System.out.println();
                    SupIZq(true);
                    SupDer(false); // fila 3
                    System.out.println(); 
                    Centro(true); // fila  4
                    System.out.println();
                    InfIzq(false);
                    InfDer(true); // fila  5
                    System.out.println();
                    InfIzq(false);
                    InfDer(true); // fila  6                    
                    System.out.println();
                    Inferior(true); // fila  7
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 0:
                    break;
            }  
    }
}
