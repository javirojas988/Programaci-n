package RecuBucles;

import java.util.Scanner;

public class Parte2 {
    public static void Superior(boolean respuesta0 ){ ; System.out.print(( respuesta0 == true)?" *** " : "     "); }
    public static void SupIZq(boolean respuesta1 ) { ; System.out.print(( respuesta1 == true)?"*   " : "    "); }
    public static void SupDer(boolean respuesta2) { ; System.out.print(( respuesta2 == true)?"*" : " "); }
    public static void Centro(boolean respuesta3 ) { ; System.out.print(( respuesta3 == true)?" *** " : "     "); }
    public static void InfDer(boolean respuesta4 ) { ; System.out.print(( respuesta4 == true)?"*" : " "); }
    public static void InfIzq(boolean respuesta5 ) { ; System.out.print(( respuesta5 == true)?"*   " : "    "); }
    public static void Inferior(boolean respuesta6 ) { ; System.out.print(( respuesta6 == true)?" *** " : "     "); }
    public static void DibujarNumero(int digito){
        switch (digito) {
                case 1:
                    Superior(false); // fila uno
                    System.out.println();
                    SupIZq(false);// fila 2
                    SupDer(true);
                    System.out.println();
                    SupIZq(false);
                    SupDer(true); // fila 3
                    System.out.println(); 
                    Centro(false); // fila  4
                    System.out.println();
                    InfIzq(false);
                    InfDer(true); // fila  5
                    System.out.println();
                    InfIzq(false);
                    InfDer(true); // fila  6                    
                    System.out.println();
                    Inferior(false); // fila  7
                    break; 
                case 2 :
                    Superior(true); // fila uno
                    System.out.println();
                    SupIZq(false);// fila 2
                    SupDer(true);
                    System.out.println();
                    SupIZq(false);
                    SupDer(true); // fila 3
                    System.out.println(); 
                    Centro(true); // fila  4
                    System.out.println();
                    InfIzq(true);
                    InfDer(false); // fila  5
                    System.out.println();
                    InfIzq(true);
                    InfDer(false); // fila  6                    
                    System.out.println();
                    Inferior(true); // fila  7
                    break;
                case 3:
                    Superior(true); // fila uno
                    System.out.println();
                    SupIZq(false);// fila 2
                    SupDer(true);
                    System.out.println();
                    SupIZq(false);
                    SupDer(true); // fila 3
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
                case 4:
                    Superior(false); // fila uno
                    System.out.println();
                    SupIZq(true);// fila 2
                    SupDer(true);
                    System.out.println();
                    SupIZq(true);
                    SupDer(true); // fila 3
                    System.out.println(); 
                    Centro(true); // fila  4
                    System.out.println();
                    InfIzq(false);
                    InfDer(true); // fila  5
                    System.out.println();
                    InfIzq(false);
                    InfDer(true); // fila  6                    
                    System.out.println();
                    Inferior(false); // fila  7
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
                    InfIzq(true);
                    InfDer(true); // fila  5
                    System.out.println();
                    InfIzq(true);
                    InfDer(true); // fila  6                    
                    System.out.println();
                    Inferior(true); // fila  7
                    break;
                case 7:
                    Superior(true); // fila uno
                    System.out.println();
                    SupIZq(false);// fila 2
                    SupDer(true);
                    System.out.println();
                    SupIZq(false);
                    SupDer(true); // fila 3
                    System.out.println(); 
                    Centro(false); // fila  4
                    System.out.println();
                    InfIzq(false);
                    InfDer(true); // fila  5
                    System.out.println();
                    InfIzq(false);
                    InfDer(true); // fila  6                    
                    System.out.println();
                    Inferior(false); // fila  7
                    break;
                case 8:
                    Superior(true); // fila uno
                    System.out.println();
                    SupIZq(true);// fila 2
                    SupDer(true);
                    System.out.println();
                    SupIZq(true);
                    SupDer(true); // fila 3
                    System.out.println(); 
                    Centro(true); // fila  4
                    System.out.println();
                    InfIzq(true);
                    InfDer(true); // fila  5
                    System.out.println();
                    InfIzq(true);
                    InfDer(true); // fila  6                    
                    System.out.println();
                    Inferior(true); // fila  7
                    break;
                case 9:
                    Superior(true); // fila uno
                    System.out.println();
                    SupIZq(true);// fila 2
                    SupDer(true);
                    System.out.println();
                    SupIZq(true);
                    SupDer(true); // fila 3
                    System.out.println(); 
                    Centro(true); // fila  4
                    System.out.println();
                    InfIzq(false);
                    InfDer(true); // fila  5
                    System.out.println();
                    InfIzq(false);
                    InfDer(true); // fila  6                    
                    System.out.println();
                    Inferior(false); // fila  7
                    break;
                case 0:
                    Superior(true); // fila uno
                    System.out.println();
                    SupIZq(true);// fila 2
                    SupDer(true);
                    System.out.println();
                    SupIZq(true);
                    SupDer(true); // fila 3
                    System.out.println(); 
                    Centro(false); // fila  4
                    System.out.println();
                    InfIzq(true);
                    InfDer(true); // fila  5
                    System.out.println();
                    InfIzq(true);
                    InfDer(true); // fila  6                    
                    System.out.println();
                    Inferior(true); // fila  7
                    break;
            } 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número del 0-9: ");
        int digito = sc.nextInt();
        if ( digito>=0 || digito<=9){
            DibujarNumero(digito);
        } else {
            System.out.println("Introduce un valor valido");
        }
        
        
    }
}
