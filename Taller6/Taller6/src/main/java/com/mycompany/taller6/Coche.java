/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taller6;

/**
 *
 * @author JABER
 */
public class Coche {
 private String marca;
 private String modelo;
 static private int contadorCoches;
 
public Coche(String marca, String modelo){
    this.marca = marca;
    this.modelo = modelo;
    contadorCoches++ ;
} 

public static void  mostrarCoches(){
   System.out.println("Coches Creados: " + contadorCoches);
}
}

