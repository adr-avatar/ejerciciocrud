/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crud;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adr
 */
public class ListaDeCanciones {
    public List<Cancion> canciones;
    
    public ListaDeCanciones() {
        canciones = new ArrayList<>();
    }
    
    public void agregarCancion(int id,String nombre,String artista, int fecha) {
        Cancion nuevaCancion =  new Cancion(id, nombre, artista, fecha);
        canciones.add(nuevaCancion);
    }
    
    public List<Cancion> obtenerCanciones() {
        return canciones;
    }
    
    public Cancion buscarCancionPorId(int id) {
         for (Cancion cancion : canciones) {
             if (cancion.getId() == id) {
                 return cancion;
             }
         }
         return null;
    }
    
    public boolean eliminarCancionPorId(int id) {
        return canciones.removeIf(cancion -> cancion.getId() == id);
    }
    
    public boolean actualizarCancionPorId(int id, String nuevoNombre, String nuevoArtista, int nuevaFecha) {
        Cancion cancion = buscarCancionPorId(id);
        if (cancion != null) {
            canciones.remove(cancion);
            canciones.add(new Cancion(id,nuevoNombre,nuevoArtista, nuevaFecha));
            
          /*cancion = new Cancion(id, nuevoNombre, nuevoArtista, nuevaFecha);*/
           return true;
        }
return false;
    }
    
    public void mostrarCanciones() {
         for (Cancion cancion : canciones) {
             System.out.println(cancion);
         }
    }
    
}
