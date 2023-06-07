//Escriba un programa que pida una frase o palabra y valide si la primera letra de esa
//frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por
//pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
//“INCORRECTO”. Nota: investigar la función Substring y equals() de Java.

package Poo16;

import java.util.Scanner;

public class Poo16 {

   
    public static void main(String[] args) {
        
 String palabra, nuevapalabra;
        int numcaracteres=0;
        
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese una palabra: ");
        
        palabra=teclado.nextLine();
        
        numcaracteres=palabra.length();
        
        nuevapalabra=palabra.substring(0,1);
        System.out.println(nuevapalabra);
        
         if (palabra.substring(0,1).equals("A")) {
           
           System.out.println("Es  correcto");
       } else {
           
           System.out.println("No es correcto");
           
       }
       
    }
    
}
