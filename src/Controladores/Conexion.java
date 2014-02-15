/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

/*

   
*/



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


/*
    CLASE CONEXION
    Esta clase sirve para realizar la conexion a la base de datos
    con la que trabaja el sistema

*/

public class Conexion {
    private Connection ct;
    private Statement st;  
    private final static String driver = "com.mysql.jdbc.Driver";
    private final static String db = "jdbc:mysql://localhost:3306/codice";
    private String mensaje;
    private boolean conectado;
    
    
    public Conexion(){
        try{
            Class.forName(driver).newInstance();
            ct = DriverManager.getConnection(db, "root", "");
            st = ct.createStatement();
            conectado = true;
            
        } catch (ClassNotFoundException e) {
            mensaje = e.getMessage();
            JOptionPane.showMessageDialog(null, e);
        } catch (InstantiationException e) {
            mensaje = e.getMessage();
            JOptionPane.showMessageDialog(null, e);
        } catch (IllegalAccessException e) {
            mensaje = e.getMessage();
            JOptionPane.showMessageDialog(null, e);
        } catch (SQLException e) {
            mensaje = e.getMessage();
            JOptionPane.showMessageDialog(null, e);
        } 
    }
    
    public boolean getConectado(){
        return this.conectado;
    }
    public String getMensaje(){
        return this.mensaje;
    }
    
    public Statement getSt(){
        return st;
    }
    
    public void CerrarConexion(){
        try {
            ct.close();
        } catch (SQLException ex) { 
        }
        
    }
    
    
    
}
