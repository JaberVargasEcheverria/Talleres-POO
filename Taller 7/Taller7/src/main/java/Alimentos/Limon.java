/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Alimentos;

/**
 *
 * @author JABER
 */
public class Limon extends Alimentos{
    public void tipoSabor(){
        System.out.println("ESTE ALIMENTO ES DE SABOR ACIDO");
    }
    
    @Override
    public void mostrarTipoSabor(){
        System.out.println("EL LIMON ES DE: ");
        tipoSabor();
    }
    
}
