package modelos;

public class Autor {

    private int id ;
    private String nombre ;

    /**
     * @param nombre
     */
    public Autor(String nombre) {
        this.nombre = nombre ;
    }

    /**
     * @return 
     */
    @Override
    public String toString() {        
        return this.nombre ;
    }


    
}
