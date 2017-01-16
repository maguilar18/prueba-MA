/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TiposVehiculos;

import Vehiculo.Vehiculo;
import java.util.Scanner;

/**
 *
 * @author mp.aguilar
 */
public class Camioneta extends Vehiculo{
  private boolean carga;
  private boolean redilas;
    
  public Camioneta(boolean carga, boolean redilas,int id, int puertas, boolean quemacocos,String color)
        {
            super(id,puertas,color,quemacocos);
            this.carga = carga;
            this.redilas = redilas;
        }  

    public boolean isCarga() {
        return carga;
    }

    public void setCarga(boolean carga) {
        this.carga = carga;
    }

    public boolean isRedilas() {
        return redilas;
    }

    public void setRedilas(boolean redilas) {
        this.redilas = redilas;
    }

    
    @Override
    public void imprimir_informacion() {
       System.out.println("Camioneta");                                     
       System.out.println("Id:" + getId()); 
       System.out.println("Color:" + getColor());       
       System.out.println("Quemacocos:" + isQuemacocos());      
       System.out.println("Puertas:" + getPuertas());           
       System.out.println("Carga:" + isCarga());                               
       System.out.println("Redilas:" + isRedilas());  
    }

    @Override
    public void registrar_informacion() {
        registra_datos();
        Scanner s = new Scanner(System.in);
        System.out.println("¿Es de carga?");
        this.carga = s.nextBoolean();         
        System.out.println("¿Tiene redilas?");
        this.redilas = s.nextBoolean();
    }  
}
