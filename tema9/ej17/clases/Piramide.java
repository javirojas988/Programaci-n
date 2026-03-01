package tema9.ej17.clases;



public class Piramide {
    
    public static int piramidesCreadas = 0; 
    public int altura ; 

    public Piramide (int altura ){
        this.altura=altura;
        piramidesCreadas++;
    }
    public static int getPiramidesCreadas(){
        return piramidesCreadas; 
    }

    @Override
    public String toString() {
        return dibujarPiramide(altura);
        
    }
}
