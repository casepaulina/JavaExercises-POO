/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma;
import java.lang.*;
import java.io.*;
import java.util.*;




/**
 *
 * @author Paulina Case
 */
public class Suma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double num1, num2, resultado;
       Scanner Teclado = new Scanner (System.in);
        
       System.out.println("Escriba el primer numero");
        num1=Teclado.nextDouble();
        
       System.out.println("Escriba el segundo numero");
        num2=Teclado.nextDouble();
        
        resultado=num1+num2;
        
       System.out.println("El resultado es: "+resultado);
        
        
    }
    
}
