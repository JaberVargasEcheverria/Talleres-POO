/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.taller4_1;

/**
 *
 * @author JABER
 */
public class Estudiante {

    private String nombre;
    private int edad;
    private String notaPromedio;

    public Estudiante(String nombre, int edad, String notaPromedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaPromedio = notaPromedio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNotaPromedio() {
        return notaPromedio;
    }

    public void setNotaPromedio(String notaPromedio) {
        this.notaPromedio = notaPromedio;
    }

}
