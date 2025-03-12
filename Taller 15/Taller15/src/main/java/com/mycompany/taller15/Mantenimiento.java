/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taller15;

/**
 *
 * @author JABER
 */
public interface Mantenimiento {
 public void Reparaciones();
 public void Limpieza();
   
}

class tecnicoReparacion implements Mantenimiento{

    @Override
    public void Reparaciones() {
        System.out.println("El tecnico esta reparando este objeto");
    }

    @Override
    public void Limpieza() {
       // Vacio porque el tecnico de reparacion no hace limpieza
    }
    
}

class personalLimpieza implements Mantenimiento{
    @Override
    public void Reparaciones() {
   // Vacio porque el personal de limpieza no hace reparaciones
    }

    @Override
    public void Limpieza() {
         System.out.println("El personal de limpieza esta objeto");
       
    }
}
