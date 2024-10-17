/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciocrud;

/**
 *
 * @author adr
 */
import static com.mycompany.ejerciciocrud.Crear_Canciones.ARCHIVO;
 // import static ejerciciocrud.Crear_Canciones.ARCHIVO;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Leer_Cancion{


    public Cancion ObtenerCancionesId(int id) {
        try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO))) {
            String linea;
            //lee linias hasta que ya no queden//
            while ((linea = reader.readLine()) != null) {
                //cada linea esun objeto de tipo cancion//
                Cancion cancion = Cancion.fromString(linea);
                //Se compara el id de la cancion que se ingreso//
                if (cancion.getId() == id) {
                    return cancion;
                }
            }
        } catch(IOException e){
            System.out.println("Hubo algun problema");
        }
        return null;
    }

}
