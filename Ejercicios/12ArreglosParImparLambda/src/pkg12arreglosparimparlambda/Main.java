/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12arreglosparimparlambda;

import java.util.Date;
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
        Scanner s = new Scanner(System.in);
        int[] Arreglo = new int[6];  
        int[] Arreglo_pares = new int[6]; 
        int[] Arreglo_impares = new int[6];  
        boolean es_par;
                                 
        Matematicas revisar = (int a) -> 
        {  
           if ((a%2)==0) 
           {
              return true;
           }
           else
           {
              return false;
           }            
        };
        
        for (int i=0; i<6; i++)
        {
          System.out.println("Introduce el valor:");
          Arreglo[i] = s.nextInt();         
        }  
        
        for (int i=0; i<Arreglo.length; i++)
        {
           es_par = identificar_par(Arreglo[i],revisar);
           if (es_par == true) 
           {
              Arreglo_pares[i] = Arreglo[i]; 
           }        
           else
           {
              Arreglo_impares[i] = Arreglo[i];
           }
        }
        
        for (int i=0; i<Arreglo_impares.length; i++)
        {
             System.out.println("Impares =" + Arreglo_impares[i]);
        }
        
        for (int i=0; i<Arreglo_pares.length; i++)
        {
             System.out.println("Pares =" + Arreglo_pares[i]);
        }
    }
    
    static boolean identificar_par(int a, Matematicas operacion)
    {      
      return operacion.operacion(a);//elementos[]
    }
}
