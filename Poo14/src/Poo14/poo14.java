
package Poo14;

import java.lang.*;
import java.io.*;
import java.util.*;


public class poo14 {


    public static void main(String[] args) {
        short centigrados, resultado, Fahrenheit;
        Scanner Teclado = new Scanner(System.in);
        System.out.println("Indique cuantos grados Centigrados desea convertir a Fahrenheit: ");
        centigrados = (short) Teclado.nextDouble();
        Fahrenheit = (short) (32 + (9 * centigrados / 5));

        System.out.println("El resultado es: " + Fahrenheit + " Fahrenheit.");

    }

}
