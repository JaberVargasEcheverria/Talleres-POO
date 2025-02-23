/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figura;

/**
 *
 * @author JABER
 */
public class Circulo extends Figura {

    double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        final double PI = 3.14;
        return Math.pow(radio, 2);

    }

    @Override
    public void mostrarArea() {
        System.out.println("EL AREA DEL CIRCULO ES: " + calcularArea());

    }
}
