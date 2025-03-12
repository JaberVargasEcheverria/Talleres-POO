/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller14;

/**
 *
 * @author JABER
 */
abstract class CuentaBancaria {

    protected double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        }
    }

    public abstract boolean retirar(double monto);

    public double getSaldo() {
        return saldo;
    }

    public void mostrarInfo() {
        System.out.println("La cuenta bancaria tiene " + saldo);
    }

}

// Clase derivada CuentaAhorros
class CuentaAhorros extends CuentaBancaria {

    public CuentaAhorros(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public boolean retirar(double monto) {
        if (monto > 0 && saldo >= monto) {
            saldo -= monto;
            return true;
        }
        return false;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("El saldo es" + saldo);

    }

}
