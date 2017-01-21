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
public class Estados {
    private int idEstados, municipios;
    private String nombre,comidaTipica,capital;

    public Estados(int idEstados, int municipios, String nombre, String comidaTipica, String capital) {
        this.idEstados = idEstados;
        this.municipios = municipios;
        this.nombre = nombre;
        this.comidaTipica = comidaTipica;
        this.capital = capital;
    }

    public Estados() {
    }

   
    public int getIdEstados() {
        return idEstados;
    }

    public void setIdEstados(int idEstados) {
        this.idEstados = idEstados;
    }

    public int getMunicipios() {
        return municipios;
    }

    public void setMunicipios(int municipios) {
        this.municipios = municipios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComidaTipica() {
        return comidaTipica;
    }

    public void setComidaTipica(String comidaTipica) {
        this.comidaTipica = comidaTipica;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }
    
    
}
