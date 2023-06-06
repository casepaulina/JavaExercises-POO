package Ejer6;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        Cafetera cafe = new Cafetera();

        cafe.Cafetera(0, 0);

        int opcion;
        int opcionTaza;

        opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido, elija una opcion \n "
                + "1. Servir un cafe \n"
                + "2. Vaciar cafetera\n"
                + "3. Agregar cafe\n"
                + "4. salir"));

        switch (opcion) {
            case 1:
                cafe.servirTaza();
                break;
            case 2:
                cafe.variarCafetera();
                break;
            case 3:
                cafe.agregarCafe(opcion);
                break;
            case 4:
                break;

           

        }

    }

}
