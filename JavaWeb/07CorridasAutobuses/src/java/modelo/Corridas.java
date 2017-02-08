/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author mp.aguilar
 */
public class Corridas {
      //fechaSalida, horaSalida, fechaLlegada, horaLlegada, 
    private int id_corrida, escalas;
    private String origen, destino, fechaSalida, fechaLlegada, horaSalida, horaLlegada;

    public Corridas(int id_corrida, String origen, String destino, String fechaSalida, String fechaLlegada, String horaSalida, 
            String horaLlegada, int escalas) {
        this.id_corrida = id_corrida;
        this.origen = origen;
        this.destino = destino;
        this.fechaSalida = fechaSalida;
        this.fechaLlegada = fechaLlegada;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.escalas = escalas;
    }

    public Corridas() {
    }

    public int getid_corrida() {
        return id_corrida;
    }

    public void setid_corrida(int id_corrida) {
        this.id_corrida = id_corrida;
    }

    public int getEscalas() {
        return escalas;
    }

    public void setEscalas(int escalas) {
        this.escalas = escalas;
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

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(String fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;
    }
    
}


