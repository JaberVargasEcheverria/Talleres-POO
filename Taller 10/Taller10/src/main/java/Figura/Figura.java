/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Figura;

/**
 *
 * @author JABER
 */
public abstract class Figura {

    public abstract double calcularArea();

    public void mostrarArea() {
        System.out.println("EL AREA ES: " + calcularArea());
    }
}
