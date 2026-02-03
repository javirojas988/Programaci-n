package arraysExamen;
/* 
array 9*9 
num alet 500 900 
muestra diagonal de aba IZ a arribDER
y sus 
max 
min 
media
 */

public class ej32 {
    public static final String AMARILLO = "\u001B[33m";
    public static final String RESET  = "\u001B[0m";   // Volver al color por

    public static void pinta(int[][]numeros){
        int[]diagonal = new int[9];
        int media = 0 ; 
        int aux ; 
        int max = 0; 
        int min = 901;
        for (int x = 0; x < 9; x++) {
            for (int y = 0; y < 9; y++) {
                if ( x == y) {
                    System.out.print(AMARILLO + " "+numeros[y][x]); 
                    diagonal[x]=numeros[y][x]; 
                }else {
                    System.out.print(RESET+ " "+numeros[y][x]);
                }      
            }
            System.out.println(RESET);
        }
        System.out.println();
        System.out.print("DIAGONAL;");
        for (int i = 8; i > 0; i--) {
            System.out.print(" "+diagonal[i]);
            aux = diagonal[i];
            media = media + aux ; 
            if ( aux > max ){
                max = aux ; 
            }
            if ( aux < min ){
                min = aux ; 
            }
        }
        media = media / 9 ; 
        // mencion honorifica a mar lucas
        System.out.println();
        System.out.println("   Media: "+media);
        System.out.println("  Mínimo: "+min);
        System.out.println("  Máximo: "+max);
        
    }
    public static void main(String[] args) {
        int numerosAle ; 
        int[][]numeros = new int[9][9] ; 
        for (int x = 0; x < 9; x++) {
            for (int y = 0; y < 9; y++) {
                numerosAle = (int)(Math.random()*(900-500+1))+500 ; 
                numeros[y][x] = numerosAle;
            }
        }
        pinta(numeros);
    }    
}
