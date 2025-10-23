package tema4.ejercicio;

public class t4_clase1 {
    public static void main(String[] args) {

        /*switch(expresion){
            case valor1: *break((salto incondicional solo para switch))

            case valor2;
        } */
        int dia ;
        System.out.printf("hola como te caigo ? \n 1papu \n 2 papu papu \n 3 mega papu");
        
        dia = Integer.parseInt(System.console().readLine()) ;
        
        switch ( dia )  {
            case 1 : System.out.println("mejorare") ;
            break ;
            case 2 : System.out.println("esta bien ");
            break;
            case 3 : System.out.println("martes");
            break;
            case 4 : System.out.println("miercoles");
            break;
            case 5 : System.out.println("jueve");
            break;
            case 6 : System.out.println("viernes");
            break;
            default: System.out.println(" se q el tiempo estropea los muebles")  ;
            break; 
        }
    
    }
}
