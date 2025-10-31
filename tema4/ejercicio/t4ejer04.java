package tema4.ejercicio;
 
public class t4ejer04 {

    public static void main(String[] args) {
        int NumMes ;
        System.out.print("introduce un número y le digo el mes :  ");
        NumMes = Integer.parseInt(System.console().readLine());

        switch ( NumMes ) {
            case 1 : System.out.print("enero");
            break;
            case 2 : System.out.print("febrero");
            break;
            case 3 : System.out.print("marzo");
            break;
            case 4 : System.out.print("abril");
            break;
            case 5 : System.out.print("mayo");
            break;
            case 6 : System.out.print("junio");
            break;
            case 7 : System.out.print("julio");
            break;
            case 8 : System.out.print("agosto");
            break;
            case 9: System.out.print("septiem");
            break;
            case 10: System.out.print("oct");
            break;
            case 11: System.out.print("noviem");
            break;
            case 12 : System.out.print("diciembre");
            break;
            default : System.out.print("introduce un numero valido");
            break;
        }
    }
}