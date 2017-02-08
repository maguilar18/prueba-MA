/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import java.sql.*;
import java.util.ArrayList;
import modelo.Corridas;

/**
 *
 * @author mp.aguilar
 */
public class CorridasBD {
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver"; //final significa que el valor nunca va a cambiar y es siempre constante
   static final String URL_BD = "jdbc:mysql://localhost:3306/gfajava";
   static final String USUARIO = "root";
   static final String PASS = "root";
   
   public static Corridas[] getCorridas() throws ClassNotFoundException,SQLException{
      Class.forName(JDBC_DRIVER);
      Connection conexion = DriverManager.getConnection(URL_BD,USUARIO,PASS);
      Statement st= conexion.createStatement();
      String consulta = "SELECT * from corridas";
      ResultSet rs= st.executeQuery(consulta);
      ArrayList<Corridas> lista = new ArrayList<Corridas>();
      
      while (rs.next()){
         lista.add(new Corridas(
         rs.getInt("id_corrida"),
         rs.getString("origen"), 
         rs.getString("destino"),
         rs.getString("fechaSalida"),
         rs.getString("fechaLlegada"),         
         rs.getString("horaSalida"),
         rs.getString("horaLlegada"),
         rs.getInt("escalas")
         ));
      }  
      
      /*rs.close();
      st.close();
      conexion.close();*/
      Corridas [] es = new Corridas[lista.size()];
      //listaEstados = lista.toArray(listaEstados);
      return lista.toArray(es);
   }
   
    public static boolean insertarCorrida(String origen,String destino, String fechaSalida, String fechaLlegada,String horaSalida, String horaLlegada, int escalas)
           throws ClassNotFoundException,SQLException
   {
      Class.forName(JDBC_DRIVER);
      Connection conexion = DriverManager.getConnection(URL_BD, USUARIO, PASS);
      Statement st = conexion.createStatement();
      String consulta = String.format("INSERT INTO corridas(origen, "+
              "destino,fechaSalida,fechaLlegada,horaSalida,horaLlegada,escalas) "+
              " VALUES ('%s','%s','%s','%s','%s','%s','%d')",origen,
              destino,fechaSalida,fechaLlegada,horaSalida,horaLlegada,escalas);
      
      int respuesta = st.executeUpdate(consulta);
      
      st.close();
      conexion.close();
      return respuesta == 1;
   }
    
   public static boolean eliminarCorrida(int id_corrida)
           throws ClassNotFoundException,SQLException
   {
      Class.forName(JDBC_DRIVER);
      Connection conexion = DriverManager.getConnection(URL_BD, USUARIO, PASS);
      Statement st = conexion.createStatement();      
      String consulta = "DELETE FROM corridas WHERE id_corrida = '" + id_corrida+ "'";
      int respuesta = st.executeUpdate(consulta);
      
      st.close();
      conexion.close();
      return respuesta == 1;
   }
 
    
}
