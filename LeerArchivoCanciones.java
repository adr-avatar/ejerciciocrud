/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crud;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adr
 */
public class LeerArchivoCanciones {
 private String nombreArchivo;
 
 public LeerArchivoCanciones(String nombreArchivo) {
     this.nombreArchivo = nombreArchivo;
 }
 
 public List<Cancion> leerCanciones() {
     List<Cancion> canciones = new ArrayList<>();
     try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
         String linea;
         while ((linea = reader.readLine()) != null) {
             String[] partes = linea.split(",");
             if (partes.length == 4) {
                 int id = Integer.parseInt(partes[0].trim());
                 String nombre = partes[1].trim();
                 String artista = partes[2].trim();
                 int fecha = Integer.parseInt(partes[3].trim());
                 canciones.add(new Cancion(id, nombre, artista, fecha));
             }
         }
 }   catch (IOException e) {
     System.err.println("Error al leer las canciones: " + e.getMessage());
 }
 return canciones; 
 
 }
    
    
    
}
