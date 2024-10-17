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
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Actualiza_Canciones{
    
    public void ActualizarCanciones(Cancion cancionActualizada){
        List<Cancion>canciones=new ArrayList<>();
        //lee el archivo linea por linea//
        try(BufferedReader reader=new BufferedReader(new FileReader(ARCHIVO))){
            String linea;
            //leera linea por linea hasta que esteen vacias//
            while((linea=reader.readLine())!=null){
                Cancion cancion=Cancion.fromString(linea);
                //se verifica si el id es el que se busca//
                if(cancion.getId()==cancionActualizada.getId()){
                    canciones.add(cancionActualizada);
                    //Se agrega a la lista//
                }else{
                    canciones.add(cancion);
                }
            }
        } catch (IOException e){
            System.out.println("Error de lectura"+e.getMessage());
            return;
        }
        //se escribira la cancion actualizada al archivo//
        try(BufferedWriter writer= new BufferedWriter(new FileWriter(ARCHIVO))){
            //Este recorrera toda la lista//
            for(Cancion cancion: canciones){
                //se escribira la cancion//
                writer.write(cancion.toString());
                //es para que la canciones esten separadas//
                writer.newLine();
            }
            System.out.println("La cancion se actualizo");
        } catch (IOException e){
            System.out.println("Erro al actualizar la cancion"+e.getMessage());
      }
    }
}
