/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller9_1;


/**
 *
 * @author JABER
 */
public class Animal implements Nadador , Volador{
    @Override
    
   public void nadar(){
        System.out.println("EL ANIMAL ES ACUATICO");
   }
   
   public void volar(){
       System.out.println("EL ANIMAL ES AEREO");
   }
}
