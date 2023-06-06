//Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
//Autor, Número de páginas, y un constructor con todos los atributos pasados por
//parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
//datos al usuario y luego informar mediante otro método el número de ISBN, el título,
//el autor del libro y el numero de páginas.
package poo1;

import java.util.Scanner;
import poo1.entidades.Libro;

public class Poo1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese el titulo del libro, el ISBN, el autor y el numero de paginas: ");

//titulo,  ISBN,  autor,  numeropaginas//

        Libro libro1 = new Libro(teclado.next(),teclado.nextLong(), teclado.next(), teclado.nextInt());

        System.out.println(libro1.toString());
    }

}
