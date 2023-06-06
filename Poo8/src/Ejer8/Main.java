//En el main se creará el objeto y se le pedirá al usuario que ingrese
//una frase que puede ser una palabra o varias palabras separadas por un espacio en
//blanco y a través de los métodos set, se guardará la frase y la longitud de manera
//automática según la longitud de la frase ingresada.
package Ejer8;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        Cadena cade = new Cadena();

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un frase ");

        String frase = leer.nextLine();

        cade.mostrarVocales();

    }

}
