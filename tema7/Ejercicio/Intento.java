package tema7.Ejercicio;

public class Intento {
    public static void main(String[] args) {
        int digito ; 
        int volteado = 0;
        
        int aleatorio = 1234 ; 

        while (aleatorio > 0) {
            digito = aleatorio % 10;
            volteado = (volteado * 10) + digito;
            
            aleatorio /= 10;
        }
        
    }
}
