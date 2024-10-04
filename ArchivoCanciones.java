/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crud;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import static java.nio.file.Files.write;
import java.util.List;

/**
 *
 * @author adr
 */
public class ArchivoCanciones {
    public String nombreArchivo;
    
    public ArchivoCanciones(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }
    
    public void guardarCanciones(List<Cancion> canciones) {
        try (BufferedWriter writer = new BufferedWriter (new FileWriter(nombreArchivo))) {
            for (Cancion cancion : canciones) {
                writer.write(cancion.getId() + "," + cancion.getNombre() + "," + cancion.getArtista() + "," + cancion.getFecha()                );
                writer.newLine();
            }
        
        System.out.println("Canciones guardadas en " + nombreArchivo);
       } catch (IOException e) {
        System.err.println("Error al guardar las canciones: " + e.getMessage());
}
    
} 
}
