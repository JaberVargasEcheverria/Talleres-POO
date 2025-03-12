/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller15;

/**
 *
 * @author JABER
 */
// Interfaz principal que agrupa las funcionalidades de un vehículo
interface Vehiculo extends Conducible, Transportador {
}

// Interfaz específica para conducción
interface Conducible {
    void conducir();
}

// Interfaz específica para transporte de mercancías
interface Transportador {
    void cargarMercancia(double peso);
}

// Implementación de un automóvil que solo puede conducir
class Automovil implements Vehiculo {
    @Override
    public void conducir() {
        System.out.println("El automóvil está en marcha.");
    }

    @Override
    public void cargarMercancia(double peso) {
        throw new UnsupportedOperationException("Un automóvil no puede transportar mercancía.");
    }
}

// Implementación de un camión que puede conducir y transportar mercancías
class Camion implements Vehiculo {
    @Override
    public void conducir() {
        System.out.println("El camión está en marcha.");
    }

    @Override
    public void cargarMercancia(double peso) {
        System.out.println("Cargando " + peso + " kg de mercancía en el camión.");
    }
}

