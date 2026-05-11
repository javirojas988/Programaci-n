package controladores;

import java.sql.SQLException;
import java.util.ArrayList;

import modelos.Autor;
import modelos.AutorDAO;
import vistas.AutorView;

public class AutorController {

    private AutorDAO dao ;
    private AutorView vista ;
    
    /**
     * @throws SQLException
     */
    public AutorController() throws SQLException {

        // creamos el DAO
        this.dao = new AutorDAO() ;

        // creamos la VISTA
        this.vista = new AutorView() ;
    }

    /**
     * @throws SQLException
     */
    public void listarAutores() throws SQLException {
        
        // solicitamos al modelo el listado de autores
        ArrayList<Autor> datos = dao.seleccionarTodos() ;

        // invocamos a la vista y le pasamos los datos de los autores
        vista.mostrarAutores(datos) ;
    }
    
}
