/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Alimentos;

/**
 *
 * @author JABER
 */
public class Mango extends Alimentos{
 
    public void tipoSabor(){
        System.out.println("EL TIPO DE SABOR DE ESTE ALIMENTO ES DULCE");
    }
    
    @Override
    public void mostrarTipoSabor(){
        System.out.println("EL MANGO ES : ");
        tipoSabor();
    }
    
    
}
