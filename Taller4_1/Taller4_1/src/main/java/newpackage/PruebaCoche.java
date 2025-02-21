/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author JABER
 */
public class PruebaCoche {
    public static void main(String[] args) {
        // Crear un objeto Coche
        Coche coche = new Coche("Nissan", "SkyLine", 180);

      
        System.out.println("Velocidad Máxima Inicial: " + coche.getVelocidadMaxima() + " km/h");

        // Intentar acelerar con valores válidos e inválidos
        coche.acelerar(25);  // Aumentará la velocidad máxima
        coche.acelerar(-8); // No aumentará porque es negativo
        coche.acelerar(40);  // Aumentará la velocidad máxima
    }
}

