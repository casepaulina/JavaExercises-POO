
package Ejer2;


import javax.swing.JOptionPane;

public class Circunferencia {
      //atributo
    private double radio;
    private double area;
    private double perimetro;
    
    
    //Metodo vacio
    public Circunferencia() {
       
    }

    //Metodo constructor
    public Circunferencia(double radio) {

        this.radio = radio;

    }
    
   
    //metodo get and set
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    //metodo crearCircunferencia():
    public void crearCircunferencia() {
        
        radio=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el radio: "));  
       
    }

    //metodo area():
    public void area() {

      
        area = 3.1416 * Math.pow(radio, 2);

    }

    //metodo perimetro():
    public void perimetro() {

       perimetro = 2 * Math.PI * radio;

    }
    
    
    //metodo mostrar resultado
    
    public void mostrar(){
       
    
    System.out.println("El area es: "+area);
     System.out.println("El perimetro es: "+perimetro);
    
    }
}
