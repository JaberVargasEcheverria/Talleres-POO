/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller15;

/**
 *
 * @author JABER
 */
public interface OperacionBancaria {
    public void Transferencia(String cuentaDestino, double monto);
    public void Retiros (double monto);
    public void pagoFacturas (double monto, String empresa);
  
    
}
// Clase específica para transferencias
class ServicioTransferencia implements OperacionBancaria {
    @Override
    public void Transferencia(String cuentaDestino, double monto) {
        System.out.println("Servicio de transferencia: Transferencia de " + monto + " a " + cuentaDestino + " realizada.");
    }

    @Override
    public void Retiros(double monto) {
        throw new UnsupportedOperationException("Operación no soportada en este servicio.");
    }

    @Override
    public void pagoFacturas(double monto, String empresa) {
        throw new UnsupportedOperationException("Operación no soportada en este servicio.");
    }

    
}

// Clase específica para retiros
class ServicioRetiro implements OperacionBancaria {
    @Override
    public void Retiros(double monto) {
        System.out.println("Servicio de retiro: Retiro de " + monto + " realizado.");
    }

    @Override
    public void Transferencia(String cuentaDestino, double monto) {
        throw new UnsupportedOperationException("Operación no soportada en este servicio.");
    }

    @Override
    public void pagoFacturas(double monto, String empresa) {
        throw new UnsupportedOperationException("Operación no soportada en este servicio.");
    }
}

// Clase específica para pagos de facturas
class ServicioPagoFactura implements OperacionBancaria {
    @Override
    public void pagoFacturas(double monto, String empresa) {
        
    }

    @Override
    public void Transferencia(String cuentaDestino, double monto) {
       
    }

    @Override
    public void Retiros(double monto) {
        
    }
}

