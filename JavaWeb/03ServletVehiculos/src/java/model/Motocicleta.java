/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

//import Vehiculo.Vehiculo;
import java.util.Scanner;

/**
 *
 * @author mp.aguilar
 */
public class Motocicleta extends Vehiculo{
  private Boolean es_deportiva;
  private String fabricante;
    
  public Motocicleta(Boolean es_deportiva, String fabricante,int id, String color, int puertas, boolean quemacocos)
        {
            super(id,puertas,color,quemacocos);
            this.es_deportiva = es_deportiva;
            this.fabricante = fabricante;
        }  

    public Boolean getEs_deportiva() {
        return es_deportiva;
    }

    public void setEs_deportiva(Boolean es_deportiva) {
        this.es_deportiva = es_deportiva;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    
  /*
    @Override
    public void imprimir_informacion() {
       System.out.println("Motocicleta");                              
       System.out.println("Id:" + getId()); 
       System.out.println("Color:" + getColor());       
       System.out.println("Quemacocos:" + isQuemacocos());      
       System.out.println("Puertas:" + getPuertas());           
       System.out.println("Es deportiva:" + getEs_deportiva());                               
       System.out.println("Fabricante:" + getFabricante());  
    }

    @Override
    public void registrar_informacion() {
        registra_datos();
        Scanner s = new Scanner(System.in);
        System.out.println("¿Es motocicleta deportiva?");
        this.es_deportiva = s.nextBoolean();         
        System.out.println("Fabricante");
        this.fabricante = s.next();
    }  */
}
