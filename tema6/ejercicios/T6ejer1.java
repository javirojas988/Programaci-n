package tema6.ejercicios;
//tira un dado  y muestra suma total
public class T6ejer1 {
    public static void main(String[] args) {
        int numero3 ;
        int numero2 ;
        int numero1 ;
        int total ; 

        numero3 = (int)(Math.random()*(6+1));
        numero2 = (int)(Math.random()*(6+1));
        numero1 = (int)(Math.random()*(6+1));
        System.out.printf("%d\n", numero1);
        System.out.printf("%d\n", numero2);
        System.out.printf("%d\n", numero3);
        total = numero1 + numero2 + numero3 ; 
        System.err.println("Total; "+ total);
       
        //System.out.println((int) (Math.random()*7) + "");
    }
    
}
