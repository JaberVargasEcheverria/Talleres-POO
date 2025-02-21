/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculos;

/**
 *
 * @author JABER
 */

public class PruebaVehiculo {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Carro", "Mazda");
       // Moto moto = new Moto("YAMAHA", 660);

        // Esto generará errores de compilación porque tipo y marca son protected
        // System.out.println(vehiculo.tipo);
        // System.out.println(moto.marca);

        vehiculo.mostrarInfoVehiculo();
        //moto.mostrarInfoMoto();
    }
}