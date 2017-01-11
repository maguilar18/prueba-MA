/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg06definirtamanoarregloyoperaciones;

import java.util.Scanner;
import Calculos.CalculoOperaciones;
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
        int longitud = 0;
        int num_opcion = 0;
                
        System.out.println("Defina el tamaño del arreglo");
        longitud = s.nextInt();            
           
        int[] Arreglo = new int[longitud];
        
        for (int i=0; i<longitud; i++)
        {
          System.out.println("Introduce el valor:");
          Arreglo[i] = s.nextInt();         
        }
                
        while (num_opcion != 4) {            
          System.out.println("Elija la operacion:");
          System.out.println("1. Calcular Suma:");
          System.out.println("2. Calcular Media:");
          System.out.println("3. Calcular Número Mayor:");
          System.out.println("4. Salir:");
          
          num_opcion = s.nextInt();
          
          switch(num_opcion)
          {
              case 1: System.out.println("El resultado de la suma es:" + CalculoOperaciones.suma_elementos(Arreglo));
                break;            
              case 2: System.out.println("El resultado de la media es:" + CalculoOperaciones.media_elementos(Arreglo));
                break;
              case 3: System.out.println("El resultado de la mayor es:" + CalculoOperaciones.mayor_elemento(Arreglo));
                break;
              case 4: System.exit(0);
                break;
          }
        }
    }
}
