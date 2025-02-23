/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleado;

/**
 *
 * @author JABER
 */
public abstract class Gerente extends Empleado {

    int numHoras;
    double precioHora;

    public Gerente(int numHoras, double precioHoras) {
        this.numHoras = numHoras;
        this.precioHora = precioHora;
    }

    public double calcularSalario(){
        return numHoras * precioHora;
    }
    @Override
     public void mostrarDetalles(){
        System.out.println("El SALARIO TOTAL DE GERENTE ES: " + calcularSalario());
}

    
}
