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
   /*            int idregistro = scanner.nextInt();               
               int idsolicitado = idregistro; */
/*              System.out.println(idsolicitado + " " +crearCancion.nombre + " " + crearCancion.artista + " " + crearCancion.fecha);       */
        break;
    case 3:
        System.out.println("Opcion 3");  

        break;
    default:
        System.out.println("Opcion inválida");
        
        }
        
        System.out.println("Lista de canciones");
        lista.mostrarCanciones();
        } while(menuOp != 0);
        
    }
}
