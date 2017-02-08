/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.holamundo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 *
 * @author mp.aguilar
 */
@Path("/mensaje")
public class MensajeWS {
    @Path("/{param}")
    @GET
    public Response imprimirMensaje(@PathParam("param") String param)
    {
        String msj = "Tu mensaje es: " + param;
        if (param.length() > 20)
        {
        return Response.status(500).entity("El parametro es mayor a 20 caracteres").build();
        }
        else{
        return Response.status(200).entity(msj).build();
        }
    }
}
