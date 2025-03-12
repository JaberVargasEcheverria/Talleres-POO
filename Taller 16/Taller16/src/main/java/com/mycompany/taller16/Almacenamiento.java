/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller16;

/**
 *
 * @author JABER
 */
// Interfaz para almacenamiento de archivos
interface Almacenamiento {
    void guardarArchivo(String nombre, String contenido);
    String recuperarArchivo(String nombre);
}

// Implementación de almacenamiento local
class AlmacenamientoLocal implements Almacenamiento {
    @Override
    public void guardarArchivo(String nombre, String contenido) {
        System.out.println("Archivo " + nombre + " guardado localmente.");
    }

    @Override
    public String recuperarArchivo(String nombre) {
        return "Contenido del archivo " + nombre + " desde almacenamiento local.";
    }
}

// Implementación de almacenamiento en la nube
class AlmacenamientoNube implements Almacenamiento {
    @Override
    public void guardarArchivo(String nombre, String contenido) {
        System.out.println("Archivo " + nombre + " guardado en la nube.");
    }

    @Override
    public String recuperarArchivo(String nombre) {
        return "Contenido del archivo " + nombre + " desde almacenamiento en la nube.";
    }
}

// Clase que gestiona los archivos usando almacenamiento
class GestorArchivos {
    private Almacenamiento almacenamiento;

    public GestorArchivos(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void guardar(String nombre, String contenido) {
        almacenamiento.guardarArchivo(nombre, contenido);
    }

    public void recuperar(String nombre) {
        System.out.println(almacenamiento.recuperarArchivo(nombre));
    }
}

