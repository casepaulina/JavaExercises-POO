
package Poo19;
import java.lang.*;
import java.util.Scanner;

public class Poo19 {

     
 public static boolean eureka(String frase) {
    if ("eureka".equals(frase)) {
        return true;
    } else {
        return false;
    }
}
 public static void main(String[] args) {
        String frase;
        
        Scanner teclado = new Scanner (System.in);
        
       System.out.println("Ingrese una frase: ");
       
        frase = teclado.nextLine();
       
        if ("eureka".equals(frase)) {
            
            System.out.println("Es correcto");
            
        } else {
            
            System.out.println("No es correcto");
        }
    }  
   
             
   
    
}
