//Realizar un programa que solo permita introducir solo frases o palabras de 8 de
//largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir
//un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
//imprimir “INCORRECTO”. Nota: investigar la función Length() en Java.

package Poo18;

import java.util.Scanner;


public class Poo18 {

    
    public static void main(String[] args) {
       
        String palabra;
        int numcaracteres=0;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese una palabra: ");
        
        palabra=teclado.nextLine();
        
      numcaracteres=palabra.length();
      
       if (numcaracteres==8) {
           
           System.out.println("Es  correcto");
       } else {
           
           System.out.println("No es correcto");
           
       }
        
        
    }
    
}
