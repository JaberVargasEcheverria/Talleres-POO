/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculos;

/**
 *
 * @author JABER
 */
public class Moto extends Vehiculo {
  private String cilindrada;
  
public Moto(String tipo, String marca, String cilindrada){
    super(tipo, marca);
    this.cilindrada = cilindrada;
}  

public void mostrarInfoMoto(){
    System.out.println("Tipo: " + tipo);
    System.out.println("Marca: " + marca);
    System.out.println("Cilindraje: " + cilindrada);
}
}
