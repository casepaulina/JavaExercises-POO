
package Poo20;

import java.util.Scanner;


public class Poo20 {

    
 public static boolean esPar(int numero) {
    if (numero % 2 == 0) {
        return true;
    } else {
        return false;
    }
}
 public static void main(String[] args) {
        int numero;
        Scanner teclado = new Scanner (System.in);
       System.out.println("Escriba un numero: ");
       numero=teclado.nextInt();
        if (esPar(numero)) {
            System.out.println("Sí es par");
        } else {
            System.out.println("No es par");
        }
    }
}





//int numero;
       