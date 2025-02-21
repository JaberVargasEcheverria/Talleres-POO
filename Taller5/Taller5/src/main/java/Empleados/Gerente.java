/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleados;

/**
 *
 * @author JABER
 */
public class Gerente extends Empleado {
    private String departamento;
    
    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }
    //Sobreescribimos el metodo
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); 
        System.out.println("Departamento: " + departamento);
    }
}
