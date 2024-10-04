/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crud;

/**
 *
 * @author adr
 */
public class ActualizarCancion {
    public ListaDeCanciones lista;
    
    public ActualizarCancion(ListaDeCanciones lista){
        this.lista = lista;
    }
    
    public void actualizarCancion(int id, String nuevoNombre, String nuevoArtista, int nuevaFecha) {
        boolean actualizado = lista.actualizarCancionPorId(id, nuevoNombre, nuevoArtista, nuevaFecha);
        if (actualizado) {
            System.out.println("Cancion con ID " + id + " actualizada. ");
        } else {
            System.out.println("No se encontro ninguna cancion con ID " + id + " para actualizar. ");
        }
    }
    
}
