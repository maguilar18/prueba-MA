/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11expresioneslambda;

/**
 *
 * @author mp.aguilar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Matematicas suma = (float a, float b) ->  a+b;
      Matematicas resta = (float a, float b) ->  a-b;
      Matematicas multiplicacion = (float a, float b) ->  a*b;
      Matematicas division = (float a, float b) ->  a/b;
        System.out.println("Suma =" + operar(10f,30f,suma));
        System.out.println("Resta =" + operar(10f,30f,resta));
        System.out.println("Multiplicacion =" + operar(10f,30f,multiplicacion));
        System.out.println("Division =" + operar(10f,30f,division));
        
     /* Matematicas m = new Matematicas() {
      @Override
      public float operacion(float a, float b)
      {
       return a+b;
      }
      };*/
    }
   
    static float operar(float a, float b, Matematicas operacion)
    {
      return operacion.operacion(a, b);
    }
}
