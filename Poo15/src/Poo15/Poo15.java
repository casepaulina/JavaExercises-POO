
package Poo15;
import java.lang.*;
import java.util.Scanner;

public class Poo15 {


    public static void main(String[] args) {
        
        String frase;

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduzca una frase: ");
        
         frase = teclado.nextLine();
         
         System.out.println("Mayuscula: "+frase.toUpperCase());
        
         System.out.println("Minuscula: "+frase.toLowerCase());
    }
    
}
