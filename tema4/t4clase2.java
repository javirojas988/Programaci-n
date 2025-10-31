package tema4;

public class t4clase2 {
    /*  
    aleatoria = Math.ramdon() ;
    aleatorio =  (int)(math.ramdon() * 10)
    
    
    
    
    
    */
    public static void main(String[] args) {
        
    double aleatorio ;
    int numero ; 
    // es con double en principio
    aleatorio = Math.random()  ; // este no da de 0 a 1 ,,
    System.out.println(aleatorio);


    // nosotro le damo el int ,,
    // el * 10  es [0,10) ;;;
    numero = (int) (Math.random() * 10);
    System.out.println(numero);
    // [0,10) 
    // [ min , max) --> (math.random() *(max - min)) + min


    
    }
}
