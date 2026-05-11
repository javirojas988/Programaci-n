/**
 * Programación
 * Modelo Vista Controlador
 * Controlador LIBROCONTROLLER
 * @author Antonio J. Sánchez
 */

package controladores;

import java.sql.SQLException;
import java.util.ArrayList;

import modelos.Libro;
import modelos.LibroDAO;
import vistas.LibroView;

public class LibroController {

    private LibroDAO dao ;
    private LibroView vista ;

    /**
     */
    public LibroController() throws SQLException {    
        
        // creamos el DAO (Objeto de Acceso a Datos) para el modelo LIBRO
        this.dao = new LibroDAO() ;

        // creamos la VISTA para el controlador LIBROCONTROLLER
        this.vista = new LibroView() ;        
    }

    /**
     * Listado de libros
     * @throws SQLException
     */
    public void listarLibros() throws SQLException {
        
        // 1. solicitamos al DAO información sobre libros
        ArrayList<Libro> datos = dao.selecionarTodos() ;

        // 2. Una vez tenemos todos los libros
        vista.mostrarLibros(datos) ;
        
    }

    /**
     * @throws SQLException
     */
    public void insertarLibro() throws SQLException {

        // 1. mostramos VISTA solicitud información
        Libro libro = vista.solicitarLibro() ;

        // 2. comprobar si hay un libro disponible para insertar
        if (libro!=null) {
            if (!dao.insertar(libro)) {
                vista.mostrarMensaje("**ERROR: El libro no se ha insertado correctamente en la base de datos.") ;
            }
        }
    }

    /**
     * @throws SQLException
     */
    public void buscarLibro() throws SQLException {

        // 1. solicta a la VISTA información sobre el ISBN
        String isbn = vista.solicitarISBN() ;

        // 2. comprobamos que no sea blanco el ISBN
        if (!isbn.isEmpty()) {

            // 3. Solicitamos al DAO buscar el libro
            Libro libro = dao.buscarPorISBN(isbn) ;

            if (libro==null) {
                vista.mostrarMensaje("**ERROR: el libro no se ha encontrado en la base de datos.") ;
            } else {
                vista.mostrarMensaje(libro.toString()) ;
            }
        }
    }

    /**
     * @throws SQLException
     */
    public void borrarLibro() throws SQLException {

        // 1. solicta a la VISTA información sobre el ISBN
        String isbn = vista.solicitarISBN() ;

        // 2. comprobamos que no sea blanco el ISBN
        if (!isbn.isEmpty()) {

            // 3. Solicitamos al DAO borrar el libro
            if (dao.borrar(isbn)) {
                vista.mostrarMensaje("El libro se ha borrado correctamente.") ;
            } else {                
                vista.mostrarMensaje("**ERROR: el libro no se ha encontrado en la base de datos.") ;
            } 
        }

    }
    
}
