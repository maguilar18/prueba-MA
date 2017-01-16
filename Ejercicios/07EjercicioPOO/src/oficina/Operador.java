/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oficina;

/**
 *
 * @author mp.aguilar
 */
public class Operador extends Empleado {
    public Operador(String nombre, String apellido, int edad, int cveEmpleado, float salario)
    {
      super(nombre, apellido, edad,cveEmpleado, salario);
    }
    
    @Override
    public void trabajar()
    {
    System.out.println("conduce");
    }

    @Override
    public void transpoteTorta() {
        System.out.println("liquida"); //To change body of generated methods, choose Tools | Templates.
    }
}

