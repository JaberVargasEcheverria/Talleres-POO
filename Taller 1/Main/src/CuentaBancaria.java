/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JABER
 */
public class CuentaBancaria {
    String numeroCuenta;
    double saldo;
    String tipoCuenta;
    
    //CONSTRUCTOR POR DEFECTO 
    public CuentaBancaria(){
    this.numeroCuenta =  "100548356";
    }
    
    //CONSTRUCTOR CON DOS PARAMETROS
    public CuentaBancaria(String numeroCuenta, double saldo){
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }
    
    //CONSTRUCTOR SOBRECARGADO
    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta){
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }
    ///////////////////////////////////////////////////////////////////////////
      // Getters
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }
    ///////////////////////////////////////////////////////////////////////////
    // Setters
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }
    
    @Override
    public String toString(){
        return "Numero de cuenta" + numeroCuenta + "Saldo" + saldo + "Tipo de cuenta" + tipoCuenta;
    }
}


