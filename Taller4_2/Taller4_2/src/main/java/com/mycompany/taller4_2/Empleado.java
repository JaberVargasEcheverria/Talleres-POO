/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.taller4_2;

/**
 *
 * @author JABER
 */
class Empleado {

    public String nombre;
    private double salario;
    
Empleado (String nombre, double salario){
    this.nombre = nombre;
    this.salario = salario;
}    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
