/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;
import bd.BDCorrida;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Time;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import modelo.Corrida;

/**
 *
 * @author mp.aguilar
 */
@Path("/")
public class CorridaWS {
    @Path("Consulta/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Corrida consulta(@PathParam("id") int id)
    {
        try{
            return BDCorrida.buscarCorrida(id);
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException e)
        {
            e.printStackTrace();
        }           
       
        return new Corrida();
    }
    
    @Path("Insertar")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    
    public Corrida insertar(@QueryParam("origen")String origen,
                            @QueryParam("destino") String destino,
                            @QueryParam("fechaSalida") String fechaInicio,
                            @QueryParam("fechaLlegada") String fechaFin,
                            @QueryParam("horaSalida") String horaSalida,
                            @QueryParam("horaLlegada") String horaLlegada,
                            @QueryParam("escalas") int escalas){
        
        Corrida corrida = new Corrida(0,escalas,origen,destino,fechaInicio,
                fechaFin,horaSalida,horaLlegada);
        
        try{
            BDCorrida.insertarCorrida(corrida);
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return corrida;
  }
}
