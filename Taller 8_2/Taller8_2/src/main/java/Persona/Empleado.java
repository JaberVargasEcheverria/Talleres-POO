/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persona;

/**
 *
 * @author JABER
 */
public class Empleado extends Persona {

    protected String departamento;

    public Empleado(String nombre, int edad, String departamento) {
        super(nombre, edad);
        this.departamento = departamento;
    }
    @Override
    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("EL DEPARTAMENTO ES: " + departamento);
    }

}
