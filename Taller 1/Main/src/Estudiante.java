/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JABER
 */
public class Estudiante {
    String nombre;
    int edad;
    String curso;
  
 public Estudiante(){
    
 }
 
 public Estudiante (String name, int edad){
     this.nombre = nombre;
     this.edad = edad;
 }
 
 public Estudiante(String nombre, int edad, String curso){
     this(nombre,edad);
     this.curso = curso;
 }
 @Override
 public String toString(){
     return "Nombre" + nombre + "Edad" + edad + "Curso" + curso;
 }
}


