/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg04arreglos;

/**
 *
 * @author mp.aguilar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] ArregloEntero = new int[10];
        int[] ArregloEnteroB = {1,2,3,4,5}; //Arreglo inicializado con valores fijos
        String[] Cadena = new String[10];
        boolean[] B=new boolean[10];
        
        System.out.println(ArregloEntero[0]);
        System.out.println(ArregloEnteroB[0]);
        System.out.println(Cadena[0]);
        System.out.println(B[0]);
        
        //Arreglos bidimensionales
        int [][] EnteroBidimensional = new int[2][3];
        int [][] EnteroBidimensionalB = {{1,3,4},{3,5,2}};
        
         System.out.println(EnteroBidimensionalB[1][0]);
    }
    
}
