/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.taller12;

/**
 *
 * @author JABER
 */
public class Libro {

    private String titulo;
    private String autor;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // Clase para gestionar la persistencia de libros
    class GestorLibros {

        public void guardarLibro(Libro libro) {
            System.out.println("Guardando el libro en la base de datos: " + libro);
        }

    }

    // Clase para generar reportes de libros
    class ReporteLibros {

        public void generarReporte(Libro libro) {
            System.out.println("Generando reporte para el libro: " + libro);
        }
    }
}
