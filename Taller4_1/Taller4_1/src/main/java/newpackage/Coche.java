/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author JABER
 */
public class Coche {
    private String marca;
    private String modelo;
    private double velocidadMaxima;
    
public Coche(String marca, String modelo, double velocidadMaxima){
    this.marca = marca;
    this.modelo = modelo;
    this.velocidadMaxima = velocidadMaxima;
}    

public void acelerar (double incremento){
    if (incremento > 0){
       velocidadMaxima += incremento;
        System.out.println("El carro aceleró, La Velocidad maxima es de: " + velocidadMaxima);
    }else{
        System.out.println("Lo siento, La velocidad debe ser positiva");
    }
}

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }


}
