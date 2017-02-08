package rest.holamundo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by mp. on 25/01/2017.
 */
@Path("/HolaMundo")
public class HolaMundo {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String HolaMundo(){
        return "Hola Mundo!!! String";
    }

    @GET
    @Produces(MediaType.TEXT_XML)
    public String HolaMundoXML(){
        return "<?xml version=\"1.0\"><hola>Hola Mundo xml!!!</hola>";
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String HolaMundoHTML(){
        return "<html>" +
                "<body>" +
                "<h1>Hola Mundo!!! html</h1>" +
                "</body>" +
                "</html>";
    }

}