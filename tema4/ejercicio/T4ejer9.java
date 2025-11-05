package tema4.ejercicio;

public class T4ejer9 {
    public static void main(String[] args) {
        int mes;
        int dia;

        System.out.println("hola buenas , hoy te decimos tu horoscopo , solo dinos tu fecha de nacimiento  ");
        System.out.print("acontinuación introduce el dia en el que naciste:  ");
        dia = Integer.parseInt(System.console().readLine());
        System.out.print("acontinuación introduce el mes en el que naciste:  ");
        mes = Integer.parseInt(System.console().readLine());

        if (dia <= 30 && dia >= 1 && mes <= 6 && mes >= 1) {
            if ( mes == 2 && dia > 29 ){
                System.err.println("papu no existe esa fecha xd");
            }
            System.out.println("eres un papu tonto");

        } else {
            System.out.println("eres listo");
        }
        
    }

}
