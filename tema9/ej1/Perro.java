public class Perro extends Animal {
    private String raza ; 

    public Perro (String nombre){
        super(nombre);
    }
    
    void ladra(){
        System.out.println("guau");
    }
}
