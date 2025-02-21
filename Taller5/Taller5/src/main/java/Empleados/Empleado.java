/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Empleados;

/**
 *
 * @author JABER
 */
public class Empleado {

  protected String nombre;
  protected double salario;
  
public Empleado(String nombre, double salario){
    this.nombre = nombre;
    this.salario = salario;
}
public void mostrarInformacion(){
    System.out.println("Empleado: " + nombre);
    System.out.println("Salario: " + salario);
}
}
