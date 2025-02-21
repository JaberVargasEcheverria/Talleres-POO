/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JABER
 */
public class Estudiante {
    private String nombre;
    private int edad;

public Estudiante(){
    this("Danna",20); // Llama al constructor de dos parametros
}    
public Estudiante(String nombre, int edad){
    this.nombre = nombre;
    this.edad = edad;
}    

public void mostrarEstudiante(){
    System.out.println("Nombre: " + nombre + "Edad : " + edad);
}
/*Metodo errado
public static void infoEstudiante(){
  System.out.println("NOMBRE: " + this.nombre + "EDAD: " + this.edad);
}*/
}
