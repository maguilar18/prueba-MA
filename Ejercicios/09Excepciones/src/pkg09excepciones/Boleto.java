/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg09excepciones;

import java.util.Date;

/**
 *
 * @author mp.aguilar
 */
public class Boleto {
   private float costo;
   private int folio;
   private String origen, destino;
   private Date fecha;

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) throws FechainvalidaException {
        if (fecha.before(new Date())) 
        {
            throw new FechainvalidaException();
        }
        this.fecha = fecha;
    }
   
   
}
