package Ejer4;

import javax.swing.JOptionPane;

public class Rectangulo {

    //Atributos
    private int base;
    private int altura;
    private int superficie;
    private int perimetro;
    static int i = 0;
    static int j = 0;

    //metodo  crearRectangulo
    public void crearRectangulo() {

        base = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base del rectangulo "));
        altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura del rectangulo: "));

    }

    //metodo superficie()
    public void Superficie() {

        superficie = base * altura;
    }

    //metodo perimetro()
    public void Perimetro() {
        perimetro = (base + altura) * 2;
    }

    //metodo dibujar()
    public void dibujar() {

        while (i < altura) {
            while (j < base) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            j = 0;
            i++;

        }

    }

    //metodo mostrar()
    public void mostrar() {

        System.out.println("Superficie: " + superficie);
        System.out.println("Perimetro: " + perimetro);

    }

    //metodo get y set
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public int getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
    }

}
