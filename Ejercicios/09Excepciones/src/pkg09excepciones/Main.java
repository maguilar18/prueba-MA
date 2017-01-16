/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg09excepciones;

import java.util.Date;

/**
 *
 * @author mp.aguilar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Boleto b = new Boleto();
        
        Date d= new Date("05/25/2000");
        
        try {
        b.setFecha(d);            
        } catch (FechainvalidaException e) {
            System.out.println("Fecha invalida");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }finally{
             System.out.println(b.getFecha());
             System.out.println("Siempre se va a ejecutar");             
        }        
        
        /*try {
           System.out.println(args[1]);
           
        } catch (ArrayIndexOutOfBoundsException ex) {
            //ex.printStackTrace();
             System.out.println("Posicion no valida");        
        } catch (Exception e) {
             //e.printStackTrace();
             System.out.println("error generico");
        }*/
    }
    
}
