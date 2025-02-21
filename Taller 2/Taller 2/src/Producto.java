/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JABER
 */
public class Producto {
    private String Nombre;
    private double Precio;
    
public Producto (String Nombre, double Precio){
  this.Nombre = Nombre;
  this.Precio = Precio;
}

public void mostrarProducto(){
    System.out.println("Nombre: " + Nombre + ", Precio: " + Precio);
}
}


