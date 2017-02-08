package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Corridas;
import java.sql.Date;
import java.sql.ResultSet;
/**
 *
 * @author mp.aguilar
 */
public class CorridasBD {
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
   static final String URL_BD = "jdbc:mysql://localhost:3306/gfajava";
   static final String USUARIO = "root";
   static final String PASS = "root";
   
   public static Corridas consultarCorridas(int id)
           throws ClassNotFoundException, SQLException{
       Class.forName(JDBC_DRIVER);
       Connection conexion = DriverManager.getConnection(URL_BD,USUARIO,PASS);
       Statement st = conexion.createStatement();
       String consulta = String.format("SELECT * FROM corridas");
       ResultSet response= st.executeQuery(consulta);
       Corridas corrida = new Corridas();
       
       if (response.next())
       { corrida.setid_corrida(response.getInt("id"));
         corrida.setOrigen(response.getString("origen"));
         corrida.setDestino(response.getString("destino"));
         corrida.setFechaSalida(response.getString("fechaSalida"));
         corrida.setFechaLlegada(response.getString("fechaLlegada"));
         corrida.setHoraLlegada(response.getString("horaLlegada"));
         corrida.setHoraSalida(response.getString("horaSalida"));
         corrida.setEscalas(response.getInt("escalas"));         
       }
       
      response.close();
      st.close();
      conexion.close();
      return corrida; 
   }
   
   public static Corridas buscarCorrida(int id)
           throws ClassNotFoundException, SQLException{
       Class.forName(JDBC_DRIVER);
       Connection conexion = DriverManager.getConnection(URL_BD,USUARIO,PASS);
       Statement st = conexion.createStatement();
       String consulta = String.format("SELECT * FROM corridas WHERE id = %d",id);
       ResultSet response= st.executeQuery(consulta);
       Corridas corrida = new Corridas();
       
       if (response.next())
       { corrida.setid_corrida(response.getInt("id"));
         corrida.setOrigen(response.getString("origen"));
         corrida.setDestino(response.getString("destino"));
         corrida.setFechaSalida(response.getString("fechaSalida"));
         corrida.setFechaLlegada(response.getString("fechaLlegada"));
         corrida.setHoraLlegada(response.getString("horaLlegada"));
         corrida.setHoraSalida(response.getString("horaSalida"));
         corrida.setEscalas(response.getInt("escalas"));         
       }
       
      response.close();
      st.close();
      conexion.close();
      return corrida; 
   }
   
   public static boolean insertarCorrida(Corridas corrida)
           throws ClassNotFoundException,SQLException
   {
      Class.forName(JDBC_DRIVER);
      Connection conexion = DriverManager.getConnection(URL_BD, USUARIO, PASS);
      Statement st = conexion.createStatement();
      String consulta = String.format("INSERT INTO corridas(origen, "+
              "destino,fechaSalida,fechaLlegada,horaSalida,horaLlegada,escalas) "+
              " VALUES ('%s','%s','%s','%s','%s','%s','%d')",corrida.getOrigen(),
              corrida.getDestino(),corrida.getFechaSalida(),
              corrida.getFechaLlegada(),corrida.getHoraSalida(),
              corrida.getHoraLlegada(),corrida.getEscalas());
      
      int respuesta = st.executeUpdate(consulta);
      
      st.close();
      conexion.close();
      return respuesta == 1;
   }
}
