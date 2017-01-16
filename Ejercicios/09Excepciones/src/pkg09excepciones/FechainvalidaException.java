/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg09excepciones;

/**
 *
 * @author mp.aguilar
 */
public class FechainvalidaException extends Exception {
    public FechainvalidaException(){
       super("La fecha es anterior a la actual"); 
   // System.out.println("Excepcion Lanzada");
    
}
}
