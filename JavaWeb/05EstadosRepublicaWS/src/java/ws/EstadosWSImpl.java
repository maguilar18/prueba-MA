/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import bd.EstadoBD;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import modelo.Estados;
/**
 *
 * @author mp.aguilar
 */
@WebService
public class EstadosWSImpl implements EstadosWS{
    @WebMethod
    @Override    
    public String getCapital(@WebParam(name = "estado") String s) throws ClassNotFoundException,SQLException{
      return EstadoBD.getCapital(s);
    }
    
    @WebMethod
    @Override
    public int getPoblacion(@WebParam(name = "estado") String s) throws ClassNotFoundException,SQLException{
        return EstadoBD.getPoblacion(s);
    }
    

    @Override
    @WebMethod
    @WebResult(name="estado")
    public Estados[] getEstados() {
        try {   
            Estados[] estados;
            estados = EstadoBD.getEstados();
            return estados;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EstadosWSImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(EstadosWSImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
