/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.sawp.android.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author HugoAlejandro
 */
public class Conexion {
    
   
    private Connection con;
    private final String driver = "com.mysql.cj.jdbc.Driver";
    private final String usuario = "hmartinez";
    private final String contrasena = "*haml1404*";
    private final String urlBaseDatos = "jdbc:mysql://localhost:3306/nexubd?serverTimezone=UTC";
    
    private static Conexion conexion;
    
    private Conexion(){
        
    }
    
    public static Conexion getInstance() throws SQLException{
        if (conexion == null) {
            conexion = new Conexion();
        }
        conexion.conectar();
        return conexion;
    }
    
    private void conectar() throws SQLException{
        if (con == null || con.isClosed()) {
            try {
                Class.forName(driver);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
            con = DriverManager.getConnection(urlBaseDatos, usuario, contrasena);
        }
    }
    
    public boolean existeConexion() throws SQLException{
        return con != null && !con.isClosed();
    }

    public Connection getCon() {
        return con;
    }
    
    
    
}
