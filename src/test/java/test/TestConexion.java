/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import cl.sawp.android.dao.Conexion;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hugo A. Martínez Lagos  <www.sawp.cl, info@sawp.cl>
 */
public class TestConexion {
    
      public static void main(String[] args) {
        try {
            if(Conexion.getInstance().existeConexion()){
                System.out.println("Conexión establecida");
            }
        } catch (SQLException ex) {
            Logger.getLogger(TestConexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
