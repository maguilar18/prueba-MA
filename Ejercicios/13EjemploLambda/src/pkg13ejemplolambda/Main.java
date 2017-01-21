/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg13ejemplolambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import pkg13ejemplolambda.Operadores.Operador;

/**
 *
 * @author mp.aguilar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    static List<Operador> lista = Arrays.asList(
        new Operador("Juan",324,true),
        new Operador("Jose",322,false),
        new Operador("Karina",334,true),
        new Operador("Maria",353,true),
        new Operador("Luis",355,false));
        
    public static void main(String[] args) {
             
       long tiempoInicio = System.currentTimeMillis();       
       filtroNuevo(); //filtroAntiguo();
       long tiempoFinal = System.currentTimeMillis();  
       System.out.println(tiempoFinal - tiempoInicio);
    }
     
    public static void filtroNuevo()
    {
        List<Operador> operadores = lista.stream()
                        .filter(op->op.isStatus()) //filtro con expresion lambda
                        .collect(Collectors.toList()); //se vuelve a agrupar la informacion como una lista para regresarla
        imprimirNuevo(operadores);                
    }
    
    public static void filtroAntiguo(){
        List<Operador> operadores = new ArrayList<Operador>();
        for(Operador op: lista){
            if (op.isStatus())
            {
                operadores.add(op);
            }
        } 
        imprimir(operadores);
    }
    
    public static void imprimir(List<Operador> operadores)
    {
        System.out.println("---- Lista filtrada ----");
        for(Operador op: operadores)
        {
            System.out.println(op);
        }
    }
    
    public static void imprimirNuevo(List<Operador> operadores)
    {
       System.out.println("---- Lista filtrada 'Nuevo' ----");
       operadores.forEach(op-> System.out.println(op)); //operacion que le pasamos  
    }
}
