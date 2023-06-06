/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer5;

import javax.swing.JOptionPane;

public class Main {
    
     public static void main(String[] args) {
         
         
         Cuenta cajero = new Cuenta();
         
         cajero.crearCuenta();
    
  int opcion;
  
  opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a su cajero automatico\n "
  +"1. Ingresar dinero \n"
  +"2. Retirar dinero\n"
  +"3. Extracion rapida\n"
  +"4. Consultar saldo\n"
  +"5. Consultar datos\n"
  +"6. Salir"));
     
    switch(opcion){
        case 1 : cajero.Ingresar() ;
        break;
        case 2 : cajero.Retirar();
         break;
        case 3 : cajero.extraccionRapida();
         break;
        case 4 : cajero.consultarSaldo();
         break;
        case 5 : cajero.consultarDatos();
         break;
        case 6 : break;
     
     }
      
      
      
     }
}
