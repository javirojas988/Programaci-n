/**
 * Programación 
 * Modelo Vista Controlador
 * POJO|Entidad LIBRO (forma parte del modelo Libro)
 * 
 * @author Antonio J. Sánchez
 */

package modelos;

public class Libro {
    
    private String isbn ;
    private String titulo ;
    private String autor ;
    private String argumento ;
    private int paginas ;

    /**
     * @param isbn
     * @param titulo
     * @param autor
     * @param argumento
     * @param paginas
     */
    public Libro(String isbn, String titulo, String autor, String argumento, int paginas) {
        this.isbn = isbn ;
        this.titulo = titulo ;
        this.autor = autor ;
        this.argumento = argumento ;
        this.paginas = paginas ;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public String getArgumento() {
        return argumento;
    }

    /**
     */
    @Override
    public String toString() {       
        return String.format("%s - %s, %s", this.isbn, this.titulo, this.autor) ;
    }
}
