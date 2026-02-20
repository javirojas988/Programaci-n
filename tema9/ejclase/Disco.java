package tema9.ejclase;
/* Clase disco con atributo codigo , titulo , artista ,genero , duracion 
constructor
getter y setter 
metodo tostring que muestre innformacacion de */
public class Disco {
    private String codigo ; 
    private String titulo; 
    private String artista ; 
    private String genero ; 
    private int duracion ;

    public Disco (String codigo , String titulo , String artista , String genero , int duracion){
        this.codigo = codigo ; 
        this.titulo = titulo ; 
        this.artista = artista ; 
        this.genero = genero ; 
        this.duracion = duracion ; 
    }
    public String getCodigo(){
        return codigo ; 
    }
    public void setCodigo(String codigo){
        this.codigo = codigo ; 
    }

}
