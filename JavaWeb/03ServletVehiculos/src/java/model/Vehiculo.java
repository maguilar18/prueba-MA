/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Scanner;

/**
 *
 * @author mp.aguilar
 */
public class Vehiculo { //si se tiene un metodo abstracto o mas la clase principal tiene que ser abstracta
  private int id;
  private int puertas;
  private String color;
  private boolean quemacocos;  
  Scanner s = new Scanner(System.in);
         
  public Vehiculo(int id,int puertas,String color, boolean quemacocos)
        {
            this.id = id;
            this.puertas = puertas;
            this.color = color;
            this.quemacocos = quemacocos;
        }  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isQuemacocos() {
        return quemacocos;
    }

    public void setQuemacocos(boolean quemacocos) {
        this.quemacocos = quemacocos;
    }  
   
    //public abstract void imprimir_informacion();  
    //public abstract void registrar_informacion();
    
    public void registra_datos()
    {
        System.out.println("Introduce el id vehiculo");
        this.id = s.nextInt();
        System.out.println("Introduce la cantidad de puertas");
        this.puertas = s.nextInt(); 
        System.out.println("Introduce el color");
        this.color = s.next();
        System.out.println("¿Tiene quemacocos?");
        this.quemacocos = s.nextBoolean();
    }
}
