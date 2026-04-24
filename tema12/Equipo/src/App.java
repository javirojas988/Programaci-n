import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class App {

    private static final String URI = "jdbc:mysql://localhost:3306/Proyecto?characterEncoding=UTF-8";
    private static final String USER = "root";
    private static final String PASS = "root";

    public static void main(String[] args) throws Exception {

        int opcion;
        Connection conexion;

        try {

            // conectamos con la base de datos
            conexion = DriverManager.getConnection(URI, USER, PASS);

            do {

                menu(); // mostramos el menú
                opcion = Integer.parseInt(System.console().readLine());

                //
                switch (opcion) {
                    case 1:
                        listaEquipo(conexion);
                        System.console().readLine("enter para salir");
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        borrarEquipo(conexion);
                        System.console().readLine("enter para salir");
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("**ERROR: opción incorrecta.");
                }

            } while (opcion != 0);

            // cerramos la conexión
            conexion.close();

        } catch (SQLException sqle) {
            System.out.println("Se ha producido un error con la base de datos.");
        }

    }

    /**
     */
    private static void menu() {

        System.out.println("\033[H\033[2J");
        System.out.println("Equipos Inazuma\n================================");
        System.out.println("1. Listar Equipos");
        System.out.println("2. Añadir nuevo nuevo");
        System.out.println("3. Buscar equipo");
        System.out.println("4. Editar equipo");
        System.out.println("5. Borrar equipo");
        System.out.println("0. Salir");
        System.out.print("Opcion? ");
    }

    public static void listaEquipo(Connection conexion) {
        String nombre;
        int codigo;

        // CONSULTA
        String sql = "SELECT * FROM equipo ;";

        try {
            Statement stmt = conexion.createStatement();
            ResultSet resultado = stmt.executeQuery(sql);
            while (resultado.next()) {
                codigo = resultado.getInt("codigo");
                nombre = resultado.getString("nombre");
                System.out.println("| codigo: " + codigo + " | nombre: " + nombre);
            }

            resultado.close();
            stmt.close();

        } catch (SQLException e) {
            System.out.println("error con la consulta");
        }
    }

    public static void borrarEquipo(Connection conexion) {
        int decision;

        try {
            System.out.print("Selecciona el equipo que quieras borrar: ");
            Scanner sc = new Scanner(System.in);
            decision = sc.nextInt();
            // METER IF de chekear si codigo existe y hacerlo , con Select deberia poder
            String sql = "DELETE FROM equipo WHERE codigo=" + decision;
            Statement stmt = conexion.createStatement();
            stmt.execute(sql);
            System.out.println("\nBorrado con exito. ");
            listaEquipo(conexion);
            System.out.println("");

        } catch (Exception e) {

        }

    }

}
