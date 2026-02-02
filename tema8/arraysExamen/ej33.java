package arraysExamen; 
/*  max med mix de cm en persona de paise 
array pais 
array 4*10 con num alet 140-210 /
*/
public class ej33 {
    public static void pinta(String[]pais,int[][]alturas){
        int numero =  0 ; 
        int aux ; 
        int media = 0 ; 
        int max = 0  ; 
        int min = 1000 ; 
        
        System.out.println("                                                               MED  MAX  MIN");
        for (int y = 0; y < 4; y++) {
            System.out.print(pais[y]+":");
            for (int x = 0; x < 10; x++) {
                System.out.print(" "+ alturas[y][x] + " ");
                for (int j = 0; j < 10; j++) {
                    aux = alturas[y][j] ;
                    media  =  media + aux ;  
                }         
                media =  media / 10 ; 
                for( int k = 0; k< 10 ; k++){
                    aux = alturas[y][k] ;
                    if ( aux > max  ){
                        max = aux ; 
                    }
                }
                for( int l = 0; l< 10 ; l++){
                    aux = alturas[y][l] ;
                    if ( aux < min  ){
                        min = aux ; 
                        
                    }
                }
            }  
            System.out.print("|");
            System.out.print("  "+media); 
            System.out.print("  "+max); 
            System.out.print("  "+min); 
            System.out.println();
        }
    }


    public static void main(String[] args) {
        // String[] pais = new String[4] ; 
        String[] pais = {"   España", "    Rusia", "    Japón", "Australia"}; 
        int[][] alturas = new int[4][10];
        

        for (int y = 0; y < 4; y++) {
           
            for (int x = 0; x < 10; x++) {
                alturas[y][x] = (int) (Math.random()*(210-140+1))+140 ;
            }            
        }
        pinta(pais, alturas);

        // min , max y media 
 
       

    }
}
