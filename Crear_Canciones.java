/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciocrud;

/**
 *
 * @author adr
 */
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileWriter;

public class Crear_Canciones {

    // Definicion de una varable contante y de la ruta o nombre del archivo que se van a leer //
    static final String ARCHIVO= "Canciones.txt";

    public void CrearCanciones(Cancion cancion) {
        //El try es para cerrar el flujo automaticamente//
        try (BufferedWriter Writer = new BufferedWriter(new FileWriter(ARCHIVO, true))) {
            Writer.write(cancion.toString());
            Writer.newLine();
            System.out.println("Se creo la cancion");
            //el catch es para cuando ocurrar un error al leer o crear el archivo//
        } catch (IOException e) {
            System.out.println("Hubo algun problema al crear la cancion");
        }
    }
}