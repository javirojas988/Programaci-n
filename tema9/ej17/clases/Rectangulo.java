package tema9.ej17.clases;

public class Rectangulo {
    public static int rectangulosCreados = 0 ; 
    public int base ; 
    public int altura ; 
    public Rectangulo (int altura , int base ){
        this.base = base ;
        this.altura=altura;
        rectangulosCreados++;
    }
    public static int getRectangulosCreados() {
        return rectangulosCreados;
    }
}
