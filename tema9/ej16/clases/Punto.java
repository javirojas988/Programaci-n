package clases;
//De un punto se tienen que saber sus coordenadas x e y
public class Punto {
    private int x ; 
    private int y ;

    public Punto ( int x , int y ){
        this.x = x ; 
        this.y = y ; 
    }

    @Override
    public String toString() {
        return ("("+ x + "," +  y + ")" );

    }
    
}
