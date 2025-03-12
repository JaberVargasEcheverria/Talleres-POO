/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller16;

/**
 *
 * @author JABER
 */
// Interfaz para generar reportes
interface GeneradorReporte {
    void generarReporte(String datos);
}

// Implementación de generación de reportes en PDF
class ReportePDF implements GeneradorReporte {
    @Override
    public void generarReporte(String datos) {
        System.out.println("Generando reporte PDF con datos: " + datos);
    }
}

// Implementación de generación de reportes en Excel
class ReporteExcel implements GeneradorReporte {
    @Override
    public void generarReporte(String datos) {
        System.out.println("Generando reporte Excel con datos: " + datos);
    }
}

// Clase que gestiona la generación de reportes
class GestorReportes {
    private GeneradorReporte generadorReporte;

    public GestorReportes(GeneradorReporte generadorReporte) {
        this.generadorReporte = generadorReporte;
    }

    public void generar(String datos) {
        generadorReporte.generarReporte(datos);
    }
}

