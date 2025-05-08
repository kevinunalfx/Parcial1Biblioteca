/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bibliotecaunal;

/**
 *
 * @author estudiante
 */
public class   Libro {
        String titulo;
        String autor;
        String categoria;

        Libro(String titulo, String autor, String categoria) {
            this.titulo = titulo;
            this.autor = autor;
            this.categoria = categoria;
        }

        @Override
        public String toString() {
            return "Título: " + titulo + ", Autor: " + autor + ", Categoría: " + categoria;
        }
    }