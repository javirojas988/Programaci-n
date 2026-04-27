import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
                        aniadirEquipo(conexion);
                        System.console().readLine("enter para salir");
                        break;
                    case 3:
                        buscarEquipo(conexion);
                        System.console().readLine("enter para salir");
                        break;
                    case 4:
                        editarEquipo(conexion);
                        System.console().readLine("enter para salir");
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
        System.out.println("2. Añadir equipo");
        System.out.println("3. Buscar equipo");
        System.out.println("4. Editar equipo");
        System.out.println("5. Borrar equipo");
        System.out.println("0. Salir");
        System.out.print("Opcion? ");
    }

    // ==========
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

    public static void borrarEquipo(Connection conexion) throws SQLException {
        int decision;

        try {
            System.out.print("Selecciona el equipo que quieras borrar: ");
            Scanner sc = new Scanner(System.in);
            decision = sc.nextInt();
            //
            String sql = "DELETE FROM equipo WHERE codigo ? ";
            PreparedStatement stmt = conexion.prepareStatement(sql);
            stmt.setString(1, sql);
            int filas = stmt.executeUpdate();
            if (filas > 0) {
                System.out.printf("Se elimino equipo con codigo");
            } else {
                System.out.printf("No se encontro");
            }

            System.out.println("");

        } catch (Exception e) {

        }

    }

    // =================
    // MIRARSELO
    // =================
    public static void buscarEquipo(Connection conexion) {
        int codigo;
        String nombre;
        try {
            // =
            String sql = "SELECT * FROM libro WHERE codigo = ? ;";
            PreparedStatement stmt = conexion.prepareStatement(sql);

            // remplaza interrogacion con el valor sql , 1 es la poscion de ?
            stmt.setString(1, sql);

            // lamzamos la consulta
            // la variable resultado; Utilizando resultado siempre tendra un objeto tipo
            // resultSet
            // -tendra un objeto de tipo resultSet si se encuentra el registro en la vd
            // -Tendra un objeto de tipo resultset si no encunetra el registro en el bd
            ResultSet resultado = stmt.executeQuery();

            /*
             * if ( resultado.next()){
             * Public Equipo equipo throws SQLException{
             * return new Equipo(resultado.getInt("codigo"),
             * resultado.getString("nombre"));
             * }
             * }
             */

        } catch (Exception e) {
            System.out.println("error ");
        }

    }

    // =================
    // MIRARSELA
    // =================
    public static void editarEquipo(Connection conexion) throws SQLException {

        int cod;
        String nombre;
        System.out.print("Introduce Codigo del equipo a editar");
        cod = Integer.parseInt(System.console().readLine());
        System.out.println(
                "Ahora mete el nombre que quieras poner (deja este apartado en blanco para no realizar modificaciones");
        nombre = System.console().readLine();

        // constuir SQL
        String sql = "UPDATE equipo SET ";
        if (!nombre.isEmpty()) {
            sql += "titulo = ? ;";
        }

        PreparedStatement stmt = conexion.prepareStatement(sql);
        int equipoActu = stmt.executeUpdate();

        if (equipoActu == 0) {
            System.out.println("No se a encontra el equipo con ese código");
        } else {
            System.out.println("Actualizado");
        }
    }

    /**
     *  
     */
    public static void aniadirEquipo(Connection conexion) throws SQLException {
        String nombre;

        try {
            String sql = "INSERT INTO equipo(nombre) VALUES (?);";
            System.out.print("==============\nIntroduce el nombre:");
            nombre = System.console().readLine();
            PreparedStatement stmt = conexion.prepareStatement(sql);
            stmt.setString(1, nombre);
            int filas = stmt.executeUpdate(sql);
            if (filas != 0) {
                System.out.println("Se añadio");
            } else {
                System.out.println("No se pudo añadir");
            }
            // listaEquipo(conexion);
        } catch (SQLException e) {
            System.out.println("===========\nerror try cax\n===========");
            System.out.println(e.getMessage());
        }

    }
}
