
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
    public static void main(String[] args) throws Exception {
        String email ; 
        String password ; 
        String sql ; 

        //1. definir la cadena de conexión o uri
        String uri = "jdbc:mysql://localhost:3306/javasql?characterEncoding=UTF-8";

        //2 establecemo la conexion con el motor de base de datos 
        try{

            Connection conexion = DriverManager.getConnection(uri,"root","root");
            System.out.printf("conexion realizada \n=================\n");
            System.out.print("email ");
            email = System.console().readLine() ; 
            System.out.print("password ");
            password = System.console().readLine() ;

            sql = "SELECT * FROM `usuario` WHERE email='"+ email + "' AND clave='" + password + "' ;" ;
            // System.out.println(sql);

            // 3. CReamos un sentencia ( Statment)
            Statement stmt = conexion.createStatement() ; 
             
            //4 Creamos un result SEt para guardar el resultado de la ejecucion de la sentencia SQL 
            ResultSet resultado = stmt.executeQuery(uri);
            //5. Comprobamos si tenmos resultado 
            if(resultado.next() == true) {
                System.out.println("Login correcto!!!!");
            } else {
                System.out.println("mal");
            };

            //close conect
            conexion.close();

        
        } catch(SQLException sqle){

            System.out.println("**Error de conexion " + sqle.getMessage());
        }
        


    }
}
