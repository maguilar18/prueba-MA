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
public class Trailer extends Vehiculo{
  private int remolques;
  private int cantidad_llantas;

    public int getRemolques() {
        return remolques;
    }

    public void setRemolques(int remolques) {
        this.remolques = remolques;
    }

    public int getCantidad_llantas() {
        return cantidad_llantas;
    }

    public void setCantidad_llantas(int cantidad_llantas) {
        this.cantidad_llantas = cantidad_llantas;
    }
    
  public Trailer(int num_remolques, int cantidad_llantas, int id,int puertas, boolean quemacocos,String color)
        {
            super(id,puertas,color,quemacocos);
            this.remolques = num_remolques;
            this.cantidad_llantas = cantidad_llantas;
        }  
/*
    @Override
    public void imprimir_informacion() {
       System.out.println("Trailer");                              
       System.out.println("Id:" + getId()); 
       System.out.println("Color:" + getColor());       
       System.out.println("Quemacocos:" + isQuemacocos());      
       System.out.println("Puertas:" + getPuertas());           
       System.out.println("Remolques:" + getRemolques());                               
       System.out.println("Llantas:" + getCantidad_llantas());  
    }

    @Override
    public void registrar_informacion() {
        registra_datos();
        Scanner s = new Scanner(System.in);
        System.out.println("¿Cuantos remolques tiene?");
        this.remolques = s.nextInt();        
        System.out.println("¿Cuantas llantas tiene?");
        this.cantidad_llantas = s.nextInt();
    }
*/  
}
