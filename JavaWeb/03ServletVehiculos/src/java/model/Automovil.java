/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import Vehiculo.Vehiculo;
import java.util.Scanner;
/**
 *
 * @author mp.aguilar
 */
public class Automovil extends Vehiculo{   
    private Boolean faros_niebla;
    private String tamano;
     
     public Automovil(int id,int cantidad_puertas, String color,Boolean faros_niebla, String tamano,int puertas, boolean quemacocos)
        {            
            super(id,puertas,color,quemacocos);
            this.faros_niebla = faros_niebla;
            this.tamano = tamano;           
        }

    public Boolean getFaros_niebla() {
        return faros_niebla;
    }

    public void setFaros_niebla(Boolean faros_niebla) {
        this.faros_niebla = faros_niebla;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }
     
     
    @Override
    public void imprimir_informacion() {       
       System.out.println("Automovil");                                     
       System.out.println("Id:" + getId()); 
       System.out.println("Color:" + getColor());           
       System.out.println("Quemacocos:" + isQuemacocos());                               
       System.out.println("Puertas:" + getPuertas());           
       System.out.println("Faros:" + getFaros_niebla());           
       System.out.println("Tamaño:" + getTamano());     
    }

    @Override
    public void registrar_informacion() {
        registra_datos();
        Scanner s = new Scanner(System.in);
        System.out.println("Tamaño");
        this.tamano = s.next();
        System.out.println("¿Tiene faros de niebla?");
        this.faros_niebla = s.nextBoolean();  
        System.out.println("Captura terminada");
    }
       
         
}
