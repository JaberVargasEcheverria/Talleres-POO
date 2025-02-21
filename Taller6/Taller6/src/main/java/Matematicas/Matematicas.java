/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matematicas;

/**
 *
 * @author JABER
 */
public class Matematicas {

    public Matematicas() {
    }
    
    
    public static void Suma(double a,double b,double c,double d ){
     double resultado = a + b + c + d;
        System.out.println("El resultado de: " + a + "+" + b + "+" + c + "+" + d + " es: " + resultado);
    }
    
     public static void Multiplicacion(double a,double b,double c,double d ){
     double resultado = a * b * c * d;
       System.out.println("El resultado de: " + a + "*" + b + "*" + c + "*" + d + " es: " + resultado);
    }
     
     public static void Resta(double a,double b,double c,double d ){
     double resultado = a - b - c - d;
       System.out.println("El resultado de: " + a + "-" + b + "-" + c + "-" + d + " es: " + resultado);
    }
     
     public static void Division(double a,double b,double c,double d ){
     double resultado = a / b / c / d;
       System.out.println("El resultado de: " + a + "/" + b + "/" + c + "/" + d + " es: " + resultado);
    }

}
