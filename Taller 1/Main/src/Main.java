/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JABER
 */

import java.io.IOException;
import java.util.Scanner;
public class Main {
   public static void main (String[]args){
       Scanner read = new Scanner(System.in);
       Scanner read2 = new Scanner(System.in);
       
     System.out.println("|| INGRESE LOS DATOS DEL ESTUDIANTE|| ");
     
     System.out.println("Nombre del Estudiante: ");
     String nombre = read.nextLine();
     System.out.println("Edad de "  + nombre + ": " );
     int edad = read.nextInt();
     System.out.println("Curso: " );
     String curso = read2.nextLine();
     Estudiante estudiante = new Estudiante(nombre,edad,curso);
     
     System.out.println("----------------------------------");
       
     System.out.println("|| DATOS FINANCIEROS ||");
     System.out.println("Numero de cuenta: ");
     String Numcuenta = read2.nextLine();
     System.out.println("Saldo actual: ");
     double saldoCuenta = read.nextDouble();
     System.out.println("Tipo de cuenta: ");
     String TipoCuenta = read2.nextLine();
     CuentaBancaria cuentaB = new CuentaBancaria();

    System.out.println("---------------------------------");
    System.out.println("||    LIBRO   ||");
    Libro libro = new Libro();
    System.out.println(libro);
     
   
   }
   
}
