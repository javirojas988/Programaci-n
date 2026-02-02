public class t8ejer5 {
    public static void leer(int[] n, int[] n2,int[] n3, int i , int numero){
        
        int cuadrado = numero*numero;
        int cubo = numero*numero*numero;
        n[i] = numero ; 
        n3[i] = cubo ; 
        n2[i] = cuadrado;
    }
    public static void tabla(int numero, int[] n , int[] n2 , int[]n3 ){
        System.out.printf("n1  |  n2  | n3   \n" );  
        System.out.printf("------------------\n" );  
        for( int j = 0 ; j < 20 ; j++){
            System.out.printf(n[j]+ "  |  "+ n2[j] +"  |  "+ n3[j]+"\n" ); 
            System.out.printf("------------------\n");     
        }
        
    }
    public static void main(String[] args) {
        int numero = 0 ;
        
        int[] n ; 
        n = new int[20];
        int[] n2 ; 
        n2 = new int[20];
        int[] n3 ; 
        n3 = new int[20];   

        for( int i = 0 ; i < 20 ; i++){
            numero = (int)((Math.random()*(100-0+1 ))+0);   
            leer(n, n2, n3, i, numero);
        }
        tabla(numero, n, n2, n3);
    }
}
