/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Corrida;
import java.sql.Date;
import java.sql.ResultSet;
/**
 *
 * @author mp.aguilar
 */
public class BDCorrida {
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
   static final String URL_BD = "jdbc:mysql://localhost:3306/gfajava";
   static final String USUARIO = "root";
   static final String PASS = "root";
   
   public static Corrida buscarCorrida(int id)
           throws ClassNotFoundException, SQLException{
       Class.forName(JDBC_DRIVER);
       Connection conexion = DriverManager.getConnection(URL_BD,USUARIO,PASS);
       Statement st = conexion.createStatement();
       String consulta = String.format("SELECT * FROM corridas WHERE id = %d",id);
       ResultSet response= st.executeQuery(consulta);
       Corrida corrida = new Corrida();
       
       if (response.next())
       { corrida.setId(response.getInt("id"));
         corrida.setOrigen(response.getString("origen"));
         corrida.setDestino(response.getString("destino"));
         corrida.setFechaInicio(response.getString("fechaSalida"));
         corrida.setFechaFin(response.getString("fechaLlegada"));
         corrida.setHoraLlegada(response.getString("horaLlegada"));
         corrida.setHoraSalida(response.getString("horaSalida"));
         corrida.setEscalas(response.getInt("escalas"));         
       }
       
      response.close();
      st.close();
      conexion.close();
      return corrida; 
   }
   
   public static boolean insertarCorrida(Corrida corrida)
           throws ClassNotFoundException,SQLException
   {
      Class.forName(JDBC_DRIVER);
      Connection conexion = DriverManager.getConnection(URL_BD, USUARIO, PASS);
      Statement st = conexion.createStatement();
      String consulta = String.format("INSERT INTO corridas(origen, "+
              "destino,fechaSalida,fechaLlegada,horaSalida,horaLlegada,escalas) "+
              " VALUES ('%s','%s','%s','%s','%s','%s','%d')",corrida.getOrigen(),
              corrida.getDestino(),corrida.getFechaInicio(),
              corrida.getFechaFin(),corrida.getHoraSalida(),
              corrida.getHoraLlegada(),corrida.getEscalas());
      
      int respuesta = st.executeUpdate(consulta);
      
      st.close();
      conexion.close();
      return respuesta == 1;
   }
}
