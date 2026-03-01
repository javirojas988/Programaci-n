package clases;
// una línea está definida por dos puntos
public class Linea {
    private Punto punto1; 
    private Punto punto2; 

    public Linea (Punto punto1 , Punto punto2 ) {
        this.punto1 = punto1;
        this.punto2 = punto2;
    }
    
    @Override
    public String toString() {
        return ("linea formada por "+ punto1 + " y " + punto2 );
        
    }
}
