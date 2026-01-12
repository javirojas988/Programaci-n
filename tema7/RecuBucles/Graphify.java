
/**
 * Javier Rojas Aguilar
 */
import java.util.Scanner;

class Graphify {

    // Definición de constante LIMPIAR PANTALLA
    public static final String CLEAR = "\033[H\033[2J";

    // Definición de constantes de COLOR
    public static final String RESET = "\033[0m";
    public static final String RED_BACKGROUND = "\033[41m";
    public static final String GREEN_BACKGROUND = "\033[42m";
    public static final String BLUE_BACKGROUND = "\033[44m";
    public static final String PURPLE_BACKGROUND = "\033[45m";

    // Definición de constantes de SÍMBOLOS COLOR
    public static final String HORIZONTAL = "\u2550"; // ═
    public static final String VERTICAL = "\u2551"; // ║

    public static final String ESQUINA_SUP_IZQ = "\u2554"; // ╔
    public static final String ESQUINA_SUP_DER = "\u2557"; // ╗
    public static final String ESQUINA_INF_IZQ = "\u255A"; // ╚
    public static final String ESQUINA_INF_DER = "\u255D"; // ╝

    public static final String CRUCE_IZQ = "\u2560"; // ╠
    public static final String CRUCE_DER = "\u2563"; // ╣
    public static final String CRUCE_SUP = "\u2566"; // ╦
    public static final String CRUCE_CEN = "\u256C"; // ╬
    public static final String CRUCE_INF = "\u2569"; // ╩

    // Funciones
    // A Num aleatorio entre los max y min establecidos
    public static long generarNumeroAleatorio(long max, long min) {
        long numero;
        numero = (long) (Math.random() * (max - min + 1) - min);
        return numero;
    }

    public static long invertirNumero(long numero) {
        long volteado = 0;
        long digito;
        long numInvert = numero;
        boolean respuesta;
        while (numInvert > 0) {
            digito = numInvert % 10;
            volteado = volteado * 10 + digito;
            numInvert = numInvert / 10;
        }

        return volteado;
    }

    public static int longitudDigito(long numero) {
        int longitud = 0;
        long numeroLong = numero;

        while (numero > 0) {
            longitud = longitud + 1;
            numeroLong = numeroLong / 10;
        }
        return longitud;
    }

    public static long calcularDigitoMayor(long numero) {
        long digitoMayor = 0;
        long numeroCalc = numero;
        long digitoTemp;
        while (numeroCalc > 0) {
            digitoTemp = numeroCalc % 10;
            numeroCalc = numeroCalc / 10;
            if (digitoTemp > digitoMayor) {
                digitoMayor = digitoTemp;
            }

        }
        return digitoMayor;
    }

    public static String obtenerColor(int digito) {
        String color;
        if (digito == 1 || digito == 2 || digito == 3 || digito == 4 || digito == 0) {
            color = "Azul";
        } else if (digito == 5 || digito == 6) {
            color = "Rojo";
        } else if (digito == 7 || digito == 8) {
            color = "Verde";
        } else {
            color = "purpura";
        }
        return color;
    }

    public static void dibujarGrafico(long numero, boolean colorGrafica) {
        long ancho = calcularDigitoMayor(numero);
        long altura = longitudDigito(numero);
        long volteado = invertirNumero(numero);
        long digito;

        if (colorGrafica ) {
            // for de altura con la longitud del digito 
            for (int i = 0; i < altura; i++) {
                System.err.println("---");
                digito = volteado%10;
                System.err.printf("|%d", digito);
                System.out.println();
                volteado = volteado / 10;
            }
        } else {
            System.out.println("color");
        }

    }

    /**
     * GRAPHIFY: algoritmo principal
     * 
     * @param args
     */
    public static void main(String[] args) {
        long numero = 0;
        long min;
        long max;
        String respuesta;
        boolean colorGrafica;
        Scanner sc2 = new Scanner(System.in);

        System.out.print(CLEAR); // limpiamos la pantalla

        System.out.println("GRAPHIFY");
        System.out.println("====================");
        try {
            System.out.print("introduce valor mínimo del rango: ");
            
            min = sc2.nextLong();
            if (min <= 0) {
                System.err.println("DEBES INTRODUCIR UN VALOR ENTERO Y POSITIVO");
            } else {
                System.out.print("introduce valor máximo del rango: ");

                max = sc2.nextLong();

                if (max <= 0 || max <= min) {
                    System.out.println("INTRODUCE UN VALOR ENTERO, POSITIVO Y MAYOR QUE EL MÍNIMO ");
                } else {
                    System.out.print("Dibujo la gráfica en blanco y negro o en color (B|C) :");
                    sc2.nextLine() ; 
                    respuesta = sc2.nextLine();

                    if (respuesta.equals("C") || respuesta.equals("c")) {
                        colorGrafica = false; // color
                    } else {
                        colorGrafica = true; // negro
                        dibujarGrafico(numero, colorGrafica);

                    }

                }
            }

        } catch (Exception e) {
            System.err.println("Error en :" + e);
        }

    }

}