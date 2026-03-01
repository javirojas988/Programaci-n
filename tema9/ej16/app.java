import clases.Linea;
import clases.Punto;

public class app {

    public static void main(String[] args) {
        Punto punto = new Punto(1, 0);
        Punto punto2 = new Punto(2, 0);
        Linea linea1 = new Linea(punto, punto2);
        System.out.println(linea1);
    }
}