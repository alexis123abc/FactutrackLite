
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexionSQL {

    // Declaramos la conexion a mysql
    public static Connection con;

    // Declaramos los datos de conexion a la bd
    private static final String driver = "com.mysql.cj.jdbc.Driver"; // Ajuste para MySQL Connector/J 8.0+
    private static final String user = "root";
    private static final String pass = "";
    private static final String url = "jdbc:mysql://localhost:3306/bdprueba2?characterEncoding=utf8";

    // Funcion que va conectarse a mi bd de mysql
    public static Connection getConexion() {
        con = null;
        try {
            // Cargar el driver
            Class.forName(driver);
            // Establecer la conexión
            con = DriverManager.getConnection(url, user, pass);
            if (con != null) {
                System.out.println("Conexion establecida");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexión: " + e.toString());
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar el driver: " + e.toString());
        }
        return con;
    }

    // Funcion para cerrar la conexion a la bd
    public static void closeConnection() {
        try {
            if (con != null && !con.isClosed()) {
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


