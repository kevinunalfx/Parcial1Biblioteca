/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bibliotecaunal;

/**
 *
 * @author estudiante
 */

public class Usuario {
        String nombre;
        String id;

        Usuario(String nombre, String id) {
            this.nombre = nombre;
            this.id = id;
        }

        @Override
        public String toString() {
            return "Nombre: " + nombre + ", ID: " + id;
        }
    }
