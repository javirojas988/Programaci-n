package arraysMAsPapus;

import java.util.Scanner;

import tema6.ejmplo;

/* tesoro
aleatorio mina y tesoro 
4*5
Al final muestra tablero con los disparos realizados la mina y el tesoro

*/

public class tesoro27 {
    public static Scanner sc = new Scanner(System.in);
    final static int MAXIMOX = 5;
    final static int MAXIMOY = 4;

    public static void pinta(String[][] tesoro, boolean ganador, boolean detonado) {
        int numeroColu = MAXIMOX;
        int numeroFila = MAXIMOY;

        for (int x = 0; x < MAXIMOX; x++) { // x columnas , va bajando

            System.out.print(numeroFila + " | ");
            for (int y = 0; y < MAXIMOY; y++) { // hacia el lado

                if (tesoro[y][x] == "$" || tesoro[y][x] == "!") { // mira si es mina o tesoro
                    if (detonado == true) { // si es mina tapa a no se que la hayas tocado
                        System.out.print(" " + tesoro[y][x] + " ");
                    } else if (ganador == true) { // mismo
                        System.out.print(" " + tesoro[y][x] + " ");
                    } else {
                        System.out.print("   ");
                    }

                } else {
                    System.out.print(" " + tesoro[y][x] + " ");
                }
                
            }
            numeroFila--;
            System.out.println();
        }

        System.out.println("   -------------");
        System.out.print("  ");
        for (numeroColu = 0; numeroColu <= MAXIMOX; numeroColu++) {
            System.out.print("  " + numeroColu);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int xtesoro = (int) ((Math.random() * (MAXIMOX - 1 + 1)) + 1);
        int ytesoro = (int) ((Math.random() * (MAXIMOY - 1 + 1)) + 1);
        int xmina = (int) ((Math.random() * (MAXIMOX - 1 + 1)) + 1);
        int ymina = (int) ((Math.random() * (MAXIMOY - 1 + 1)) + 1);
        int xRespuesta = 0;
        int yRespuesta = 0;
        boolean ganador = false;
        boolean detonado = false;

        String[][] tesoro = new String[MAXIMOY][MAXIMOX]; // 4 filas (y) , 5 columnas (x)

        for (int x = 0; x < MAXIMOX; x++) { // rellena con 0
            for (int y = 0; y < MAXIMOY; y++) {
                tesoro[y][x] = " ";
            }
        }
        tesoro[ytesoro][xtesoro] = "$"; // establece tesoro
        tesoro[ymina][xmina] = "!"; // establece mina

        pinta(tesoro, ganador, detonado);
        while (detonado == false || ganador == false) {
            

            System.out.print("introduzca cordenadas X: ");
            xRespuesta = sc.nextInt();
            System.out.print("introduzca cordenadas Y: ");
            yRespuesta = sc.nextInt();
            

            if (tesoro[yRespuesta][xRespuesta] == tesoro[ytesoro][xtesoro]) {
                ganador = true;
            } else {
                tesoro[yRespuesta][xRespuesta] = "O" ; 
            }
            if (tesoro[yRespuesta][xRespuesta] == tesoro[ymina][xmina]) {
                detonado = true;
            } else {
                tesoro[yRespuesta][xRespuesta] = "O" ; 
            }
            pinta(tesoro, ganador, detonado);

        }

    }

}
