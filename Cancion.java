/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crud;

/**
 *
 * @author adr
 */
public class Cancion {
    public int id, fecha;
    public String nombre,artista;
            
    public Cancion (int id,String nombre,String artista, int fecha) {
        this.id = id;
        this.nombre = nombre;
        this.artista = artista;
        this.fecha = fecha;        
    }        

    public int getId() {
        return id;
    }

    public int getFecha() {
        return fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }
         
    @Override
    public String toString() {
        return "ID: " + id + "Titulo: " + nombre + "Artista: " + artista + "Fecha: " + fecha;
    }
    
    
}
