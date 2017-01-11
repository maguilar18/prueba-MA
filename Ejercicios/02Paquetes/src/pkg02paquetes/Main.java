/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02paquetes;
//import matematicas.Matematicas;
import matematicas.*; //para llamar todass las clases que pertenecen a un paquete pero no es muy recomendable su uso.
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
        
        //Matematicas mat = new Matematicas(); //instancia sin que el metodo sea estatico
        Scanner lector = new Scanner(System.in);
        float a,b;
        
        System.out.println("Introduce un Número");
        a = lector.nextFloat();
        
        System.out.println("Introduce otro Número");
        b = lector.nextFloat();
                                         //mat.suma //si la clase no es estatica
        System.out.println("Resultado" + Matematicas.suma(a,b));
        System.out.println("Resultado" + Matematicas.resta(a,b));
        System.out.println("Resultado" + Matematicas.multiplicacion(a,b));
        System.out.println("Resultado" + Matematicas.division(a,b));
    }    
}