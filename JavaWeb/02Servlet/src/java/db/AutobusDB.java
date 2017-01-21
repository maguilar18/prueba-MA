/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Autobus;

/**
 *
 * @author mp.aguilar
 */
public class AutobusDB {
   private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver"; //la palabra final significa que la variable nunca va a cambiar  
   private static final String DB_URL = "jdbc:mysql://localhost:3306/gfajava";
   private static final String USER = "root";
   private static final String PASS = "root";
   
   public int registrarAutobus(Autobus autobus) throws ClassNotFoundException,
       SQLException
       {                        
         Class.forName(JDBC_DRIVER); 
         Connection conexion = DriverManager.getConnection(DB_URL,USER,PASS);
         Statement consulta = conexion.createStatement();
         String query = String.format("INSERT INTO autobus(NUM_AUTOBUS,SIGLAS,MODELO,CAPACIDAD,BASE) values ('%d','%s','%d','%d','%s')",
         autobus.getNum_autobus(),autobus.getSiglas(),autobus.getModelo(),autobus.getCapacidad(),autobus.getBase());
         
         int res = consulta.executeUpdate(query);
         consulta.close();
         conexion.close();        
         
         return res;
       }
   
   
   public List<Autobus> getAutobuses() 
           throws ClassNotFoundException,
           SQLException{                
         Class.forName(JDBC_DRIVER); 
         Connection conexion = DriverManager.getConnection(DB_URL,USER,PASS);
         Statement consulta = conexion.createStatement();
         ResultSet resultado = consulta.executeQuery("SELECT * FROM autobus");
         
         ArrayList<Autobus> lista = new ArrayList<>();        
         
         while (resultado.next()){
             /*int num_autobus = resultado.getInt("num_autobus");
             String siglas = resultado.getString("siglas");
             int modelo = resultado.getInt("modelo");
             String base = resultado.getString("base");*/
             Autobus autobus = new Autobus();
             
             autobus.setNum_autobus(resultado.getInt("num_autobus"));
             autobus.setSiglas(resultado.getString("siglas"));
             autobus.setModelo(resultado.getInt("modelo"));
             autobus.setCapacidad(resultado.getInt("capacidad"));
             autobus.setBase(resultado.getString("base"));
             
             lista.add(autobus);             
         }
         
         resultado.close();
         consulta.close();
         conexion.close();
         return lista;
   }   
}
