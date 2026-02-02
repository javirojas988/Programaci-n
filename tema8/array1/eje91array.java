public class eje91array {
    public static void main(String[] args) {
        final int TOPE = 20;
        int numero;
        int paresNum = 0 ;
        int imparesNum = 0 ;
        int[]pares = new int[TOPE] ; 
        int[]impares = new int[TOPE] ; 
        
        for(int i = 0 ; i<20 ; i++){
            numero = (int)((Math.random()*(20-0+1))+0);
            System.out.print(numero+" ");
            if ( numero%2 == 0 ){
                pares[paresNum]= numero ; 
                paresNum++; 
            } else {
                impares[imparesNum]= numero ; 
                imparesNum++;
            }
        }
        System.out.println();
        paresNum=0;
        imparesNum=0;

        for(int i = 0 ; i<20 ; i++){
            //printea 
            if ( pares[paresNum] == 0 )   {
                
            } else {
                System.out.print(pares[paresNum]+" ");
                
            }
            paresNum++;
        }
        for(int i = 0 ; i<20 ; i++){
            //printea 
            if ( impares[imparesNum] == 0 )   {
                
            } else {
                System.out.print(impares[imparesNum]+" ");
                
            }
            imparesNum++;    
        }
    }
}
