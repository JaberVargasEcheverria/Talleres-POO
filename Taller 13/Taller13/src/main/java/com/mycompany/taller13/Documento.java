/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller13;

/**
 *
 * @author JABER
 */
public abstract class Documento {

    public abstract void exportar();

}

class DocumentoWord extends Documento {

    @Override
    public void exportar() {
        System.out.println("Exportando documento a formato Word...");
    }
}
