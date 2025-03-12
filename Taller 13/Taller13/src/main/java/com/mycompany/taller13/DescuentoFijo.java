/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller13;

/**
 *
 * @author JABER
 */
// Descuento fijo
public class DescuentoFijo extends Descuento {
    private double cantidad;

    public DescuentoFijo(double cantidad) {
        this.cantidad = cantidad;
    }
   
    public double aplicarDescuento(double precio) {
        return Math.max(0, precio - cantidad);
    }

    @Override
    public double usarDescuento(double precio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
