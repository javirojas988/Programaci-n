/**
 * Programación
 * Modelo Vista Controlador
 * Vista para la entidad LIBRO
 * @author Antonio J. Sánchez
 */

package vistas;

import java.util.ArrayList;

import modelos.Libro;

public class LibroView {

    /**
     * Mostramos en pantalla los libros
     * @param libros
     */
    public void mostrarLibros(ArrayList<Libro> libros) {

        System.out.println("\nLISTADO DE LIBROS\n=============================================================");
        for(Libro item: libros) {
            System.out.println(item) ;
        }
    }

    /**
     * @return
     */
    public Libro solicitarLibro() {

        String isbn ;

        String titulo ;
        String autor ;
        String argumento ;
        int paginas ;

        Libro libro = null ;

        System.out.print("ISBN (en blanco para volver): ") ;
        isbn = System.console().readLine() ;

        if (!isbn.isEmpty()) {

            // preguntamos datos del libro a insertar
            System.out.print("Título: ") ;
            titulo = System.console().readLine() ;        

            System.out.print("Autor: ") ;
            autor = System.console().readLine() ;            

            System.out.print("Argumento: ") ;
            argumento = System.console().readLine() ;            

            System.out.print("Páginas: ") ;
            paginas = Integer.parseInt(System.console().readLine()) ;

            // creamos el libro
            libro = new Libro(isbn, titulo, autor, argumento, paginas) ;

        }

        return libro ;
    }

    public String solicitarISBN() {

        String isbn ;

        System.out.println("\n=================================================================");
        System.out.print("ISBN (en blanco para volver): ") ;
        isbn = System.console().readLine() ;

        return isbn ;

    }

    /**
     * @param mensaje
     */
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje) ;
    }
    
}
