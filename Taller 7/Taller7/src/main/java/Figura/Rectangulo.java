/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figura;

/**
 *
 * @author JABER
 */
public abstract class Rectangulo extends Figura {

    double base;
    double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public double calcularArea(){
        
        return base * altura;
    }
    @Override
     public void mostrarArea() {
        System.out.println("EL AREA DEL RECTANGULO ES: " + calcularArea());

    }
}
