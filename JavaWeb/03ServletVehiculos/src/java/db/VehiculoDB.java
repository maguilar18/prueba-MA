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
import model.Vehiculo;
import model.Automovil;
import model.Camioneta;
import model.Motocicleta;
import model.Trailer;

/**
 *
 * @author mp.aguilar
 */
public class VehiculoDB {
   private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver"; //la palabra final significa que la variable nunca va a cambiar  
   private static final String DB_URL = "jdbc:mysql://localhost:3306/gfajava";
   private static final String USER = "root";
   private static final String PASS = "root";
   
   public int registrarVehiculo(Vehiculo vehiculo) throws ClassNotFoundException,
       SQLException
       {                        
         Class.forName(JDBC_DRIVER); 
         Connection conexion = DriverManager.getConnection(DB_URL,USER,PASS);
         Statement consulta = conexion.createStatement();
         String query = String.format("INSERT INTO vehiculo(id,puertas,color,quemacocos) values ('%d','%d','%s','%b')",
         vehiculo.getId(),vehiculo.getPuertas(),vehiculo.getColor(),vehiculo.isQuemacocos());
         
         int res = consulta.executeUpdate(query);
         consulta.close();
         conexion.close();        
         
         return res;
       }
   
   
   public List<Vehiculo> getVehiculos() 
           throws ClassNotFoundException,
           SQLException{                
         Class.forName(JDBC_DRIVER); 
         Connection conexion = DriverManager.getConnection(DB_URL,USER,PASS);
         Statement consulta = conexion.createStatement();
         ResultSet resultado = consulta.executeQuery("SELECT * FROM vehiculo");
         
         ArrayList<Vehiculo> lista = new ArrayList<>();        
         
         while (resultado.next()){             
             Vehiculo ve = new Vehiculo(0,0,"",false);
             
             ve.setId(resultado.getInt("id"));
             ve.setColor(resultado.getString("color"));             
             ve.setPuertas(resultado.getInt("puertas"));
             ve.setQuemacocos(resultado.getBoolean("quemacocos"));          
             
             lista.add(ve);             
         }
         
         resultado.close();
         consulta.close();
         conexion.close();
         return lista;
   }   
   
   public int registrarAutomovil(Automovil automovil) throws ClassNotFoundException,
       SQLException
       {                        
         Class.forName(JDBC_DRIVER); 
         Connection conexion = DriverManager.getConnection(DB_URL,USER,PASS);
         Statement consulta = conexion.createStatement();
         String query = String.format("INSERT INTO automovil(faros_niebla,tamano) values ('%b','%s')",
         automovil.getFaros_niebla(),automovil.getTamano());
         
         int res = consulta.executeUpdate(query);
         consulta.close();
         conexion.close();        
         
         return res;
       }
   
   
   public List<Automovil> getAutomovils() 
           throws ClassNotFoundException,
           SQLException{                
         Class.forName(JDBC_DRIVER); 
         Connection conexion = DriverManager.getConnection(DB_URL,USER,PASS);
         Statement consulta = conexion.createStatement();
         ResultSet resultado = consulta.executeQuery("SELECT * FROM automovil");
         
         ArrayList<Automovil> lista = new ArrayList<>();        
         
         while (resultado.next()){             
             Automovil a = new Automovil(0,0,"",false,"",0,false);
             a.setFaros_niebla(resultado.getBoolean("faros_niebla"));
             a.setTamano(resultado.getString("tamano"));             
            
             lista.add(a);             
         }
         
         resultado.close();
         consulta.close();
         conexion.close();
         return lista;
   }

public int registrarCamioneta(Camioneta camioneta) throws ClassNotFoundException,
       SQLException
       {                        
         Class.forName(JDBC_DRIVER); 
         Connection conexion = DriverManager.getConnection(DB_URL,USER,PASS);
         Statement consulta = conexion.createStatement();
         String query = String.format("INSERT INTO camioneta(carga,redilas) values ('%b','%b')",
         camioneta.isCarga(),camioneta.isRedilas());
         
         int res = consulta.executeUpdate(query);
         consulta.close();
         conexion.close();        
         
         return res;
       }
   
   
   public List<Camioneta> getcCamionetas() 
           throws ClassNotFoundException,
           SQLException{                
         Class.forName(JDBC_DRIVER); 
         Connection conexion = DriverManager.getConnection(DB_URL,USER,PASS);
         Statement consulta = conexion.createStatement();
         ResultSet resultado = consulta.executeQuery("SELECT * FROM camioneta");
         
         ArrayList<Camioneta> lista = new ArrayList<>();        
         
         while (resultado.next()){             
             Camioneta c = new Camioneta(false,false,0,0,false,"");
             c.setCarga(resultado.getBoolean("carga"));
             c.setRedilas(resultado.getBoolean("redilas"));             
            
             lista.add(c);             
         }
         
         resultado.close();
         consulta.close();
         conexion.close();
         return lista;
   }     
   
   
public int registrarTrailer(Trailer trailer) throws ClassNotFoundException,
       SQLException
       {                        
         Class.forName(JDBC_DRIVER); 
         Connection conexion = DriverManager.getConnection(DB_URL,USER,PASS);
         Statement consulta = conexion.createStatement();
         String query = String.format("INSERT INTO trailer(remolques,cantidad_llantas) values ('%d','%d')",
         trailer.getRemolques(),trailer.getCantidad_llantas());
         
         int res = consulta.executeUpdate(query);
         consulta.close();
         conexion.close();        
         
         return res;
       }
   
   
   public List<Trailer> getTrailers() 
           throws ClassNotFoundException,
           SQLException{                
         Class.forName(JDBC_DRIVER); 
         Connection conexion = DriverManager.getConnection(DB_URL,USER,PASS);
         Statement consulta = conexion.createStatement();
         ResultSet resultado = consulta.executeQuery("SELECT * FROM trailer");
         
         ArrayList<Trailer> lista = new ArrayList<>();        
         
         while (resultado.next()){             
             Trailer t = new Trailer(0,0,0,0,false,"");
             t.setCantidad_llantas(resultado.getInt("cantidad_llantas"));
             t.setRemolques(resultado.getInt("remolques"));             
            
             lista.add(t);             
         }
         
         resultado.close();
         consulta.close();
         conexion.close();
         return lista;
   }  


public int registrarMotocicleta(Motocicleta motocicleta) throws ClassNotFoundException,
       SQLException
       {                        
         Class.forName(JDBC_DRIVER); 
         Connection conexion = DriverManager.getConnection(DB_URL,USER,PASS);
         Statement consulta = conexion.createStatement();
         String query = String.format("INSERT INTO motocicleta(es_deportiva,fabricante) values ('%b,'%s')",
         motocicleta.getEs_deportiva(),motocicleta.getFabricante());
         
         int res = consulta.executeUpdate(query);
         consulta.close();
         conexion.close();        
         
         return res;
       }
   
   
   public List<Motocicleta> getList() 
           throws ClassNotFoundException,
           SQLException{                
         Class.forName(JDBC_DRIVER); 
         Connection conexion = DriverManager.getConnection(DB_URL,USER,PASS);
         Statement consulta = conexion.createStatement();
         ResultSet resultado = consulta.executeQuery("SELECT * FROM motocicleta");
         
         ArrayList<Motocicleta> lista = new ArrayList<>();        
         
         while (resultado.next()){  
             Motocicleta m = new Motocicleta(false,"",0,"",0,false);
             m.setEs_deportiva(resultado.getBoolean("es_deportiva"));
             m.setFabricante(resultado.getString("fabricante"));             
            
             lista.add(m);             
         }
         
         resultado.close();
         consulta.close();
         conexion.close();
         return lista;
   }     
}
