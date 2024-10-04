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
    private List <Cancion> canciones;
    
    public ListaDeCanciones() {
        canciones = new ArrayList<>();
    }
    
    public void agregarCancion(int id,String nombre,String artista, int fecha) {
        Cancion nuevaCancion = Cancion(id, nombre, artista, fecha);
        canciones.add(nuevaCancion);
    }
    
    public void mostrarCanciones() {
         for (Cancion cancion : canciones) {
             System.out.println(cancion);
         }
    }
    
}
