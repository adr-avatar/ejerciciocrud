/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.crud;

/**
 *
 * @author adr
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Crud {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ListaDeCanciones lista = new ListaDeCanciones();
        ArchivoCanciones archivo = new ArchivoCanciones("canciones.txt");
        int id, menu, menuOp;
        id = 0;
        
        
        do {
        
        System.out.println("Selecciones una opcion ");
        System.out.println("1. Crear un registro");
        System.out.println("2. Leer un registro");
        System.out.println("3. Actualizar un registro");
        System.out.println("4. Borrar un registro");
        System.out.println("5. Mostrar todos los registros");
        System.out.println("0. Salir");
         menuOp = scanner.nextInt();
        
        switch (menuOp) {
          case 1: 
        /*idc = idc + 1; */
        
        scanner.nextLine();
        System.out.println("Ingrese el nombre de la cancion: ");
        String nombre = scanner.nextLine();
                
        
        System.out.println("Ingrese el nombre del artista: ");
        String artista = scanner.nextLine();
        
        System.out.println("Ingrese el año de la cancion: ");
        int fecha = scanner.nextInt();
        
        
       /* Cancion crearCancion = new Cancion(id, capturarCancion, capturarArtista,capturarFecha);*/
        lista.agregarCancion(id,nombre,artista,fecha);        
        
        archivo.guardarCanciones(lista.obtenerCanciones());
       /* System.out.println(crearCancion.id + " " +crearCancion.nombre + " " + crearCancion.artista + " " + crearCancion.fecha); */
        id++;
        break;
          case 2:
               System.out.println("Opcion 2 Leer un Registro. Ingrese el numero ID");
               int idBuscado = scanner.nextInt();
               Cancion cancionEncontrada = lista.buscarCancionPorId(idBuscado);
               
               if (cancionEncontrada != null) {                   
              System.out.println("Cancion encontrada: " + cancionEncontrada);
          } else {
                   System.out.println("No se encuentro la cancion con ID " + idBuscado);
               }
   
   /*LeerArchivoCanciones lector = new LeerArchivoCanciones("canciones.txt");
   List<Cancion> cancionesLeidas = lector.leerCanciones();
               
         System.out.println("Lista de canciones leidas desde el archivo");
         for (Cancion cancion : cancionesLeidas) {
          System.out.println(cancion);    
         } */
         
   
        break;
    case 3:
        System.out.println("Opcion 3 - actualizar. Ingrese el ID de la cancion a modificar");  
        int idActualizar = scanner.nextInt();
        scanner.nextLine();
        
         System.out.println("Ingrese el Nuevo Nombre de la cancion: ");
        String nuevoNombre = scanner.nextLine();
                
        
        System.out.println("Ingrese el Nuevo nombre del artista: ");
        String nuevoArtista = scanner.nextLine();
        
        System.out.println("Ingrese el Nuevo año de la cancion: ");
        int nuevafecha = scanner.nextInt();
        
        ActualizarCancion actualizar = new ActualizarCancion(lista);
        actualizar.actualizarCancion(id, nuevoNombre, nuevoArtista, nuevafecha);
        
        System.out.println("La lista actualizada queda de la siguiente manera");  
        lista.mostrarCanciones();
        
        break;
        
    case 4:
        System.out.println("Opcion 4  - eliminar un registro");  
        int idEliminar = scanner.nextInt();
        EliminarCancion eliminar = new EliminarCancion(lista);
        eliminar.eliminarCancion(idEliminar);
        
        System.out.println("La lista actualizada queda de la siguiente manera");  
        lista.mostrarCanciones();
        break;
        
    case 5:
        System.out.println("Opcion 5 - Mostrar todos los registros ");  
 LeerArchivoCanciones lector = new LeerArchivoCanciones("canciones.txt");
   List<Cancion> cancionesLeidas = lector.leerCanciones();
               
         System.out.println("Lista de canciones leidas desde el archivo");
         for (Cancion cancion : cancionesLeidas) {
          System.out.println(cancion);    
         }
        break;    
    default:
        System.out.println("Opcion inválida");
        
        }
        
  //      System.out.println("Lista de canciones");
  //      lista.mostrarCanciones();
        } while(menuOp != 0);
        
       
    }
}
