/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg08interfazclaseabstracta;

import TiposVehiculos.Automovil;
import TiposVehiculos.Camioneta;
import TiposVehiculos.Motocicleta;
import TiposVehiculos.Trailer;
import Vehiculo.Vehiculo;
import java.util.Scanner;

/**
 *
 * @author mp.aguilar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    static Object [] arreglo;
    static int genera_id;
    static Scanner s = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here       
        int num_opcion = 0;        
       
         while (num_opcion != 5) {            
          System.out.println("Elija la operacion:");
          System.out.println("1. Registrar nuevo vehiculo");
          System.out.println("2. Eliminar vehiculo (por id)");
          System.out.println("3. Buscar (por id)");
          System.out.println("4. Consultar todo");
          System.out.println("5. Salir");
          
          num_opcion = s.nextInt();
          
          switch(num_opcion)
          {
              case 1: registrar_tipo_vehiculo();
                      break;            
              case 2: 
                      break;
              case 3: 
                      break;
              case 4: consultar_todo();
                      break;
              case 5: System.exit(0);
                break;
          }
        }
         
        /*for (int i=0; i<10; i++)
        { 
         System.out.println("Introduce el valor:");
          arreglo[puntero] = s.nextInt();  
        }*/
    }

    public static void registrar_tipo_vehiculo()
    {        
        int tipo_vehiculo = 0;         
        arreglo = new Object [5];
        int registro = 0;
        while ((tipo_vehiculo  != 5) && (registro < 5)) { 
        System.out.println("Elija el tipo de vehiculo que desea registrar:");
        System.out.println("1. Registrar Automóvil");
        System.out.println("2. Registrar Camioneta");
        System.out.println("3. Registrar Motocicleta");
        System.out.println("4. Registrar Trailer");
        System.out.println("5. Salir");
        tipo_vehiculo  = s.nextInt();  
        
        switch(tipo_vehiculo)
          {
              case 1: Automovil v = new Automovil(0, 0, "", Boolean.FALSE, "", 0, Boolean.FALSE);
                      v.registrar_informacion();
                      arreglo[registro] = v;
                      break;            
              case 2: Camioneta c = new Camioneta(Boolean.FALSE,Boolean.FALSE,0,0,Boolean.FALSE,"");
                      c.registrar_informacion();
                      arreglo[registro] = c;
                      break;
              case 3: Motocicleta m = new Motocicleta(Boolean.FALSE,"",0,"",0,Boolean.FALSE);
                      m.registrar_informacion();
                      arreglo[registro] = m;
                      break;
              case 4: Trailer t = new Trailer(0,0,0,0,Boolean.FALSE,"");
                      t.registrar_informacion();
                      arreglo[registro] = t;
                      break;
              case 5: break;
          }
        registro++;
        }
        
        System.out.println("Usted ha registrado :" + registro + " tipos de vehiculo");
    }    
    
    public static void consultar_todo()
    {      
        for (int i=0; i<arreglo.length; i++)
        {             
           if (arreglo[i] != null)
           {                
                Vehiculo a = (Vehiculo) arreglo[i];                
                if (a != null)
                {                       
                    a.imprimir_informacion();
                }
           }
        }
    }
}
