/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author JABER
 */
public class PruebaCuentaBancaria {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("1234567890", 1000.0, "Ahorros");

        // Esto generará un error de compilación porque numeroCuenta es privado
        // System.out.println(cuenta.numeroCuenta);

        cuenta.mostrarDetalles();
    }
}
