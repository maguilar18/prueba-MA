/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.holamundo;

import java.io.File;
import java.io.IOException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 *
 * @author mp.aguilar
 */
@Path("/html")
public class ArchivoWs {
    @GET
    @Path("/{nombre}")
    public Response obtenerArchivo(@PathParam("nombre")String nombre) throws IOException{
       ClassLoader cl= getClass().getClassLoader(); 
       try{
       File archivo = new File(cl.getResource("/html/"+nombre+".html").getFile());
       // System.out.println(archivo.getPath());
       return Response.status(200).entity(archivo).build(); 
       } catch (NullPointerException e){
           return Response.status(404).entity(
                   new File(cl.getResource("/html/404.html").getFile())
                   ).build();
       }
       
    }
}
