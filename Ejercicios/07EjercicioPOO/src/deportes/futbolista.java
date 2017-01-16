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
public class futbolista extends Persona implements Deporte{
    private String posicion;
    private int dorsal;
    
    public futbolista(String nombre, String apellido, int edad, String posicion, int dorsal)
    {
        super(nombre,apellido,edad); //hace referencia al constructor de la clase padre
        this.posicion = posicion;
        this.dorsal = dorsal;
    }
    
    @Override
    public void entrenar()
    {
      System.out.println("Se levanta temprano a entrenar");
    }
    
    @Override
    public void viajar()
    {
      System.out.println("Viaja al estadio");
    }
    
    @Override
    public void jugar()
    {
       System.out.println("futbol");
    }
    
    @Override
    public void hablar()
    {
       System.out.println("Se hizo lo que se pudo..., dimos lo mejor");
    }
    
    @Override
    public void comer()
    {
       System.out.println("¿Que es...?");
    }
    
    @Override
    public String toString()
    {
       return "Nombre: " + getNombre() + "; Apellido: " + getApellido() + "; Edad: " + getEdad() + ": Posicion: " + posicion + "; Dorsal: " + dorsal;
    }
    
    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
}
