/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

/**
 *
 * @author mpaguilar
 */
import java.sql.SQLException;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import modelo.Corridas;

/**
 *
 * @author mp.aguilar
 */
@WebService
public interface CorridasWS {   
    @WebMethod
    public boolean insertarCorridas(String origen,String destino, String fechaSalida, String fechaLlegada,String horaSalida, String horaLlegada, int escalas)throws ClassNotFoundException,SQLException;
       
    @WebMethod
    public Corridas[]getCorridas();
    
    @WebMethod
    public boolean eliminarCorridas(int id_corrida);    
}

