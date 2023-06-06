
package Ejer3;

import javax.swing.JOptionPane;

public class Operacion {
    
    //Atributos
    private int numero1;
    private int numero2;
    private int sumar;
    private int restar;
    private int multiplicar;
    private int dividir;
    
   //Metodo constructor con atributos pasados por parametro
    
    public Operacion(int numero1, int numero2, int sumar, int restar, int multiplicar, int dividir){
    }
    
    //Metodo constructor vacio
    
    public Operacion(){
    }
    
    //Metodo get y set

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    //Metodo para crearOperacion()
    
    public void crearOperacion(){
        
        numero1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 1: "));  
        numero2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 2: "));
        
    }
   
    //Metodo suma()
    
    public void sumar(){
    
        sumar = numero1 + numero2;
    }
    
    //Metodo restar()
    
     public void restar(){
     
         restar=numero1 - numero2;
         
     }
     
     //Metodo multiplicar()
     
     public void multiplicar(){
     
         multiplicar = numero1 * numero2;
         
     }
             
    //Metodo dividir()
     
     public void dividir(){
     
         dividir = numero1 / numero2;
         
     }
     
     
     //metodo mostrar
     public void mostrar(){
     System.out.println("Suma: "+sumar);
     System.out.println("Resta: "+restar);
     System.out.println("Multiplicacion: "+multiplicar);
     System.out.println("Division: "+dividir);
     
     }
}
