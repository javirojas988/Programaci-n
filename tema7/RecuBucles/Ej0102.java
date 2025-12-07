package tema7.RecuBucles;

public class Ej0102 {
    public static void H(int altura, int i) {

        for (int j = 0; j <= 4; j++) {
            if (j == 0 || j == 4 || i == altura / 2) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.print(" ");
    }

    // letra 0
    public static void O(int altura, int i) {

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

        System.out.print(" ");

    }

    // letra L
    public static void L(int altura, int i) {

        for (int j = 0; j <= 4; j++) {
            if (j == 0 || i == altura - 1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.print(" ");

    }

    // letra A
    public static void A(int altura, int i) {

        if (i == 0) {
            System.out.print(" *** ");
        } else {
            for (int j = 0; j <= 4; j++) {
                if (j == 0 || j == 4 || i == altura / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
        }
        System.out.print(" ");

    }

    // AAAAAAAAAAAAAAAA 67
    public static void main(String[] args) {
        int altura;
        // altura = (int)(Math.random()* (13 - 3 - 1 ) + 3 );
        altura = 9;
        for (int i = 0; i < altura; i++) {
            H(altura , i );
            O(altura , i );
            L(altura , i );
            A(altura , i );
            System.out.println();
        }

    }
}
