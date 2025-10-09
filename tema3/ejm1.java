package tema3;
 
import java.util.Scanner;
public class ejm1 {
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner  scanner = new Scanner(System.in);
        System.out.println("numero");
        num1 = scanner.nextInt();
        System.out.println("numero2");
        num2 = scanner.nextInt();
        System.out.printf("%d * %d = %d\n" , num1 , num2 , num1*num2);
    }
}
