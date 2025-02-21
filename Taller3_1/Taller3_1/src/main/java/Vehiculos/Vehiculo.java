/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculos;

/**
 *
 * @author JABER
 */
 class Vehiculo {
    String tipo;
    
    
 Vehiculo(String tipo){
     this.tipo = tipo;
 }   
 public void mostrarTipo() { // Ahora es accesible desde cualquier paquete
        System.out.println("Tipo de vehículo: " + tipo);
 }

}

