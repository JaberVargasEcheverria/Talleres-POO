/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller13;

/**
 *
 * @author JABER
 */
public abstract class Mensajero {
    public abstract void enviarMensaje(String destinatario, String mensaje);
}

// Implementación para envío de correos electrónicos
class CorreoElectronico extends Mensajero {
    @Override
    public void enviarMensaje(String destinatario, String mensaje) {
        System.out.println("Enviando correo electrónico a: " + destinatario);
        System.out.println("Mensaje: " + mensaje);
    }
}

// Implementación para envío de mensajes SMS
class MensajeSMS extends Mensajero {
    @Override
    public void enviarMensaje(String destinatario, String mensaje) {
        System.out.println("Enviando SMS a: " + destinatario);
        System.out.println("Mensaje: " + mensaje);
    }
}
