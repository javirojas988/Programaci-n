package tema7;
public class Lospapus {

    public static void piramide(int altura) {

        for (int i = 0; i <= altura; i++) {
            for (int j = altura; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("introduzca altura ");
        int altura = Integer.parseInt(System.console().readLine());
        piramide(altura );
    }
}
