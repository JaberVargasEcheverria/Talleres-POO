/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller14;

/**
 *
 * @author JABER
 */
// Clase base Transporte
abstract class Transporte {

    protected boolean enMovimiento;

    public void iniciar() {
        enMovimiento = true;
        System.out.println(getClass().getSimpleName() + " en movimiento.");
    }

    public void detener() {
        enMovimiento = false;
        System.out.println(getClass().getSimpleName() + " detenido.");
    }
}

// Clase derivada Bicicleta
class Bicicleta extends Transporte {

    @Override
    public void iniciar() {
        super.iniciar();
        System.out.println("Pedaleando la bicicleta...");
    }
}

// Clase derivada Coche
class Coche extends Transporte {

    private double nivelCombustible;

    public Coche(double nivelCombustible) {
        this.nivelCombustible = nivelCombustible;
    }

    @Override
    public void iniciar() {
        if (nivelCombustible > 0) {
            super.iniciar();
            System.out.println("Encendiendo el motor del coche...");
        } else {
            System.out.println("No se puede iniciar el coche: sin combustible.");
        }
    }
}
