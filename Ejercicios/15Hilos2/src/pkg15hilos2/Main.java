/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg15hilos2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author mp.aguilar
 */
public class Main {

    static List<Autobus> autobuses = Arrays.asList(
        new Autobus(1,"León", "Guadalajara", new int[]{5,3,5}),
        new Autobus(2,"León", "México", new int[] {5,4,4}),
        new Autobus(3,"León", "Puerto Vallarta", new int[] {5,3,5}),
        new Autobus(4,"León", "Silao", new int[] {5,3,5}),
        new Autobus(5,"León", "Celaya", new int[] {5,3,5}),
        new Autobus(6,"León", "Irapuato", new int[] {5,3,5}),
        new Autobus(6,"León", "Guadalajara", new int[] {5,3,5})
        );
    
    public static void main(String[] args) {
        long tiempo = System.currentTimeMillis();
        int terminales = 2;
        ExecutorService ejecutor = Executors.newFixedThreadPool(terminales);
        
        autobuses.forEach(autobus -> {
            Runnable terminal = new Terminal(autobus,tiempo);
            ejecutor.execute(terminal);
        });
        
        ejecutor.shutdown(); //indicar al ejecutar q ya se apague
        
        while(!ejecutor.isTerminated()){
                       
        }    
         System.out.println("Proceso terminado.");         
    }
    
}
