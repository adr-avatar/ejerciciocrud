/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crud;

/**
 *
 * @author adr
 */
public class EliminarCancion {
    public ListaDeCanciones lista;
    
    public EliminarCancion(ListaDeCanciones lista) {
        this.lista = lista;
    }
    
    public void eliminarCancion(int id) {
        boolean eliminado = lista.eliminarCancionPorId(id);
        if (eliminado) {
            System.out.println("Cancion con ID " + id + "eliminada. ");
         } else {
            System.out.println("No se encontro ninguna Cancion con ID " + id + "para eliminadar. ");
        }
    }
    
    
}
