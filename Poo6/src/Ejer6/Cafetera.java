package Ejer6;

import javax.swing.JOptionPane;

public class Cafetera {

    //Atributos
    private int capacidadMaxima = 100;
    private int cantidadActual = 100;
    int taza = 30;

    //metodo vacio
    public Cafetera() {
    }

    //metodo cafetera con parametros
    public void Cafetera(int capacidadMaxima, int cantidadActual) {
        
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
        this.taza = taza;
    }

    //Metodos get y set
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    //Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
    public void llenarCafetera() {

        cantidadActual = capacidadMaxima;
    }

    //Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
//tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
//cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
//método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
//cuanto quedó la taza.
    public void servirTaza() {

        
    }

    //Método vaciarCafetera(): pone la cantidad de café actual en cero.
    public void variarCafetera() {

        cantidadActual = 0;

        JOptionPane.showMessageDialog(null, " Su cafetera esta vacia");

    }

    //Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
//recibe y se añade a la cafetera la cantidad de café indicada.
    public void agregarCafe(int cantidad) {

        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cuanto cafe desea agregar?  "));

        cantidadActual = cantidad + cantidadActual;

        JOptionPane.showMessageDialog(null, "La cantidad de cafe es " + cantidadActual);

    }
}
