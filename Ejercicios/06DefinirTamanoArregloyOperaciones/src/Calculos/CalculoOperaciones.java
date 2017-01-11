/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculos;

/**
 *
 * @author mp.aguilar
 */
public class CalculoOperaciones {
    public static int suma_elementos(int elementos[]){
        int resultado=0;
        
        for (int i=0; i<elementos.length; i++)
        {
            resultado = resultado + elementos[i];            
        }   
        
        return resultado;
    }
    
    public static int media_elementos(int elementos[]){
        int resultado = 0;
        int cuenta = 0;
        
        resultado = suma_elementos(elementos);
        resultado = resultado / elementos.length;
                        
        return resultado;
    }
    
    public static int mayor_elemento(int elementos[]){      
        int valor_ant = 0;
             
        for (int i=0; i<elementos.length; i++)
        {
            if (elementos[i] > valor_ant)
            {
              valor_ant = elementos[i];      
            }            
        }
         
        return valor_ant;
    }
}
