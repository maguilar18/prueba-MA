/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author mp.aguilar
 */
public class EstadoBD {
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver"; //final significa que el valor nunca va a cambiar y es siempre constante
   static final String URL_BD = "jdbc:mysql:localhost:8889/estadosMexico";
   static final String USUARIO = "root";
   static final String PASS = "root";
       
   static public String getCapital(String estadoNombre) throws ClassNotFoundException, SQLException{
     Class.forName(JDBC_DRIVER);
     Connection conexion = DriverManager.getConnection(URL_BD, USUARIO, PASS);
     Statement st= conexion.createStatement();
     String consulta = "SELECT capital from estados WHERE nombre= '" + estadoNombre + "";
     ResultSet rs = st.executeQuery(consulta);    
     
     String capital = null;
     if (rs.next())
     {
         capital = rs.getString("capital");         
     }
     rs.close();
     st.close();
     conexion.close();      
     
     return capital;
   }
   
   static public int getPoblacion(String estadoNombre) throws ClassNotFoundException, SQLException{
     Class.forName(JDBC_DRIVER);
     Connection conexion = DriverManager.getConnection(URL_BD, USUARIO, PASS);
     Statement st= conexion.createStatement();
     String consulta = "SELECT poblacion from estados WHERE nombre= '" + estadoNombre + "";
     ResultSet rs = st.executeQuery(consulta);    
     
     int poblacion = 0;
     if (rs.next())
     {
         poblacion = rs.getInt("poblacion");         
     }
     rs.close();
     st.close();
     conexion.close();      
     
     return poblacion;
   }
}
