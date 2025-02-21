/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

/**
 *
 * @author JABER
 */
class Prueba {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Jaber", 18);
        persona1.edad = 19;
        // persona1.nombre = "Jaber"; Da error debido a que la declaramos private, Significa que no puede ser usada fuera de la clase local
        // En cambio edad tiene acceso a paquete debido a que no fue declarada private 
    }
}
