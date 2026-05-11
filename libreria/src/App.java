/**
 * Programación
 * Modelo Vista Controlador
 * @author Antonio J. Sánchez
 */

import java.sql.SQLException;

import controladores.FrontController;


public class App {

    public static void main(String[] args) throws Exception {

        int opcion ;
        
        try {

            // creamos el CONTROLADOR FRONTAL
            FrontController controlador = new FrontController() ;

             do {

                menu()  ;   // mostramos el menú
                opcion = Integer.parseInt(System.console().readLine()) ;
                controlador.despachar(opcion) ;
                
                //
                pausa() ;

            } while(opcion!=0) ;

        } catch (SQLException sqle) {
            System.out.println("Se ha producido un error con la base de datos.\n" + sqle.getMessage());
        } catch (NumberFormatException nfe) {
            System.out.println("Se ha producido un error en la inserción de datos.\n" + nfe.getMessage());
        }
    }

    /**
     */
    private static void pausa() {
        System.out.println("\nPULSA ENTER PARA CONTINUAR....");
        System.console().readLine() ;
    }

    /**
     */
    private static void menu() {

        System.out.println("\033[H\033[2J") ;
        System.out.println("LIBRERIA V 2.0\n===========================================") ;
        System.out.println("1. Listar libros") ;
        System.out.println("2. Añadir nuevo libro") ;
        System.out.println("3. Buscar libro") ;
        System.out.println("4. Editar libro") ;
        System.out.println("5. Borrar libro") ;
        System.out.println("") ;
        System.out.println("6. Listar autores") ;
        System.out.println("0. Salir") ;
        System.out.print("Opcion? ") ;
    }


  /*

    private static void editarLibro(Connection conexion) throws SQLException {

        String isbn ;

        String titulo ;
        String autor ;
        String argumento ;
        String paginas ;

        HashMap<String, String> parametros = new HashMap<>() ;

        // preguntamos por el libro a borrar
        System.out.print("ISBN (en blanco para volver): ") ;
        isbn = System.console().readLine() ;

        if (!isbn.isEmpty()) {

            // preguntamos datos del libro a editar
            System.out.print("Título (en blanco para no editarlo): ") ;
            titulo = System.console().readLine() ;
            if (!titulo.isEmpty()) { parametros.put("titulo = ?", titulo) ; }            

            System.out.print("Autor (en blanco para no editarlo): ") ;
            autor = System.console().readLine() ;
            if (!autor.isEmpty()) { parametros.put("autor = ?", autor) ; }

            System.out.print("Argumento (en blanco para no editarlo): ") ;
            argumento = System.console().readLine() ;
            if (!argumento.isEmpty()) { parametros.put("argumento = ?", argumento) ; }

            System.out.print("Páginas (en blanco para no editarlo): ") ;
            paginas = System.console().readLine() ;
            if (!paginas.isEmpty()) { parametros.put("paginas = ?", paginas) ; }            

            // construimos la consulta SQL            
            String sql = "UPDATE libro SET " + String.join(",", parametros.keySet()) + " WHERE isbn = ? ; ";        
            PreparedStatement stmt = conexion.prepareStatement(sql) ;

            // vinculamos los parámetros a los marcadores
            int posicion = 1 ;
            for(String valor: parametros.values()) { stmt.setString( posicion++, valor ) ; }
            stmt.setString(posicion, isbn);

            // lanzamos la consulta
            int librosActualizados = stmt.executeUpdate() ;

             // mostramos mensaje 
            if (librosActualizados == 0) {
                System.out.printf("No se ha encontrado el libro con ISBN %s\n", isbn);
            } else {
                System.out.printf("Se ha actualizado correctamente el libro con ISBN %s\n", isbn);                
            }

            stmt.close() ;


        }
    }*/


}
