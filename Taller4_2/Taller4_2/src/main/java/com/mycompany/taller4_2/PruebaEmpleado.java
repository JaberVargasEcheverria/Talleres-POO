/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller4_2;

/**
 *
 * @author JABER
 */
public class PruebaEmpleado {
    public static void main(String[] args) {
       
        Empleado empleado1 = new Empleado("Osvaldo Pacheco", 2500.00);

        // Acceder y modificar la propiedad pública "nombre"
        System.out.println("Nombre del empleado: " + empleado1.getNombre());
        empleado1.setNombre("Adrian Orozco");
        System.out.println("Nuevo nombre del empleado: " + empleado1.getNombre());

        // Acceder y modificar la propiedad privada "salario" usando métodos get y set
        System.out.println("Salario del empleado: " + empleado1.getSalario());
        empleado1.setSalario(6500.00);
        System.out.println("Nuevo salario del empleado: " + empleado1.getSalario());
    }
}

