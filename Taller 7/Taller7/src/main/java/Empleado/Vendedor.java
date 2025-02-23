/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleado;

/**
 *
 * @author JABER
 */
public abstract class Vendedor {

    int numeroVentas;
    double precioProducto;

    public Vendedor(int numeroVentas, double precioProducto) {
        this.numeroVentas = numeroVentas;
        this.precioProducto = precioProducto;
    }

    public double calcularSalario() {

        return numeroVentas * precioProducto;

    }

   
    public void mostrarDetalles() {
        System.out.println("SALARIO TOTAL DEL VENDEDOR ES: " + calcularSalario());
    }
}
