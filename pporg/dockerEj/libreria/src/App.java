

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
    public static void main(String[] args) throws Exception {
        
        String url = "jdbc:mysql://localhost:3306/ejemplo?characterEncoding=UTF-8" ;
        try {
            Connection conexion = DriverManager.getConnection(url,"root","root");
            System.out.println("**Se conecto");
            String isbn; 
            String titulo ;
            String autor ; 
            int paginas ; 
            String argumento ;

            //CONSULTA
            String sql = "SELECT * FROM libro ;";
            Statement stmt = conexion.createStatement() ; 

            // EJECUTAMO CONSULTa
            ResultSet resultado = stmt.executeQuery(sql) ;

            //Desplazamo el cursor al primer registro
            while ( resultado.next()){
                isbn = resultado.getString("isbn");
                titulo = resultado.getString("titulo");
                autor = resultado.getString("autor");
                paginas = resultado.getInt("paginas");
                argumento = resultado.getString("argumento");

                System.out.printf("[%s] %s - total páginas : €d\n", isbn , titulo , autor , paginas , argumento );
            }
            resultado.close();

            //SOLICITAMOS DATOS
            System.out.print("ISBN");
            isbn = System.console().readLine();
            System.out.print("titulo");
            titulo = System.console().readLine();
            System.out.print("autor");
            autor = System.console().readLine();
            System.out.print("paginas");
            paginas = Integer.parseInt(System.console().readLine());
            System.out.print("Argumento");
            argumento = System.console().readLine();

            sql = String.format("INSER INTO livro (isbn,titulo,autor,paginas,argumento VALUES('%s', '%s' , '%s' , %d , '%s') ; ", isbn , titulo , autor , paginas , argumento); //titulo etc que no e puesto arriba ; 
            //utlizamo execute para consulta select , insert , update  o delete
            // true si la consulta genera un resultset ( select);
            // false en caso de lanzar una consulta insert , update o delete
            stmt.execute(sql);

            //metodo getUpdateCount devuelve el numero de filas afectadas en una consulta insert , update , deelte
            if(stmt.getUpdateCount()==0 ){ System.out.println("**Error , inserccion no realizada");}
            else{ System.out.println("iserccion del libro exito");}
            
            //=================
            //COLSUTA PREPARADA
            PreparedStatement stmtp = conexion.prepareStatement(sql);
            stmtp.setString(0 , isbn);

            //update : actualizar el nombre de la autora
            sql = "UPDATE libro SET autor ='hueso'";
            int total = stmt.executeUpdate(sql);
            System.out.printf("Registros modificados /d\n\n", total);

            //delete . Borramo libro con isbn 0000000000003
            sql = "DELETE FROM libro WHERE isbn = '0000000000003';";
            stmt.execute(sql);

        } catch(SQLException sqle){
            System.out.println("**nanai");
        }
    }
}
