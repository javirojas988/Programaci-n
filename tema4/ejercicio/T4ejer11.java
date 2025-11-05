package tema4.ejercicio;

// 11. Minicuestorario con 10 preguntas sobre la asignatura , cada pregunta suma y al final enseña la puntacion
public class T4ejer11 {
    public static void main(String[] args) {
        String respuesta1;
        String respuesta2;
        String respuesta3;
        int puntuacion;
        puntuacion = 0;

        System.out.println("Examen de programación teorico");

        // pregunta 1
        System.out.println("Cuál de los siguientes datos tiene más precisión?");
        System.out.println("a. Float ");
        System.out.println("b. double ");
        System.out.printf("c. int\nResponda:  ");
        respuesta1 = System.console().readLine();

        switch (respuesta1) {
            case "a":
                System.out.println("");
                break;
            case "b":
                System.out.println("");
                puntuacion = puntuacion + 1;
                break;
            case "c":
                System.out.println("");
                
                break;
        }

        // pregunta 2
        System.out.println("Html es un lenguaje de programación?");
        System.out.printf("Verdadero o falso : ");
        respuesta2 = System.console().readLine();
         switch (respuesta2) {
            case "falso":
                System.out.println("Siguiente pregunta");
                puntuacion = puntuacion + 1;
                break;
            case "verdadero" : 
                System.out.println("Siguiente pregunta");

                break;
         }
        // pregunta 3
        System.out.println("Siguiente pregunta");
        System.out.println("Cual de las siguiente memorias el volatil");
        System.out.println("a. ROM");
        System.out.println("b. EPROM");
        System.out.printf("c. RAM\nResponde: ");
        respuesta3 = System.console().readLine();

        switch (respuesta3) {
            case "a":
                System.out.println("Siguiente pregunta");
                break;
            case "b":
                System.out.println("Siguiente pregunta");
                break;
            case "c":
                System.out.println("");
                puntuacion = (puntuacion + 1 );
                break;
        }

        
        System.out.println("Su puntuación es de " + puntuacion +" sobre 3");
    }
}
