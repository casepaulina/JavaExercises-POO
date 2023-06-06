package Ejer5;

import javax.swing.JOptionPane;

public class Cuenta {

    //Atributos
    private int numeroCuenta;
    private long Dni;
    int Saldo = 1000;
    private double Ingresar;
    private double Retirar;
    int opcion;

    //Metodo constructor vacio
    public void Cuenta() {
    }

    //Metodo constructor con parametros
    public void Cuenta(long Dni, int numeroCuenta, int Saldo) {
    }

    //metodo crearCuenta()
    public void crearCuenta() {

        Dni = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su DNI: "));
        numeroCuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero de cuenta: "));
        Saldo = 1000;
    }

    //Metodos get y set
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getDni() {
        return Dni;
    }

    public void setDni(long Dni) {
        this.Dni = Dni;
    }

    public int getSaldo() {
        return Saldo;
    }

    public void setSaldo(int Saldo) {
        this.Saldo = Saldo;
    }

    //Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar y se la sumara a saldo actual.
    public double Ingresar() {

        Ingresar = Integer.parseInt(JOptionPane.showInputDialog("Cuanto dinero desea ingresar?: "));

        Ingresar = Ingresar + Saldo;

        JOptionPane.showMessageDialog(null, "Su saldo es de " + Ingresar);

        return 0;
    }

//Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
//se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
//pondrá el saldo actual en 0.
    public double Retirar() {

        Retirar = Integer.parseInt(JOptionPane.showInputDialog("Indique cuanto desea retirar: "));

        if (Retirar > Saldo) {
            JOptionPane.showMessageDialog(null, "No cuenta con el saldo suficiente");
        }
        JOptionPane.showMessageDialog(null, "Su saldo es de " + Saldo);

        Retirar = Retirar - Saldo;
        return 0;
    }

//Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
//que el usuario no saque más del 20%.
    public void extraccionRapida() {

        int extraccionRapida = Integer.parseInt(JOptionPane.showInputDialog("Cuanto dinero desea sacar: "));

        if (extraccionRapida > 0.2 * Saldo) {

            JOptionPane.showMessageDialog(null, "Saldo insuficiente");
        } else {

            extraccionRapida = Saldo - extraccionRapida;
            JOptionPane.showMessageDialog(null, "Extraccion realizada con exito, su saldo actual es: " + extraccionRapida);

        }

    }

    //Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
    public void consultarSaldo() {

        JOptionPane.showMessageDialog(null, "Su saldo actual es: " + Saldo);
    }

//Método consultarDatos(): permitirá mostrar todos los datos de la cuenta

    public void consultarDatos() {
        
          JOptionPane.showMessageDialog(null, "Su numero de cuenta es " + numeroCuenta +"\n Su DNI es"+ Dni );
        
    }

}
