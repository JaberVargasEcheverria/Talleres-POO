/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Vehiculo;

/**
 *
 * @author JABER
 */
public class Vehiculo {

    protected String marca;
    protected double velocidadMaxima;

    public Vehiculo(String marca, double velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }
    public void mostrarInformacion(){
        System.out.println("LA INFORMACION DEL VEHICULO ES: " + marca + velocidadMaxima);
    }

}
