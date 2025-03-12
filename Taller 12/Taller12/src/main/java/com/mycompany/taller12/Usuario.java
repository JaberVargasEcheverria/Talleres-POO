/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller12;

/**
 *
 * @author JABER
 */
public class Usuario {

    private String nombreUsuario;
    private String contraseña;

    public Usuario(String nombreUsuario, String contraseña) {
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
   // clase para validar crendenciales
    public class validarLogin {

        public boolean validarUser(Usuario usuario) {
            return usuario.getNombreUsuario() != null && !usuario.getContraseña().isEmpty()
                    && usuario.getContraseña() != null && usuario.getContraseña().length() >= 1;
        }
    }

    // Clase para manejar la autenticación de usuarios
    class Autenticador {

        public boolean autenticar(Usuario usuario, String contraseñaIngresada) {
            return usuario.getContraseña().equals(contraseñaIngresada);
        }
    }
}
