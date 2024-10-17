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
//import static ejerciciocrud.Crear_Canciones.ARCHIVO;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Eliminar_Cancion {
    
    public void EliminacionDeCancion(int id){
        List<Cancion>canciones=new ArrayList<>();
        
        try(BufferedReader reader=new BufferedReader(new FileReader(ARCHIVO))){
         //se leeen linea por linea hasta que no haya mas o sea nulo//
            String linea;
          while ((linea=reader.readLine())!=null){
           Cancion cancion= Cancion.fromString(linea);
           if(cancion.getId()!=id){
               canciones.add(cancion);
           }
          }
        }catch(IOException e){
            System.out.println("Error de lectura"+e.getMessage());
            return;
        }
        //se abrirra el archivo donde va a editar el contenido//
        try(BufferedWriter writer=new BufferedWriter(new FileWriter(ARCHIVO))){
           //se reconoce la lista de canciones//
            for(Cancion cancion:canciones){
                writer.write(cancion.toString());
                writer.newLine();
            }
            System.out.println("La cancion se elimino");
    }catch(IOException e){
            System.out.println("No se elimino "+e.getMessage());
    }
}
}