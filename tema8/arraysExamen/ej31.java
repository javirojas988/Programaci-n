package arraysExamen;
/* 
MEncion honorifica a lucia correa
array 10*10
200 300
mostrar diagonal  */
public class ej31 {
     public static final String AMARILLO = "\u001B[33m";
    public static final String RESET  = "\u001B[0m";   // Volver al color por

    public static void pinta(int[][]numeros){
        int[]diagonal = new int[10];
        int media = 0 ; 
        int aux ; 
        int max = 0; 
        int min = 901;
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
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
        for (int i = 0; i < 10 ; i++) {
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
        media = media / 10 ; 
        // mencion honorifica a mar lucas
        System.out.println();
        System.out.println("   Media: "+media);
        System.out.println("  Mínimo: "+min);
        System.out.println("  Máximo: "+max);
        
    }
    public static void main(String[] args) {
        int numerosAle ; 
        int[][]numeros = new int[10][10] ; 
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                numerosAle = (int)(Math.random()*(300-200+1))+200 ; 
                numeros[y][x] = numerosAle;
            }
        }
        pinta(numeros);
    }  
}
