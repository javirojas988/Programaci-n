package Ejercicio;
/*
Se quiere crear un programa que nos permita representar gráficamente
los dígitos que forman un cierto número. Dicho gráfico se podrá
pintar en blanco y negro o en color.

da max y min y genera numero enmedio

*/

public class T7preparaexamen {
    public static void main(String[] args) {
        int numero ; 
        int max = 300000 ; 
        int min = 2130 ; 
        int numeroDigito = 0;
        try {
            numero = ((int) (Math.random() * (max - min + 1)) + min );  
            
            while ( numero > 0) {
                numero = numero/10 ;
                numeroDigito++ ;
            }
            while ( numero > 0) {
                System.err.println("" + numero%10);
                numero = numero/10 ;
                numeroDigito++ ;
            }
            for ( int i = 1 ; i <= numeroDigito ; i++){
                System.err.println("" + numero%10 );
            }
        } catch (Exception e) {
            System.out.println(" Error : "+ e);
        }
        
    }    
}
