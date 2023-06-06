//Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
//String) y su longitud. 
package Ejer8;

public class Cadena {

    //Atributo
    private String frase;
    private int longitud;
    
    
    //Metodo vacio
    
    public Cadena(){

}
    
    //Metodo constructor
    
     public Cadena(String frase){
         
         this.frase=frase;

         this.longitud=longitud;
}

    //Metodo set y get
    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    //  Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
    public void mostrarVocales() {

        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {

            if (frase.charAt(i) == 'a'
                    || frase.charAt(i) == 'e'
                    || frase.charAt(i) == 'i'
                    || frase.charAt(i) == 'o'
                    || frase.charAt(i) == 'u') {
                contador++;
            }
        }

        System.out.println("Hay " + contador + " vocales");

    }

    //Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
//Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    public void invertirFrase() {

    }

    //Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario
//y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
//Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.   
    public void vecesRepetido(String letra) {

    }

    //Método compararLongitud(String frase), deberá comparar la longitud de la frase
//que compone la clase con otra nueva frase ingresada por el usuario.  
    public void compararLongitud(String frase) {

    }

    //Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
//con una nueva frase ingresada por el usuario y mostrar la frase resultante
    public void unirFrases(String frase) {

    }

    //Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
//encuentren en la frase, por algún otro carácter seleccionado por el usuario y
//mostrar la frase resultante.
    public void reemplazar(String letra) {

    }

    //Método contiene(String letra), deberá comprobar si la frase contiene una letra que
//ingresa el usuario y devuelve verdadero si la contiene y falso si no.
    public void contiene(String letra) {

    }

}
