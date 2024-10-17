/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciocrud;

/**
 *
 * @author adr
 */
public class Cancion {

    static void fromString(int idCrear) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
    
    private int id ;
    private String nombreCancion;
    private String autorCancion;

    public Cancion(int id, String nombreCancion, String autorCancion) {
        this.id = id;
        this.nombreCancion = nombreCancion;
        this.autorCancion = autorCancion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreCancion() {
        return nombreCancion;
    }

    public void setNombreCancion(String nombreCancion) {
        this.nombreCancion = nombreCancion;
    }

    public String getAutorCancion() {
        return autorCancion;
    }

    public void setAutorCancion(String autorCancion) {
        this.autorCancion = autorCancion;
    }

    @Override
    public String toString() {
        return "Cancion{" + "id=" + id + ", nombreCancion=" + nombreCancion + ", autorCancion=" + autorCancion + '}';
    }
    
    //se instancia la cadena para crear un objeto de clase cancion deonde este lee el archivo donde cada dato esta separado por partes//
    public static Cancion fromString(String data) {
    // Separa la cadena en partes usando un delimitador (por ejemplo, coma)
    String[] parte = data.split(",");
   
    int id = Integer.parseInt(parte[0]); 
    String nombre = parte[1];
    String artista = parte[2];
    
    return new Cancion(id, nombre, artista);
}
    
}
