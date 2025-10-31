package tema4.ejercicio;

public class t4_ejer5 {
    public static void main(String[] args) {
        String solicitu ;

        float base ; 
        float altura ;
        float area ;

        System.out.println("¿desea calcular el area de un cuadrado , triaangulo o rectangulo?");
        solicitu = System.console().readLine() ; 
        switch ( solicitu ) {
            case "triangulo" : 
            System.out.println("introduzca los valores de la base y altura") ;
            base = Float.parseFloat(System.console().readLine());
            altura = Float.parseFloat(System.console().readLine());
            area = ( base * altura ) / 2 ;
            System.out.printf("el valor del area es"+ area ) ;
            break;
            
            case "cuadrado" :
            System.out.println("introduzca el valor del lado ") ;
            base = Float.parseFloat(System.console().readLine());
            area = ( base * base ) ;
            System.out.println("el valor del area es "+ area ) ;
            break;

            case "rectangulo" :
            System.out.println("introduzca el valor del lado y despues de la altura ") ;
            base = Float.parseFloat(System.console().readLine());
            altura = Float.parseFloat(System.console().readLine());
            area = ( base * altura ) ;
            System.out.println("el area es "+ area ) ;
            break;

            default : System.out.println("solo se permite las figuras mencionadas, revise que lo haya escrito bien");
            break;
        }
    }
    
}
