package ws.corridas;

/**
 *
 * @author mpaguilar
 */

import bd.CorridasBD;
import java.sql.SQLException;
import modelo.Corridas;
import javax.ws.rs.core.Response;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/")
public class CorridasWS {
    @Path("consulta/{parametro}")
    @GET
    @Produces(MediaType.APPLICATION_JSON) //text.json
    public Corridas consulta(@PathParam("parametro") int id)
    {   
        System.out.println(id);
        try{
            return CorridasBD.buscarCorrida(id);
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException e)
        {
            e.printStackTrace();
        }           
       
        return null; //Corridas()
    }
    
    /*@Path("Insertar")
    @POST
    @Produces(MediaType.APPLICATION_JSON)    
    public Corridas insertar(@QueryParam("origen")String origen,
                            @QueryParam("destino") String destino,
                            @QueryParam("fechaSalida") String fechaInicio,
                            @QueryParam("fechaLlegada") String fechaFin,
                            @QueryParam("horaSalida") String horaSalida,
                            @QueryParam("horaLlegada") String horaLlegada,
                            @QueryParam("escalas") int escalas){
        
        Corridas corrida = new Corridas(0,origen,destino,fechaInicio,
                fechaFin,horaSalida,horaLlegada,escalas);
        
        try{
            CorridasBD.insertarCorrida(corrida);
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return corrida;
  }*/
}
