//Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
//solicite números al usuario hasta que la suma de los números introducidos supere el
//límite inicial.

package Poo13;

import java.util.Scanner;


public class Poo13 {

    
    public static void main(String[] args) {
        
        int valorLimite =10;
        int numero;
        Scanner teclado=new Scanner(System.in);
        int suma = 0;
        
        do{
         System.out.println("Limite positivo = 10. Ingrese un numero: ");
        
        numero =(int) teclado.nextDouble();
         suma=suma+numero;
        
        } while(suma<valorLimite);
        System.out.println("Limite alcanzado");
        
       
    }
    
}
