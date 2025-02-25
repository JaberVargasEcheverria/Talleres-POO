/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller;

/**
 *
 * @author JABER
 */
public class Persona implements Hablador, Trabajador {

    @Override
    public void hablar() {
        System.out.println("LA PERSONA ESTA HABLANDO");
    }

    @Override
    public void trabajar() {
        System.out.println("LA PERSONA ESTA TRABAJANDO");
    }

}
