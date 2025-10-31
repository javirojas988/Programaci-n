package tema4.ejercicio;

public class T4ejer7 {
    public static void main(String[] args) {
        float nota1 ;
        float nota2 ;
        float nota3 ;
        float media ;

        System.out.println("Introduzca la primera nota");
        nota1 = Float.parseFloat(System.console().readLine()) ;

        System.out.println("Introduzca la segunda nota ");
        nota2 = Float.parseFloat(System.console().readLine());
        
        System.out.println("Introduzca la tercera nota");
        nota3 = Float.parseFloat(System.console().readLine());

        media = ((nota1 + nota2 + nota3)/3) ;
        System.out.println("La nota media es de "+ media);

    }
}
