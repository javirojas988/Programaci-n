package tema7.RecuBucles;

// numero impar generado aleatoriamente
// HOLA , 

public class Ej0101 {

    // printea letra H
    public static void H(int altura) {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j <= 4; j++) {
                if (j == 0 || j == 4 || i == altura / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    // letra 0
    public static void O(int altura) {
        for (int i = 0; i < altura; i++) {
            if (i == 0 || i == altura - 1) {
                System.out.print(" *** ");
            } else {
                for (int j = 0; j <= 4; j++) {
                    if (j == 0 || j == 4) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }

            System.out.println("");
        }
    }

    // letra L
    public static void L(int altura) {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j <= 4; j++) {
                if (j == 0 || i == altura - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // letra A
    public static void A(int altura) {
        for (int i = 0; i < altura; i++) {
            if (i == 0 ) {
                System.out.print(" *** ");
            } else {
                for (int j = 0; j <= 4; j++) {
                    if ( j == 0 || j == 4 || i == altura/2 ) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    // AAAAAAAAAAAAAAAA
    public static void main(String[] args) {
        int altura;
        // altura = (int)(Math.random()* (13 - 3 - 1 ) + 3 );
        altura = 5;

        H(altura);
        System.out.println();
        O(altura);
        System.out.println();
        L(altura);
        System.out.println();
        A(altura);
        System.out.println();
    }
}
