package controladores ;

import java.sql.SQLException;

public class FrontController {

    private LibroController libroController ;
    private AutorController autorController ;

    /**
     * Instanciamos cada uno de los controladores que pueda
     * manejar o con los que se pueda comunicar el controlador
     * frontal.
     * @throws SQLException
     */
    public FrontController() throws SQLException {
        this.libroController = new LibroController() ;
        this.autorController = new AutorController() ;
    }

    /**
     * @param opcion
     */
    public void despachar(int opcion) throws SQLException {

         switch(opcion) {
            case 1:                 
                libroController.listarLibros(); 
                break ;
            case 2:                
                libroController.insertarLibro() ;                        
                break ;

            case 3:                         
                libroController.buscarLibro() ;
                break ;
            case 4: 
                System.out.println("\nEDITAR LIBRO\n==================================================================");
                //editarLibro(conexion);
                break ;

            case 5:                         
                libroController.borrarLibro() ;
                break ;

            case 6:
                autorController.listarAutores() ;
                break ;

            case 0: break ;
            default: 
                System.out.println("**ERROR: opción incorrecta.");
        }

    }


}