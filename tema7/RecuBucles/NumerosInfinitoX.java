package RecuBucles;

import java.util.Scanner;

public class NumerosInfinitoX {
    public static int longitudDigito(int numero) {
        int longitud = 0;
        int numeroLong = numero;

        while (numero > 0) {
            longitud = longitud + 1;
            numeroLong = numeroLong / 10;
        }
        return longitud;
    }

    public static void Num1(int digito1, int altura, int i) {
        switch (digito1) {
            case 1:
                for (int j = 0; j < 3; j++) {
                    if (j == 2) {
                        System.out.print("X");
                    } else {
                        System.out.print(" ");
                    }
                    System.out.print(" ");
                }
                break;
            case 2:
                for (int j = 0; j < 3; j++) {
                    if (i == 0 || i == altura / 2 || i == altura - 1) {
                        System.out.print("X");
                    } else if (i > altura / 2 && j == 0) {
                        System.out.print("X");
                    } else if (i < altura / 2 && j == 2) {
                        System.out.print("X");
                    } else {
                        System.out.print(" ");
                    }
                    System.out.print(" ");
                }
                break;
            case 3:
                for (int j = 0; j < 3; j++) {
                    if (i == 0 || i == altura / 2 || i == altura - 1) {
                        System.out.print("X");
                    } else if (j == 2) {
                        System.out.print("X");
                    } else {
                        System.out.print(" ");
                    }
                    System.out.print(" ");
                }

                break;
            case 4:
                for (int j = 0; j < 3; j++) {
                    if (i == altura / 2) {
                        System.out.print("X");
                    } else if (i < altura / 2 && (j == 0 || j == 2)) {
                        System.out.print("X");
                    } else if (i > (altura / 2) && j == 2) {
                        System.out.print("X");
                    } else {
                        System.out.print(" ");
                    }
                    System.out.print(" ");
                }
                break;
            case 5:
                for (int j = 0; j < 3; j++) {
                    if (i == 0 || i == altura / 2 || i == altura - 1) {
                        System.out.print("X");
                    } else if (i < altura / 2 && j == 0) {
                        System.out.print("X");
                    } else if (i > altura / 2 && j == 2) {
                        System.out.print("X");
                    } else {
                        System.out.print(" ");
                    }
                    System.out.print(" ");
                }
                break;
            case 6:
                for (int j = 0; j < 3; j++) {
                    if (i == 0 || i == altura / 2 || i == altura - 1) {
                        System.out.print("X");
                    } else if (i < altura / 2 && j == 0) {
                        System.out.print("X");
                    } else if (i > altura / 2 && (j == 2 || j == 0)) {
                        System.out.print("X");
                    } else {
                        System.out.print(" ");
                    }
                    System.out.print(" ");
                }
                break;
            case 7:
                for (int j = 0; j < 3; j++) {
                    if (i == 0) {
                        System.out.print("X");
                    } else if (j == 2) {
                        System.out.print("X");
                    } else {
                        System.out.print(" ");
                    }
                    System.out.print(" ");
                }
                break;
            case 8:
                for (int j = 0; j < 3; j++) {
                    if (i == 0 || i == altura / 2 || i == altura - 1) {
                        System.out.print("X");
                    } else if (j == 0 || j == 2) {
                        System.out.print("X");
                    } else {
                        System.out.print(" ");
                    }
                    System.out.print(" ");
                }
                break;
            case 9:
                for (int j = 0; j < 3; j++) {
                    if (i == 0 || i == altura / 2 || i == altura - 1) {
                        System.out.print("X");
                    } else if (i > altura / 2 && j == 2) {
                        System.out.print("X");
                    } else if (i < altura / 2 && (j == 2 || j == 0)) {
                        System.out.print("X");
                    } else {
                        System.out.print(" ");
                    }
                    System.out.print(" ");
                }
                break;
            case 0:
                for (int j = 0; j < 3; j++) {
                    if (i == 0 || i == altura - 1) {
                        System.out.print("X");
                    } else if (j == 0 || j == 2) {
                        System.out.print("X");
                    } else {
                        System.out.print(" ");
                    }
                    System.out.print(" ");
                }
                break;
        }
    }

    public static void main(String[] args) {
        int altura;
        int numero;
        int digito1;
        int longitud ;
        
       
        Scanner sc = new Scanner(System.in);
        System.out.print("introduce altura; ");
        altura = sc.nextInt();

        System.out.print("introduce un número entero de dos cifras máximo; ");
        numero = sc.nextInt();
        longitud = longitudDigito(numero);

        if (numero <= 100 || numero > 0) {
            digito1 = numero % 10;
            
            for (int x = 0; x <= longitud; x++) {
                for (int i = 0; i < altura; i++) {

                    Num1(digito1, altura, i);
                    System.out.print(" ");
                    System.out.println();

                }
                numero = numero/10 ;
                digito1 = numero%10 ;
            }
        } else {
            System.out.println("Introduce un número");
        }

    }
}
// 67 minimi while