/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nombre;
import java.lang.*;
import java.io.*;
import java.util.*;
import java.util.Scanner;
/**
 *
 * @author Paulina Case
 */
public class Nombre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       String nombre;

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduzca su nombre: ");
        
        nombre = teclado.nextLine();
        
        System.out.println("¡Hola " + nombre + "!");
        
        
        
    }
    
}
