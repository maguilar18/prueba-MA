/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg05flujocontrol;

import java.util.Scanner;

/**
 *
 * @author mp.aguilar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] Cadena = new String[5];
        Scanner s = new Scanner(System.in);
        String Nombres="";

        for (int i=0; i<5; i++)
        {
            System.out.println("Introduce un Nombre");
            Cadena[i] = s.nextLine();            
        }        
        
        for (int j=0; j<5; j++)
        {
            Nombres = Nombres + "," + Cadena[j];            
        }   
        System.out.println(Nombres);
    }
    
}
