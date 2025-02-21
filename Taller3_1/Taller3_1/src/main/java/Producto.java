/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JABER
 */
 class Producto {
  String nombre;
  double precio;
  String stock;

  Producto(String nombre, double precio, String stock){
      this.nombre = nombre;
      this.precio = precio;
      this.stock = stock;
  }
  
  void mostrarInformacion(String nombre, double precio, String stock){
      System.out.println("Nombre: " + nombre + "Precio: " + precio + "Stock: " + stock);
  }
}


