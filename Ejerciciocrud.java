/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciocrud;

import java.util.Scanner;
/**
 *
 * @author adr
 */
public class Ejerciciocrud {

    public static void main(String[] args) {
        
        
                 
         Scanner scanner = new Scanner(System.in);
        System.out.println("Selecciona la opcion que desees");
        
         int x = scanner.nextInt();
        
        System.out.println("1. Crear");
        System.out.println("2. Leer");
        System.out.println("3. Actualizar");
        System.out.println("4. Eliminar");
        
        switch (x) {
            case 1: 
                System.out.println("Seleccionaste 1");
                CrearCanciones();
                Crear_Canciones.ARCHIVO.
                        
                
                break;
            case 2: 
                System.out.println("Seleccionaste 2");
                break;
            case 3: 
                System.out.println("Seleccionaste 3");
                break;
            case 4: 
                System.out.println("Seleccionaste 4");
                break;
            default: 
                System.out.println("Error. Dato fuera de rango");    
                break;
                
 
                
        }
        
        
        
    }
}
