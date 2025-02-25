/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animal;

/**
 *
 * @author JABER
 */
public class Pez extends Animal{
    String tipoDeAgua;
    public Pez(String especie, String tipoDeAgua) {
        super(especie);
        this.tipoDeAgua = tipoDeAgua;
    }
    
    @Override
    public void mostrarEspecie(){
        super.mostrarEspecie();
        System.out.println("EL TIPO DE AGUA ES: " + tipoDeAgua);
    }
    
}
