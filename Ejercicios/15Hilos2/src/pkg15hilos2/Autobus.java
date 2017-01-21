/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg15hilos2;

/**
 *
 * @author mp.aguilar
 */
public class Autobus {   
    private int numero;
    private String origen;
    private String destino;
    private int [] tiempos;

    public Autobus(int numero, String origen, String destino, int[] tiempos) {
        this.numero = numero;
        this.origen = origen;
        this.destino = destino;
        this.tiempos = tiempos;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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

    public int[] getTiempos() {
        return tiempos;
    }

    public void setTiempos(int[] tiempos) {
        this.tiempos = tiempos;
    }
}