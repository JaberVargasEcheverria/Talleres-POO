/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Persona;

/**
 *
 * @author JABER
 */
public class Persona {
protected String nombre;
    protected int edad;
    
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void mostrarDetalles(){  
        System.out.println("ESTOS SON LOS DATOS DEL ESTUDIANTE");
        System.out.println("NOMBRE: " + nombre);
        System.out.println("EDAD: " + edad);
    }
}
