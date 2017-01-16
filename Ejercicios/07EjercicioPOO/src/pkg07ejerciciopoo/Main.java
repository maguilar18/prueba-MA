/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg07ejerciciopoo;

/**
 *
 * @author mp.aguilar
 */

import deportes.Deporte;
import persona.Persona;
import deportes.futbolista;
import oficina.Desarrollador;
        
public class Main {

    /**
     * @param args the command line arguments
     */
    
      public static void pruebaIntertaz(Deporte d)
       {
           d.viajar();          
       }
       public static void pruebaHErencia(Persona p)
       {
            p.hablar();
       }
               
    public static void main(String[] args) { 
      //Futbolista f = new Futbolista("Juan","Perez",)
        
        /*Desarrollador d= new Desarrollador("Jose","Lopez",34,9324,2.0f);
       System.out.println("primero");
       d.trabajar();
       System.out.println("despues");
       d.transpoteTorta();*/
       
        
       /*Persona  p= new Persona("Josue Caro");
       p.hablar();
       System.out.println(p);
       futbolista f= new futbolista("Juan","Perez",33,"Delantero",22);
       f.hablar();
       System.out.println(f);*/
       
    /*String nombreCompleto;
    Persona p = new Persona("Josué Caro");  
    p.setEdad(83);
        String nombre = null;
    Persona p2 = new Persona("Josué","Perez",32); 
    
    System.out.println("Nombre:" + p.getNombre() + "; Apellido: " + p.getApellido() + "; " + "Edad: " + p2.getEdad());*/
}
}
