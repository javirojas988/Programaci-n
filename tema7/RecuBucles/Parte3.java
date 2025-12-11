package RecuBucles;

import java.util.Scanner;

public class Parte3 {
    public static void Superior(boolean respuesta0 ){ ; System.out.print(( respuesta0 == true)?" *** " : "     "); }
    public static void SupIZq(boolean respuesta1 ) { ; System.out.print(( respuesta1 == true)?"*   " : "    "); }
    public static void SupDer(boolean respuesta2) { ; System.out.print(( respuesta2 == true)?"*" : " "); }
    public static void Centro(boolean respuesta3 ) { ; System.out.print(( respuesta3 == true)?" *** " : "     "); }
    public static void InfDer(boolean respuesta4 ) { ; System.out.print(( respuesta4 == true)?"*" : " "); }
    public static void InfIzq(boolean respuesta5 ) { ; System.out.print(( respuesta5 == true)?"*   " : "    "); }
    public static void Inferior(boolean respuesta6 ) { ; System.out.print(( respuesta6 == true)?" *** " : "     "); }

    //numeros del 1-9
    public static void DibujarNumero(int j , int i){
        switch (j) {
                case 1:
                    if ( i == 1){ Superior(false);}
                    if ( i == 2){ SupIZq(false);SupDer(true);}
                    if ( i == 3){ SupIZq(false);SupDer(true);}
                    if ( i == 4){ Centro(false); }
                    if ( i == 5){ InfIzq(false);InfDer(true);}
                    if ( i == 6){ InfIzq(false);InfDer(true);}
                    if ( i == 7){ Inferior(false);}
                    break; 
                case 2 :
                    if ( i == 1){ Superior(true);}
                    if ( i == 2){ SupIZq(false);SupDer(true);}
                    if ( i == 3){ SupIZq(false);SupDer(true);}
                    if ( i == 4){ Centro(true); }
                    if ( i == 5){ InfIzq(true);InfDer(false);}
                    if ( i == 6){ InfIzq(true);InfDer(false);}
                    if ( i == 7){ Inferior(true);}
                    break;
                case 3:
                    if ( i == 1){ Superior(true);}
                    if ( i == 2){ SupIZq(false);SupDer(true);}
                    if ( i == 3){ SupIZq(false);SupDer(true);}
                    if ( i == 4){ Centro(true); }
                    if ( i == 5){ InfIzq(false);InfDer(true);}
                    if ( i == 6){ InfIzq(false);InfDer(true);}
                    if ( i == 7){ Inferior(true);}
                    break;
                case 4:
                    if ( i == 1){ Superior(false);}
                    if ( i == 2){ SupIZq(true);SupDer(true);}
                    if ( i == 3){ SupIZq(true);SupDer(true);}
                    if ( i == 4){ Centro(true); }
                    if ( i == 5){ InfIzq(false);InfDer(true);}
                    if ( i == 6){ InfIzq(false);InfDer(true);}
                    if ( i == 7){ Inferior(false);}
                    break;
                case 5: 
                   if ( i == 1){ Superior(true);}
                    if ( i == 2){ SupIZq(true);SupDer(false);}
                    if ( i == 3){ SupIZq(true);SupDer(false);}
                    if ( i == 4){ Centro(true); }
                    if ( i == 5){ InfIzq(false);InfDer(true);}
                    if ( i == 6){ InfIzq(false);InfDer(true);}
                    if ( i == 7){ Inferior(true);}
                    break;
                case 6:
                    if ( i == 1){ Superior(true);}
                    if ( i == 2){ SupIZq(true);SupDer(false);}
                    if ( i == 3){ SupIZq(true);SupDer(false);}
                    if ( i == 4){ Centro(true); }
                    if ( i == 5){ InfIzq(true);InfDer(true);}
                    if ( i == 6){ InfIzq(true);InfDer(true);}
                    if ( i == 7){ Inferior(true);}
                    break;
                case 7:
                    if ( i == 1){ Superior(true);}
                    if ( i == 2){ SupIZq(false);SupDer(true);}
                    if ( i == 3){ SupIZq(false);SupDer(true);}
                    if ( i == 4){ Centro(false); }
                    if ( i == 5){ InfIzq(false);InfDer(true);}
                    if ( i == 6){ InfIzq(false);InfDer(true);}
                    if ( i == 7){ Inferior(false);}
                    
                    break;
                case 8:
                    if ( i == 1){ Superior(true);}
                    if ( i == 2){ SupIZq(true);SupDer(true);}
                    if ( i == 3){ SupIZq(true);SupDer(true);}
                    if ( i == 4){ Centro(true); }
                    if ( i == 5){ InfIzq(true);InfDer(true);}
                    if ( i == 6){ InfIzq(true);InfDer(true);}
                    if ( i == 7){ Inferior(true);}
                    break;
                case 9:
                    if ( i == 1){ Superior(true);}
                    if ( i == 2){ SupIZq(true);SupDer(true);}
                    if ( i == 3){ SupIZq(true);SupDer(true);}
                    if ( i == 4){ Centro(true); }
                    if ( i == 5){ InfIzq(false);InfDer(true);}
                    if ( i == 6){ InfIzq(false);InfDer(true);}
                    if ( i == 7){ Inferior(false);}
                    break;
                case 0:
                    if ( i == 1){ Superior(true);}
                    if ( i == 2){ SupIZq(true);SupDer(true);}
                    if ( i == 3){ SupIZq(true);SupDer(true);}
                    if ( i == 4){ Centro(false); }
                    if ( i == 5){ InfIzq(true);InfDer(true);}
                    if ( i == 6){ InfIzq(true);InfDer(true);}
                    if ( i == 7){ Inferior(true);}
                    break;
            } 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número del 0-9: ");
        int digito = sc.nextInt();
        if ( digito>=0 || digito<=9){
            
            for( int i = 1 ; i <= 7 ; i++){
                for (int j = 0 ; j <=digito ; j++){
                    DibujarNumero(j , i); 
                    System.out.print(" ");
                }
                System.out.println();
            }


        } else {
            System.out.println("Introduce un valor valido");
        }
        
        
    }
}
