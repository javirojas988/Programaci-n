/**
 * Programación
 * Modelo Vista Controlador
 * Objeto de Acceso a Datos (DAO) para la entidad LIBRO (forma parte del modelo Libro)
 * @author Antonio J. Sánchez
 */

package modelos;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.cj.xdevapi.Result;

import clases.BDConexion;

public class LibroDAO {

    private Connection conexion ;

    /**
     */
    public LibroDAO() {
        this.conexion = BDConexion.conectar().bd() ;
    }

    /**
     * @return
     * @throws SQLException
     */
    public ArrayList<Libro> selecionarTodos() throws SQLException {

        ArrayList<Libro> datos = new ArrayList<>() ;

        String sql = "SELECT L.*, A.nombre AS autor FROM libro L JOIN autor A ON (L.idAutor = A.id) ;" ;
        Statement stmt = conexion.createStatement() ;

        // lanzamos la consulta
        ResultSet resultado = stmt.executeQuery(sql) ;
        
        // mostramos el resultado (si lo hay)
        while(resultado.next()) {
            datos.add( mapearLibro(resultado) ) ;
        }

        resultado.close() ;

        return datos ;
    }

    /**
     * @param libro
     * @return
     * @throws SQLException
     */
    public boolean insertar(Libro libro) throws SQLException {
        
        // 1. creamos la sentencia preparada (porque depende de información proporcionada por el usuario)
        String sql = "INSERT INTO libro (idAutor,isbn,titulo,paginas,argumento) VALUES (?, ?, ?, ?) ;" ;
        PreparedStatement pstmt = conexion.prepareStatement(sql) ;

        // 2. vincular los datos del libro con los marcadores de posición (?)
        //pstmt.setString(1, libro.getIsbn()) ;
        pstmt.setString(2, libro.getIsbn()) ;
        pstmt.setString(3, libro.getTitulo()) ;
        //pstmt.setString(3, libro.getAutor()) ;
        pstmt.setInt(4, libro.getPaginas()) ;
        pstmt.setString(5, libro.getArgumento()) 


        // 3. ejecutamos la sentencia
        int resultado = pstmt.executeUpdate() ;

        // 4. cerramos la consulta
        pstmt.close();
        
        return resultado > 0 ;
    }

    /**
     * @param isbn
     * @return
     * @throws SQLException
     */
    public Libro buscarPorISBN(String isbn) throws SQLException {

        Libro libro = null ;
        String sql = "SELECT * FROM libro WHERE isbn = ? ; " ;
        PreparedStatement pstmt = conexion.prepareStatement(sql) ;

        // 2. vincular los datos del libro con los marcadores de posición (?)
        pstmt.setString(1, isbn) ;

        // 3. ejecutamos la sentencia
        ResultSet resultado = pstmt.executeQuery() ;

        if (resultado.next()) {
            // 4. mapeamos el registro de la base de datos en un objeto JAVA
            libro = mapearLibro(resultado) ;
        }

        return libro ;

    }

    /**
     * @param isbn
     * @return
     * @throws SQLException
     */
    public boolean borrar(String isbn) throws SQLException {

        String sql = "DELETE FROM libro WHERE isbn = ? ;" ;
        PreparedStatement pstmt = conexion.prepareStatement(sql) ;

        // 2. vincular los datos del libro con los marcadores de posición (?)
        pstmt.setString(1, isbn) ;

        // 3. ejecutamos la sentencia
        int resultado = pstmt.executeUpdate() ;

        // 4. cerramos la sentencia
        pstmt.close();

        return resultado > 0 ;

    }


    /**
     * @param datos
     * @return
     * @throws SQLException
     */
    private static Libro mapearLibro(ResultSet datos) throws SQLException {
        return new Libro( datos.getString("isbn"),
                          datos.getString("titulo"),
                          datos.getString("autor"),
                          datos.getString("argumento"),
                          datos.getInt("paginas") ) ;
    }
     
}
