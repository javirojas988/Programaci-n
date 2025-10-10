package tema3;

public class Variables {
    public static void main(String[] args) {
        String nombre ;
        System.out.println("como te llamas ?");
        nombre = System.console().readLine() ;
        System.out.println("hola " + nombre + " , encantado de conocerte") ;
}
}