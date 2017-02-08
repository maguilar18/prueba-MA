/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import bd.CorridasBD;
import modelo.Corridas;
import java.sql.*; //SQLException
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.ws.rs.*;
//import javax.swing.JOptionPane;


/**
 *
 * @author mpaguilar
 */


@WebService    
public class CorridasWSImpl implements CorridasWS{ 
    @Override
    @WebMethod
    @WebResult(name="corrida")
    public Corridas[] getCorridas() {
        try {   
            Corridas[] corridas;
            corridas = CorridasBD.getCorridas();
            return corridas;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CorridasWSImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CorridasWSImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
        
    @Override
    @WebMethod                      
    public boolean insertarCorridas(@WebParam(name = "origen") String origen,@WebParam(name = "destino") String destino,
            @WebParam(name = "fechaSalida") String fechaSalida,@WebParam(name = "fechaLlegada") String fechaLlegada, 
            @WebParam(name = "horaSalida") String horaSalida,@WebParam(name = "horaLlegada") String horaLlegada,
            @WebParam(name = "escalas") int escalas) throws ClassNotFoundException, SQLException {
        return CorridasBD.insertarCorrida(origen,destino,fechaSalida,fechaLlegada,horaSalida, 
            horaLlegada,escalas);
          }

    @Override
    public boolean eliminarCorridas(@WebParam(name = "id_corrida") int id_corrida) {
        try {
            return CorridasBD.eliminarCorrida(id_corrida);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CorridasWSImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CorridasWSImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
}


