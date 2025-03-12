/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller12;

/**
 *
 * @author JABER
 */
public class Producto {

    private String nombreProducto;
    private double precio;
    private double impuestos;

    public Producto(String nombreProducto, double precio, double impuestos) {
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.impuestos = impuestos;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getImpuestos() {
        return impuestos;
    }

    public void setImpuestos(double impuestos) {
        this.impuestos = impuestos;
    }

    public class calcularPrecio {

        public double calculasPrecioProducto(Producto producto) {
            return producto.getPrecio() + (producto.getPrecio() * producto.getImpuestos());
        }
    }

    public class GenerarEtiqueta {

        public void generarEtiqueta(Producto producto) {
            System.out.println("La etiquet del producto: " + producto.getNombreProducto()
                    + " | Precio Inical: $" + producto.getPrecio());
        }
    }
}
