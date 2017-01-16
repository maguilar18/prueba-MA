/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deportes;
import persona.Persona;
/**
 *
 * @author mp.aguilar
 */                                     
public class Boxeador extends Persona implements Deporte{
    String peso;
    
    public Boxeador(String nombre, String apellido,int edad, String peso)
    {
        super(nombre, apellido, edad);
        this.peso = peso;
    }
    
    @Override
    public void entrenar()
    {
      System.out.println("Se levanta temprano a entrenar");
    }
    
    @Override
    public void viajar()
    {
      System.out.println("Viaja para pelear");
    }
    
    @Override
    public void jugar()
    {
       System.out.println("Golpear");
    }    
}
