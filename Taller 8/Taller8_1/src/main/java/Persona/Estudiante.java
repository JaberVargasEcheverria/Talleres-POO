/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persona;

/**
 *
 * @author JABER
 */
public class Estudiante extends Persona {

    protected String matricula;

    public Estudiante(String nombre, int edad, String matricula) {
        super(nombre, edad);
        this.matricula = matricula;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("ESTOS SON LOS DATOS DEL ESTUDIANTE");
        super.mostrarDatos();
        System.out.println("MATRICULA: " + matricula);
    }

}
