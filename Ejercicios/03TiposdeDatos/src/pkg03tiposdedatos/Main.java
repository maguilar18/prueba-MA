/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg03tiposdedatos;

/**
 *
 * @author mp.aguilar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena1 = "Hola ";
        String cadena2 = "Marta";
        String cadenaR = cadena1 + cadena2;
        boolean bandera= false;
        byte b=127;
        int entero = 1;
        float flotante = 2.4f;
        double d=2.543;
        char c = 'c';
        long l= 45353644575756564L;
              
        System.out.println(bandera == true);
        System.out.println(cadenaR);
        System.out.println(cadenaR.length());
        System.out.println(cadenaR.toLowerCase());
        System.out.println(cadenaR.toUpperCase());
    }
    
}
