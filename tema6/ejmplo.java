package tema6;

public class ejmplo {
    public static void main(String[] args) {
        int numero ; 
        do {
        numero = (int) (Math.random()*(1000 - 6 )) + 6 ; 
        System.out.printf("%d ", numero);
        } while ( numero != 67 ) ; 

    }
}
