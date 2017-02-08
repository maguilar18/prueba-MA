/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg06clienteestado;

import java.io.IOException;
import java.util.Iterator;
import javax.xml.namespace.QName;
import javax.xml.soap.*;

/**
 *
 * @author mp.aguilar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
      try{
      SOAPConnectionFactory factory = SOAPConnectionFactory.newInstance();
      SOAPConnection conexion = factory.createConnection();
      String urlConexion = "http://localhost:8084/05EstadosRepublicaWS/Estados";
                                          //generarMensaje()                          
      SOAPMessage response = conexion.call(generarTodo(),urlConexion);
      //generarMensaje();
      //imprimirRespuesta(response);
      //generarTodo();
      imprimirTodo(response);
      conexion.close();
    } catch (SOAPException e){
      e.printStackTrace();
    } catch (IOException e)
    {
        e.printStackTrace();
    }
    }
    
    public static void imprimirRespuesta(SOAPMessage response) throws SOAPException{
        SOAPBody body = response.getSOAPBody();
        SOAPElement elemento = (SOAPElement)body.getChildElements(
                new QName("http://ws/","getCapitalResponse")).next();
        SOAPElement elemento2 = (SOAPElement)elemento.getChildElements(new QName("return")).next();
        String mensaje = elemento2.getTextContent();
        System.out.println("\n" + mensaje);
    }
    
    
    public static void imprimirTodo(SOAPMessage response) throws SOAPException{
        SOAPBody body = response.getSOAPBody();
        SOAPElement elemento = (SOAPElement)body.getChildElements(
                new QName("http://ws/","getEstadosResponse")).next();
        Iterator<SOAPElement> iterator = elemento.getChildElements(new QName("estado"));
        iterator.forEachRemaining(estadoSOAP ->{
            System.out.println("------------------");
            Iterator<SOAPElement> iteratorInterno = estadoSOAP.getChildElements();
            iteratorInterno.forEachRemaining(etiquetaInterna ->{
                System.out.println(etiquetaInterna.getNodeName() + ": " + etiquetaInterna.getTextContent());
            });
            System.out.println("------------------");
        });
    }
    
     private static SOAPMessage generarTodo() throws SOAPException, IOException{ 
      MessageFactory factory = MessageFactory.newInstance(); 
      SOAPMessage mensaje = factory.createMessage();
      SOAPPart soapPart = mensaje.getSOAPPart();
      String servicioUri = "http://ws/";
      SOAPEnvelope envelope  = soapPart.getEnvelope();
      envelope.addNamespaceDeclaration("ws",servicioUri);
      SOAPBody body = envelope.getBody();
      SOAPElement elemento = body.addChildElement("getEstados","ws");
   
      mensaje.saveChanges();
      mensaje.writeTo(System.out);
      return mensaje;
   }
     
   private static SOAPMessage generarMensaje() throws SOAPException, IOException{ 
      MessageFactory factory = MessageFactory.newInstance(); 
      SOAPMessage mensaje = factory.createMessage();
      SOAPPart soapPart = mensaje.getSOAPPart();
      String servicioUri = "http://ws/";
      SOAPEnvelope envelope  = soapPart.getEnvelope();
      envelope.addNamespaceDeclaration("ws",servicioUri);
      SOAPBody body = envelope.getBody();
      SOAPElement elemento = body.addChildElement("getCapital","ws");
      SOAPElement elementoInterno = elemento.addChildElement("estado");
      elementoInterno.addTextNode("Guanajuato");
      mensaje.saveChanges();
      mensaje.writeTo(System.out);
      return mensaje;
   }
}
