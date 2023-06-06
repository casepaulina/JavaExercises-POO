//Considera que estás desarrollando una web para una empresa que fabrica motores
//(suponemos que se trata del tipo de motor de una bomba para mover fluidos).
//Definir una variable tipoMotor y permitir que el usuario ingrese un valor entre 1 y 4.
//El programa debe mostrar lo siguiente:
//Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una
//bomba de agua”.
//Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una
//bomba de gasolina”.
//Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una
//bomba de hormigón”.
//Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una
//bomba de pasta alimenticia”.
//Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No
//existe un valor válido para tipo de bomba”

package ejer11menu;

import java.util.Scanner;


public class Ejer11Menu {

   
    public static void main(String[] args) {
        
        int tipoMotor;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese un valor entre 1 y 4: ");
        
        tipoMotor =(int) teclado.nextDouble();
        
        
  
         if (tipoMotor==1) {
           
           System.out.println("La bomba es una bomba de agua");
       } ;
                 
        if (tipoMotor==2) {
           
           System.out.println("La bomba es una bomba de gasolina");
       } ;
       
        if (tipoMotor==3) {
           
           System.out.println("La bomba es una bomba de hormigón");
       } ;
       
         if (tipoMotor==4) {
           
           System.out.println("La bomba es una bomba de pasta alimenticia");
       } ;
       
       if (tipoMotor<1 || tipoMotor >4 ) {
           
           System.out.println("No existe un valor válido para tipo de bomba");
       } ;
       
       
       }
    
    
        
    }
    
