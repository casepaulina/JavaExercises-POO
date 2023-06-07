/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5funcionmath;
import java.lang.*;
import java.io.*;
import java.util.*;
/**
 *
 * @author Paulina Case
 */
public class Ejercicio5FuncionMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double numero, doble, triple, raiz;
       
       Scanner teclado = new Scanner (System.in);
       
       System.out.println("Escriba un numero: ");
       numero=teclado.nextDouble();
       
       doble=numero*2;
       triple=numero*3;
      raiz=Math.sqrt(numero);
      
      System.out.println("El doble de "+numero+" es: "+doble);
      
      System.out.println("El triple de "+numero+" es: "+triple);
      
       System.out.println("La raiz cuadrada de  "+numero+" es: "+raiz);
      
    }
    
}
