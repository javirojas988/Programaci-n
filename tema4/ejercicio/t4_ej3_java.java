package tema4.ejercicio;

public class t4_ej3_java {
    public static void main(String[] args) {
        float nota ; 
        System.out.println("nota?");
        nota= Float.parseFloat(System.console().readLine());
        
        if ((nota>=0) && (nota<=10)) {
            System.out.println((nota >=5 )?"aprobao"  : " supenso");
        }
        else {
            System.out.println("mal");
        }
    }
    
}
