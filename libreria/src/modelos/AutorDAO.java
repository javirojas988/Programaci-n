package modelos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import clases.BDConexion;

public class AutorDAO {

    private Connection conexion ;

    /**
     */
    public AutorDAO()  {
        this.conexion = BDConexion.conectar().bd() ;        
    }

    /**
     * @return
     * @throws SQLException
     */
    public ArrayList<Autor> seleccionarTodos() throws SQLException {

        ArrayList<Autor> datos = new ArrayList<>() ;

        String sql = "SELECT * FROM autor ;" ;
        Statement stmt = conexion.createStatement() ;

        ResultSet resultado = stmt.executeQuery(sql) ;

        while (resultado.next()) {
            datos.add( mapearAutor(resultado) ) ;
        }

        resultado.close() ;

        return datos ;

    }

    /**
     * @param datos
     * @return
     * @throws SQLException
     */
    private static Autor mapearAutor(ResultSet datos) throws SQLException {
        return new Autor( datos.getString("nombre") ) ;

    }
    
}
