/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bibliotecaunal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.*;
/**
 *
 * @author estudiante
 */
public class Biblioteca {
static List<Libro> libros = new ArrayList<>();
    static List<Usuario> usuarios = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static List<String> categorias = Arrays.asList("Ciencia", "Literatura", "Ingeniería");

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer
            switch (opcion) {
                case 1 -> registrarLibro();
                case 2 -> registrarUsuario();
                case 3 -> mostrarLibros();
                case 4 -> mostrarUsuarios();
                case 0 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }

    static void mostrarMenu() {
        System.out.println("\n--- Menú de Biblioteca ---");
        System.out.println("1. Registrar nuevo libro");
        System.out.println("2. Registrar nuevo usuario");
        System.out.println("3. Mostrar libros");
        System.out.println("4. Mostrar usuarios");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    static void registrarLibro() {
        System.out.print("Ingrese el título del libro: ");
        String titulo = scanner.nextLine();
        System.out.print("Ingrese el autor del libro: ");
        String autor = scanner.nextLine();

        System.out.println("Seleccione la categoría:");
        for (int i = 0; i < categorias.size(); i++) {
            System.out.println((i + 1) + ". " + categorias.get(i));
        }

        int catIndex = scanner.nextInt();
        scanner.nextLine(); // limpiar buffer

        if (catIndex < 1 || catIndex > categorias.size()) {
            System.out.println("Categoría inválida.");
            return;
        }

        String categoria = categorias.get(catIndex - 1);
        libros.add(new Libro(titulo, autor, categoria));
        System.out.println("Libro registrado con éxito.");
    }

    static void registrarUsuario() {
        System.out.print("Ingrese el nombre del usuario: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el ID del usuario: ");
        String id = scanner.nextLine();

        usuarios.add(new Usuario(nombre, id));
        System.out.println("Usuario registrado con éxito.");
    }

    static void mostrarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros registrados.");
            return;
        }

        System.out.println("\n--- Lista de Libros ---");
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }

    static void mostrarUsuarios() {
        if (usuarios.isEmpty()) {
            System.out.println("No hay usuarios registrados.");
            return;
        }

        System.out.println("\n--- Lista de Usuarios ---");
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
    }
}