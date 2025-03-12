/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taller16;

/**
 *
 * @author JABER
 */
// Interfaz para el servicio de autenticación
interface ServicioAutenticacion {
    boolean autenticar(String usuario, String contraseña);
}

// Implementación de autenticación local
class AutenticacionLocal implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String contraseña) {
        System.out.println("Autenticando usuario " + usuario + " mediante autenticación local.");
        return "usuario123".equals(usuario) && "password123".equals(contraseña);
    }
}

// Implementación de autenticación mediante OAuth
class AutenticacionOAuth implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String contraseña) {
        System.out.println("Autenticando usuario " + usuario + " mediante OAuth.");
        return usuario.startsWith("oauth_");
        // El método .startsWith("oauth_") en Java verifica si una cadena de texto (String) comienza con un prefijo específico.
    }


// Clase que gestiona la autenticación
class GestorAutenticacion {
    private ServicioAutenticacion servicioAutenticacion;

    public GestorAutenticacion(ServicioAutenticacion servicioAutenticacion) {
        this.servicioAutenticacion = servicioAutenticacion;
    }

    public void iniciarSesion(String usuario, String contraseña) {
        if (servicioAutenticacion.autenticar(usuario, contraseña)) {
            System.out.println("Autenticación exitosa para el usuario: " + usuario);
        } else {
             System.out.println("Error de autenticación para el usuario: " + usuario);
        }
            System.out.println("Error de autenticación para el usuario: " + usuario);
        }
    }
}

