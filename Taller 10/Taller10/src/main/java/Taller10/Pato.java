/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller10;

/**
 *
 * @author JABER
 */
public class Pato implements Nadador, Volador {

    @Override

    public void nadar() {
        System.out.println("EL ANIMAL ES ACUATICO");
    }
    @Override
    public void volar() {
        System.out.println("EL ANIMAL ES AEREO");
    }

}
