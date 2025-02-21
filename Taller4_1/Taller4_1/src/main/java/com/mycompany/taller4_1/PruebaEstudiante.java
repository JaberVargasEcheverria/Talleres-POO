/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller4_1;

/**
 *
 * @author JABER
 */
public class PruebaEstudiante {
    public static void main(String[] args) {
       
        Estudiante estudiante1 = new Estudiante("Juan", 20, "4.5");

        System.out.println("Datos del estudiante:");
        System.out.println("Nombre: " + estudiante1.getNombre());
        System.out.println("Edad: " + estudiante1.getEdad());
        System.out.println("Nota Promedio: " + estudiante1.getNotaPromedio());

        // Modificar algunos valores usando los setters
        estudiante1.setNombre("Samuel");
        estudiante1.setEdad(17);
        estudiante1.setNotaPromedio("3.5");

        // Mostrar los datos actualizados
        System.out.println("\nDatos actualizados del estudiante:");
        System.out.println("Nombre: " + estudiante1.getNombre());
        System.out.println("Edad: " + estudiante1.getEdad());
        System.out.println("Nota Promedio: " + estudiante1.getNotaPromedio());
    }
}

